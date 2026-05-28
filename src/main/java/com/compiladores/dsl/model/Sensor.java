package com.compiladores.dsl.model;

public class Sensor {

    private String nombre;
    private Integer valor;

    public Sensor(
            String nombre,
            Integer valor
    ) {

        this.nombre = nombre;
        this.valor = valor;

    }

    public String getNombre() {
        return nombre;
    }

    public Integer getValor() {
        return valor;
    }

}