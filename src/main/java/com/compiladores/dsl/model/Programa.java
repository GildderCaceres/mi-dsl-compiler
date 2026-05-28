package com.compiladores.dsl.model;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    private final List<Object> instrucciones = new ArrayList<>();

    public void agregar(Object objeto) {
        instrucciones.add(objeto);
    }

    public List<Object> getInstrucciones() {
        return instrucciones;
    }
}