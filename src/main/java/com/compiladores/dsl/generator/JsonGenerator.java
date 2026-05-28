package com.compiladores.dsl.generator;

import com.compiladores.dsl.*;
import com.compiladores.dsl.model.*;

public class JsonGenerator extends MiDSLBaseListener {

    private final Programa programa = new Programa();

    public Programa getPrograma() {
        return programa;
    }

    @Override
    public void enterMaquinaDeclaracion(MiDSLParser.MaquinaDeclaracionContext ctx) {
        programa.agregar(new Maquina(ctx.ID().getText()));
    }

    @Override
    public void enterSensorDeclaracion(MiDSLParser.SensorDeclaracionContext ctx) {
        programa.agregar(
                new Sensor(
                        ctx.ID().getText(),
                        Integer.parseInt(ctx.NUMBER().getText())
                )
        );
    }

    @Override
    public void enterAccionMaquina(MiDSLParser.AccionMaquinaContext ctx) {

        if (ctx.getParent() instanceof MiDSLParser.CondicionContext) {
            return;
        }

        programa.agregar(
                new Accion(
                        ctx.accion().getText(),
                        ctx.ID().getText()
                )
        );
    }

    @Override
    public void enterCondicion(MiDSLParser.CondicionContext ctx) {

        MiDSLParser.AccionMaquinaContext accionCtx = ctx.accionMaquina();

        programa.agregar(
                new Condicion(
                        ctx.ID().getText(),
                        ">",
                        Integer.parseInt(ctx.NUMBER().getText()),
                        accionCtx.accion().getText(),
                        accionCtx.ID().getText()
                )
        );
    }
}