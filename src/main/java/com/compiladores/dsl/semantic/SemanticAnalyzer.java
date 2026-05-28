package com.compiladores.dsl.semantic;

import com.compiladores.dsl.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SemanticAnalyzer extends MiDSLBaseListener {

    private final Set<String> maquinas = new HashSet<>();
    private final Set<String> sensores = new HashSet<>();
    private final List<String> errores = new ArrayList<>();

    public List<String> getErrores() {
        return errores;
    }

    @Override
    public void enterMaquinaDeclaracion(MiDSLParser.MaquinaDeclaracionContext ctx) {
        String nombreMaquina = ctx.ID().getText();

        if (maquinas.contains(nombreMaquina)) {
            errores.add("ERROR SEMÁNTICO: Máquina duplicada -> " + nombreMaquina);
        } else {
            maquinas.add(nombreMaquina);
        }
    }

    @Override
    public void enterSensorDeclaracion(MiDSLParser.SensorDeclaracionContext ctx) {
        String nombreSensor = ctx.ID().getText();

        if (sensores.contains(nombreSensor)) {
            errores.add("ERROR SEMÁNTICO: Sensor duplicado -> " + nombreSensor);
        } else {
            sensores.add(nombreSensor);
        }
    }

    @Override
    public void enterCondicion(MiDSLParser.CondicionContext ctx) {
        String sensorUsado = ctx.ID().getText();

        if (!sensores.contains(sensorUsado)) {
            errores.add("ERROR SEMÁNTICO: Sensor no declarado -> " + sensorUsado);
        }
    }

    @Override
    public void enterAccionMaquina(MiDSLParser.AccionMaquinaContext ctx) {
        String nombreMaquina = ctx.ID().getText();

        if (!maquinas.contains(nombreMaquina)) {
            errores.add("ERROR SEMÁNTICO: Máquina no declarada -> " + nombreMaquina);
        }
    }
}