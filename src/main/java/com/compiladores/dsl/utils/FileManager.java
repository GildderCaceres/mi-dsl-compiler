package com.compiladores.dsl.utils;

import com.compiladores.dsl.model.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

        public static void guardarJSON(Programa programa) {

                try {
                        String json = convertirProgramaAJSON(programa);

                        Files.writeString(
                                        Paths.get("output/salida.json"),
                                        json);

                } catch (Exception e) {
                        System.out.println("Error al guardar JSON:");
                        System.out.println(e.getMessage());
                }
        }

        private static String convertirAJson(Object item) {

                if (item instanceof Maquina maquina) {
                        return """
                                        {
                                        "tipo": "maquina",
                                        "nombre": "%s"
                                        }""".formatted(
                                        maquina.getNombre());
                }

                if (item instanceof Sensor sensor) {
                        return """
                                        {
                                        "tipo": "sensor",
                                        "nombre": "%s",
                                        "valor": %d
                                        }""".formatted(
                                        sensor.getNombre(),
                                        sensor.getValor());
                }

                if (item instanceof Accion accion) {
                        return """
                                        {
                                        "tipo": "accion",
                                        "accion": "%s",
                                        "maquina": "%s"
                                        }""".formatted(
                                        accion.getAccion(),
                                        accion.getMaquina());
                }

                if (item instanceof Condicion condicion) {
                        return """
                                        {
                                        "tipo": "condicion",
                                        "sensor": "%s",
                                        "operador": "%s",
                                        "valor": %d,
                                        "entonces": {
                                        "accion": "%s",
                                        "maquina": "%s"
                                        }
                                        }""".formatted(
                                        condicion.getSensor(),
                                        condicion.getOperador(),
                                        condicion.getValor(),
                                        condicion.getAccion(),
                                        condicion.getMaquina());
                }

                return """
                                {
                                "tipo": "desconocido"
                                }""";
        }

        public static String convertirProgramaAJSON(Programa programa) {

                StringBuilder json = new StringBuilder();

                json.append("{\n");
                json.append("  \"instrucciones\": [\n");

                for (int i = 0; i < programa.getInstrucciones().size(); i++) {
                        Object item = programa.getInstrucciones().get(i);

                        json.append(convertirAJson(item));

                        if (i < programa.getInstrucciones().size() - 1) {
                                json.append(",");
                        }

                        json.append("\n");
                }

                json.append("  ]\n");
                json.append("}");

                return json.toString();
        }
}