// Generated from com/compiladores/dsl/MiDSL.g4 by ANTLR 4.13.1
package com.compiladores.dsl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiDSLParser}.
 */
public interface MiDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiDSLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiDSLParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiDSLParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiDSLParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#maquinaDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterMaquinaDeclaracion(MiDSLParser.MaquinaDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#maquinaDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitMaquinaDeclaracion(MiDSLParser.MaquinaDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#sensorDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterSensorDeclaracion(MiDSLParser.SensorDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#sensorDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitSensorDeclaracion(MiDSLParser.SensorDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#accionMaquina}.
	 * @param ctx the parse tree
	 */
	void enterAccionMaquina(MiDSLParser.AccionMaquinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#accionMaquina}.
	 * @param ctx the parse tree
	 */
	void exitAccionMaquina(MiDSLParser.AccionMaquinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(MiDSLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(MiDSLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiDSLParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(MiDSLParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiDSLParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(MiDSLParser.AccionContext ctx);
}