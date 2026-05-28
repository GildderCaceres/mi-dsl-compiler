package com.compiladores.dsl;

import com.compiladores.dsl.generator.JsonGenerator;
import com.compiladores.dsl.semantic.SemanticAnalyzer;
import com.compiladores.dsl.utils.FileManager;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {

        try {
            String codigoFuente = Files.readString(
                    Paths.get("scripts/ejemplo.dsl"));

            CharStream input = CharStreams.fromString(codigoFuente);
            MiDSLLexer lexer = new MiDSLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiDSLParser parser = new MiDSLParser(tokens);

            ParseTree tree = parser.programa();

            System.out.println("Código válido");
            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();

            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            walker.walk(semanticAnalyzer, tree);

            if (semanticAnalyzer.getErrores().isEmpty()) {

                System.out.println("Análisis semántico correcto");

                JsonGenerator generator = new JsonGenerator();
                walker.walk(generator, tree);

                FileManager.guardarJSON(
                        generator.getPrograma());

                System.out.println();
                System.out.println("Archivo generado:");
                System.out.println("output/salida.json");

            } else {

                System.out.println("Errores semánticos encontrados:");
                semanticAnalyzer.getErrores().forEach(System.out::println);

            }

        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());
        }
    }
}