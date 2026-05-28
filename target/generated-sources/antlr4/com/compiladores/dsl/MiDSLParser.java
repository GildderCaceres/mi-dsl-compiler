// Generated from com/compiladores/dsl/MiDSL.g4 by ANTLR 4.13.1
package com.compiladores.dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAQUINA=1, SENSOR=2, SI=3, ENTONCES=4, INICIAR=5, DETENER=6, MAYOR=7, 
		IGUAL=8, PUNTO_COMA=9, NUMBER=10, ID=11, WS=12;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_maquinaDeclaracion = 2, 
		RULE_sensorDeclaracion = 3, RULE_accionMaquina = 4, RULE_condicion = 5, 
		RULE_accion = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "maquinaDeclaracion", "sensorDeclaracion", 
			"accionMaquina", "condicion", "accion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'maquina'", "'sensor'", "'si'", "'entonces'", "'iniciar'", "'detener'", 
			"'>'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAQUINA", "SENSOR", "SI", "ENTONCES", "INICIAR", "DETENER", "MAYOR", 
			"IGUAL", "PUNTO_COMA", "NUMBER", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiDSLParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 110L) != 0)) {
				{
				{
				setState(14);
				instruccion();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public MaquinaDeclaracionContext maquinaDeclaracion() {
			return getRuleContext(MaquinaDeclaracionContext.class,0);
		}
		public SensorDeclaracionContext sensorDeclaracion() {
			return getRuleContext(SensorDeclaracionContext.class,0);
		}
		public AccionMaquinaContext accionMaquina() {
			return getRuleContext(AccionMaquinaContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAQUINA:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				maquinaDeclaracion();
				}
				break;
			case SENSOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				sensorDeclaracion();
				}
				break;
			case INICIAR:
			case DETENER:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				accionMaquina();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				condicion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaquinaDeclaracionContext extends ParserRuleContext {
		public TerminalNode MAQUINA() { return getToken(MiDSLParser.MAQUINA, 0); }
		public TerminalNode ID() { return getToken(MiDSLParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(MiDSLParser.PUNTO_COMA, 0); }
		public MaquinaDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maquinaDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterMaquinaDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitMaquinaDeclaracion(this);
		}
	}

	public final MaquinaDeclaracionContext maquinaDeclaracion() throws RecognitionException {
		MaquinaDeclaracionContext _localctx = new MaquinaDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maquinaDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(MAQUINA);
			setState(29);
			match(ID);
			setState(30);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SensorDeclaracionContext extends ParserRuleContext {
		public TerminalNode SENSOR() { return getToken(MiDSLParser.SENSOR, 0); }
		public TerminalNode ID() { return getToken(MiDSLParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MiDSLParser.IGUAL, 0); }
		public TerminalNode NUMBER() { return getToken(MiDSLParser.NUMBER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(MiDSLParser.PUNTO_COMA, 0); }
		public SensorDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensorDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterSensorDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitSensorDeclaracion(this);
		}
	}

	public final SensorDeclaracionContext sensorDeclaracion() throws RecognitionException {
		SensorDeclaracionContext _localctx = new SensorDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sensorDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(SENSOR);
			setState(33);
			match(ID);
			setState(34);
			match(IGUAL);
			setState(35);
			match(NUMBER);
			setState(36);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccionMaquinaContext extends ParserRuleContext {
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiDSLParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(MiDSLParser.PUNTO_COMA, 0); }
		public AccionMaquinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accionMaquina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterAccionMaquina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitAccionMaquina(this);
		}
	}

	public final AccionMaquinaContext accionMaquina() throws RecognitionException {
		AccionMaquinaContext _localctx = new AccionMaquinaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accionMaquina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			accion();
			setState(39);
			match(ID);
			setState(40);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(MiDSLParser.SI, 0); }
		public TerminalNode ID() { return getToken(MiDSLParser.ID, 0); }
		public TerminalNode MAYOR() { return getToken(MiDSLParser.MAYOR, 0); }
		public TerminalNode NUMBER() { return getToken(MiDSLParser.NUMBER, 0); }
		public TerminalNode ENTONCES() { return getToken(MiDSLParser.ENTONCES, 0); }
		public AccionMaquinaContext accionMaquina() {
			return getRuleContext(AccionMaquinaContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(SI);
			setState(43);
			match(ID);
			setState(44);
			match(MAYOR);
			setState(45);
			match(NUMBER);
			setState(46);
			match(ENTONCES);
			setState(47);
			accionMaquina();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public TerminalNode INICIAR() { return getToken(MiDSLParser.INICIAR, 0); }
		public TerminalNode DETENER() { return getToken(MiDSLParser.DETENER, 0); }
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiDSLListener ) ((MiDSLListener)listener).exitAccion(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==INICIAR || _la==DETENER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\u0005\u0006"+
		"0\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000"+
		"\u0004\u001c\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b"+
		"&\u0001\u0000\u0000\u0000\n*\u0001\u0000\u0000\u0000\f1\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000"+
		"\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u001b\u0003\u0004\u0002"+
		"\u0000\u0017\u001b\u0003\u0006\u0003\u0000\u0018\u001b\u0003\b\u0004\u0000"+
		"\u0019\u001b\u0003\n\u0005\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005\u000b\u0000\u0000\u001e"+
		"\u001f\u0005\t\u0000\u0000\u001f\u0005\u0001\u0000\u0000\u0000 !\u0005"+
		"\u0002\u0000\u0000!\"\u0005\u000b\u0000\u0000\"#\u0005\b\u0000\u0000#"+
		"$\u0005\n\u0000\u0000$%\u0005\t\u0000\u0000%\u0007\u0001\u0000\u0000\u0000"+
		"&\'\u0003\f\u0006\u0000\'(\u0005\u000b\u0000\u0000()\u0005\t\u0000\u0000"+
		")\t\u0001\u0000\u0000\u0000*+\u0005\u0003\u0000\u0000+,\u0005\u000b\u0000"+
		"\u0000,-\u0005\u0007\u0000\u0000-.\u0005\n\u0000\u0000./\u0005\u0004\u0000"+
		"\u0000/0\u0003\b\u0004\u00000\u000b\u0001\u0000\u0000\u000012\u0007\u0000"+
		"\u0000\u00002\r\u0001\u0000\u0000\u0000\u0002\u0011\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}