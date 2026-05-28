package com.compiladores.dsl.model;

public class Condicion {

    private String sensor;
    private String operador;
    private Integer valor;
    private String accion;
    private String maquina;

    public Condicion(String sensor, String operador, Integer valor, String accion, String maquina) {
        this.sensor = sensor;
        this.operador = operador;
        this.valor = valor;
        this.accion = accion;
        this.maquina = maquina;
    }

    public String getSensor() {
        return sensor;
    }

    public String getOperador() {
        return operador;
    }

    public Integer getValor() {
        return valor;
    }

    public String getAccion() {
        return accion;
    }

    public String getMaquina() {
        return maquina;
    }
}