package com.compiladores.dsl.utils;

import com.compiladores.dsl.model.Programa;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public static void guardarJSON(
            Programa programa
    ) {

        try {

            StringBuilder json =
                    new StringBuilder();

            json.append("{\n");
            json.append("  \"instrucciones\": [\n");

            for (
                    int i = 0;
                    i < programa.getInstrucciones().size();
                    i++
            ) {

                Object item =
                        programa.getInstrucciones().get(i);

                json.append("    \"");

                json.append(
                        item
                        .getClass()
                        .getSimpleName()
                );

                json.append("\"");

                if (
                        i <
                        programa
                        .getInstrucciones()
                        .size() - 1
                ) {

                    json.append(",");

                }

                json.append("\n");

            }

            json.append("  ]\n");
            json.append("}");

            Files.writeString(

                    Paths.get(
                            "output/salida.json"
                    ),

                    json.toString()

            );

        } catch (
                Exception e
        ) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}