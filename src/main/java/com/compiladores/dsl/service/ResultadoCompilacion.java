package com.compiladores.dsl.service;

import java.util.ArrayList;
import java.util.List;

public class ResultadoCompilacion {

    private boolean exitoso;
    private String jsonGenerado;
    private String arbolSintactico;
    private List<String> errores = new ArrayList<>();

    public boolean isExitoso() {
        return exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }

    public String getJsonGenerado() {
        return jsonGenerado;
    }

    public void setJsonGenerado(String jsonGenerado) {
        this.jsonGenerado = jsonGenerado;
    }

    public String getArbolSintactico() {
        return arbolSintactico;
    }

    public void setArbolSintactico(String arbolSintactico) {
        this.arbolSintactico = arbolSintactico;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setErrores(List<String> errores) {
        this.errores = errores;
    }
}