package com.compiladores.dsl.model;

public class Accion {

    private String accion;
    private String maquina;

    public Accion(
            String accion,
            String maquina
    ) {

        this.accion = accion;
        this.maquina = maquina;

    }

    public String getAccion() {
        return accion;
    }

    public String getMaquina() {
        return maquina;
    }

}