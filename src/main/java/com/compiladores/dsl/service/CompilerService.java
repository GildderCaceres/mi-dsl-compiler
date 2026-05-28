package com.compiladores.dsl.service;

import com.compiladores.dsl.*;
import com.compiladores.dsl.generator.JsonGenerator;
import com.compiladores.dsl.semantic.SemanticAnalyzer;
import com.compiladores.dsl.utils.FileManager;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CompilerService {

    public static void compilarDesdeArchivo(String rutaArchivo) throws Exception {

        String codigoFuente = Files.readString(
                Paths.get(rutaArchivo)
        );

        compilarDesdeTexto(codigoFuente);
    }

    public static ResultadoCompilacion compilarDesdeTexto(String codigoFuente) {

        ResultadoCompilacion resultado =
                new ResultadoCompilacion();

        try {
            CharStream input =
                    CharStreams.fromString(codigoFuente);

            MiDSLLexer lexer =
                    new MiDSLLexer(input);

            CommonTokenStream tokens =
                    new CommonTokenStream(lexer);

            MiDSLParser parser =
                    new MiDSLParser(tokens);

            ParseTree tree =
                    parser.programa();

            resultado.setArbolSintactico(
                    tree.toStringTree(parser)
            );

            ParseTreeWalker walker =
                    new ParseTreeWalker();

            SemanticAnalyzer semanticAnalyzer =
                    new SemanticAnalyzer();

            walker.walk(
                    semanticAnalyzer,
                    tree
            );

            if (!semanticAnalyzer.getErrores().isEmpty()) {

                resultado.setExitoso(false);
                resultado.setErrores(
                        semanticAnalyzer.getErrores()
                );

                return resultado;
            }

            JsonGenerator generator =
                    new JsonGenerator();

            walker.walk(
                    generator,
                    tree
            );

            String json =
                    FileManager.convertirProgramaAJSON(
                            generator.getPrograma()
                    );

            resultado.setExitoso(true);
            resultado.setJsonGenerado(json);

        } catch (Exception e) {

            resultado.setExitoso(false);
            resultado.setErrores(
                    List.of(
                            "ERROR GENERAL: " + e.getMessage()
                    )
            );

        }

        return resultado;
    }
}