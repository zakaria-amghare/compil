// Generated from /home/zakaria/Desktop/Work_Space/compile_mini_ING/bin/antlr/Grammaire1.g4 by ANTLR 4.13.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Grammaire1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, VAR_GLOBAL=15, TYPE=16, 
		IFSTATEMENT=17, ELSEFSTATEMENT=18, FORSTATMENT=19, OPRATEUR_LOGIQUE=20, 
		OPRATEUR_ARETHMETIC1=21, OPRATEUR_ARETHMETIC2=22, OPRATEUR_COMPARAISON=23, 
		INT=24, FLOAT=25, CHAR=26, MOTS=27, ID=28, PVG=29, WS=30;
	public static final int
		RULE_start = 0, RULE_var_global = 1, RULE_var_expression = 2, RULE_id_variable = 3, 
		RULE_tableau = 4, RULE_declaration = 5, RULE_declaration_expression = 6, 
		RULE_const = 7, RULE_instruction = 8, RULE_instruction_expression = 9, 
		RULE_affectation = 10, RULE_expr = 11, RULE_if = 12, RULE_condition_simple = 13, 
		RULE_condition = 14, RULE_boucle = 15, RULE_fonction = 16, RULE_write = 17, 
		RULE_read = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "var_global", "var_expression", "id_variable", "tableau", "declaration", 
			"declaration_expression", "const", "instruction", "instruction_expression", 
			"affectation", "expr", "if", "condition_simple", "condition", "boucle", 
			"fonction", "write", "read"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "'['", "']'", "'DECLARATION'", "'CONST'", 
			"'='", "'INSTRACTION'", "'('", "')'", "':'", "'write('", "'read('", "'VAR_GLOBAL'", 
			null, "'IF'", "'ELSE'", "'FOR'", null, null, null, null, null, null, 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VAR_GLOBAL", "TYPE", "IFSTATEMENT", "ELSEFSTATEMENT", 
			"FORSTATMENT", "OPRATEUR_LOGIQUE", "OPRATEUR_ARETHMETIC1", "OPRATEUR_ARETHMETIC2", 
			"OPRATEUR_COMPARAISON", "INT", "FLOAT", "CHAR", "MOTS", "ID", "PVG", 
			"WS"
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
	public String getGrammarFileName() { return "Grammaire1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Grammaire1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public Var_globalContext var_global() {
			return getRuleContext(Var_globalContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Grammaire1Parser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			var_global();
			setState(39);
			declaration();
			setState(40);
			instruction();
			setState(41);
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
	public static class Var_globalContext extends ParserRuleContext {
		public TerminalNode VAR_GLOBAL() { return getToken(Grammaire1Parser.VAR_GLOBAL, 0); }
		public List<Var_expressionContext> var_expression() {
			return getRuleContexts(Var_expressionContext.class);
		}
		public Var_expressionContext var_expression(int i) {
			return getRuleContext(Var_expressionContext.class,i);
		}
		public Var_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterVar_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitVar_global(this);
		}
	}

	public final Var_globalContext var_global() throws RecognitionException {
		Var_globalContext _localctx = new Var_globalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(VAR_GLOBAL);
			setState(44);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(45);
				var_expression();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__1);
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
	public static class Var_expressionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Grammaire1Parser.TYPE, 0); }
		public List<Id_variableContext> id_variable() {
			return getRuleContexts(Id_variableContext.class);
		}
		public Id_variableContext id_variable(int i) {
			return getRuleContext(Id_variableContext.class,i);
		}
		public TerminalNode PVG() { return getToken(Grammaire1Parser.PVG, 0); }
		public Var_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterVar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitVar_expression(this);
		}
	}

	public final Var_expressionContext var_expression() throws RecognitionException {
		Var_expressionContext _localctx = new Var_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TYPE);
			setState(54);
			id_variable();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(55);
				match(T__2);
				setState(56);
				id_variable();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(PVG);
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
	public static class Id_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Grammaire1Parser.ID, 0); }
		public TableauContext tableau() {
			return getRuleContext(TableauContext.class,0);
		}
		public Id_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterId_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitId_variable(this);
		}
	}

	public final Id_variableContext id_variable() throws RecognitionException {
		Id_variableContext _localctx = new Id_variableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				tableau();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableauContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Grammaire1Parser.INT, 0); }
		public TableauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableau; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitTableau(this);
		}
	}

	public final TableauContext tableau() throws RecognitionException {
		TableauContext _localctx = new TableauContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__3);
			setState(69);
			match(INT);
			setState(70);
			match(T__4);
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
	public static class DeclarationContext extends ParserRuleContext {
		public List<Declaration_expressionContext> declaration_expression() {
			return getRuleContexts(Declaration_expressionContext.class);
		}
		public Declaration_expressionContext declaration_expression(int i) {
			return getRuleContext(Declaration_expressionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__5);
			setState(73);
			match(T__0);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==TYPE) {
				{
				{
				setState(74);
				declaration_expression();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__1);
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
	public static class Declaration_expressionContext extends ParserRuleContext {
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public Var_expressionContext var_expression() {
			return getRuleContext(Var_expressionContext.class,0);
		}
		public Declaration_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterDeclaration_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitDeclaration_expression(this);
		}
	}

	public final Declaration_expressionContext declaration_expression() throws RecognitionException {
		Declaration_expressionContext _localctx = new Declaration_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration_expression);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				const_();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				var_expression();
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
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Grammaire1Parser.TYPE, 0); }
		public TerminalNode ID() { return getToken(Grammaire1Parser.ID, 0); }
		public TerminalNode PVG() { return getToken(Grammaire1Parser.PVG, 0); }
		public TerminalNode INT() { return getToken(Grammaire1Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Grammaire1Parser.FLOAT, 0); }
		public TerminalNode MOTS() { return getToken(Grammaire1Parser.MOTS, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitConst(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__6);
			setState(87);
			match(TYPE);
			setState(88);
			match(ID);
			setState(89);
			match(T__7);
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 184549376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(91);
			match(PVG);
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
	public static class InstructionContext extends ParserRuleContext {
		public List<Instruction_expressionContext> instruction_expression() {
			return getRuleContexts(Instruction_expressionContext.class);
		}
		public Instruction_expressionContext instruction_expression(int i) {
			return getRuleContext(Instruction_expressionContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__8);
			setState(94);
			match(T__0);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269115392L) != 0)) {
				{
				{
				setState(95);
				instruction_expression();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__1);
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
	public static class Instruction_expressionContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public FonctionContext fonction() {
			return getRuleContext(FonctionContext.class,0);
		}
		public Instruction_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterInstruction_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitInstruction_expression(this);
		}
	}

	public final Instruction_expressionContext instruction_expression() throws RecognitionException {
		Instruction_expressionContext _localctx = new Instruction_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction_expression);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				affectation();
				}
				break;
			case IFSTATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				if_();
				}
				break;
			case FORSTATMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				boucle();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				fonction();
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
	public static class AffectationContext extends ParserRuleContext {
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public TerminalNode PVG() { return getToken(Grammaire1Parser.PVG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(Grammaire1Parser.CHAR, 0); }
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitAffectation(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			id_variable();
			setState(110);
			match(T__7);
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case INT:
			case FLOAT:
			case ID:
				{
				setState(111);
				expr(0);
				}
				break;
			case CHAR:
				{
				setState(112);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			match(PVG);
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
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public TerminalNode INT() { return getToken(Grammaire1Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Grammaire1Parser.FLOAT, 0); }
		public TerminalNode OPRATEUR_ARETHMETIC1() { return getToken(Grammaire1Parser.OPRATEUR_ARETHMETIC1, 0); }
		public TerminalNode OPRATEUR_ARETHMETIC2() { return getToken(Grammaire1Parser.OPRATEUR_ARETHMETIC2, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(118);
				match(T__9);
				setState(119);
				expr(0);
				setState(120);
				match(T__10);
				}
				break;
			case ID:
				{
				setState(122);
				id_variable();
				}
				break;
			case INT:
				{
				setState(123);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(124);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(128);
						match(OPRATEUR_ARETHMETIC1);
						setState(129);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(131);
						match(OPRATEUR_ARETHMETIC2);
						setState(132);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IFSTATEMENT() { return getToken(Grammaire1Parser.IFSTATEMENT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<Instruction_expressionContext> instruction_expression() {
			return getRuleContexts(Instruction_expressionContext.class);
		}
		public Instruction_expressionContext instruction_expression(int i) {
			return getRuleContext(Instruction_expressionContext.class,i);
		}
		public List<TerminalNode> ELSEFSTATEMENT() { return getTokens(Grammaire1Parser.ELSEFSTATEMENT); }
		public TerminalNode ELSEFSTATEMENT(int i) {
			return getToken(Grammaire1Parser.ELSEFSTATEMENT, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IFSTATEMENT);
			setState(139);
			match(T__9);
			setState(140);
			condition();
			setState(141);
			match(T__10);
			setState(142);
			match(T__0);
			setState(143);
			instruction_expression();
			setState(144);
			match(T__1);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEFSTATEMENT) {
				{
				{
				setState(145);
				match(ELSEFSTATEMENT);
				setState(146);
				match(T__0);
				setState(147);
				instruction_expression();
				setState(148);
				match(T__1);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_simpleContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPRATEUR_COMPARAISON() { return getToken(Grammaire1Parser.OPRATEUR_COMPARAISON, 0); }
		public Condition_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterCondition_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitCondition_simple(this);
		}
	}

	public final Condition_simpleContext condition_simple() throws RecognitionException {
		Condition_simpleContext _localctx = new Condition_simpleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			expr(0);
			setState(156);
			match(OPRATEUR_COMPARAISON);
			setState(157);
			expr(0);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<Condition_simpleContext> condition_simple() {
			return getRuleContexts(Condition_simpleContext.class);
		}
		public Condition_simpleContext condition_simple(int i) {
			return getRuleContext(Condition_simpleContext.class,i);
		}
		public TerminalNode OPRATEUR_LOGIQUE() { return getToken(Grammaire1Parser.OPRATEUR_LOGIQUE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			condition_simple();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPRATEUR_LOGIQUE) {
				{
				setState(160);
				match(OPRATEUR_LOGIQUE);
				setState(161);
				condition_simple();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoucleContext extends ParserRuleContext {
		public TerminalNode FORSTATMENT() { return getToken(Grammaire1Parser.FORSTATMENT, 0); }
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(Grammaire1Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Grammaire1Parser.INT, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Instruction_expressionContext instruction_expression() {
			return getRuleContext(Instruction_expressionContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitBoucle(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FORSTATMENT);
			setState(165);
			match(T__9);
			setState(166);
			id_variable();
			setState(167);
			match(T__7);
			setState(168);
			match(INT);
			setState(169);
			match(T__11);
			setState(170);
			match(INT);
			setState(171);
			match(T__11);
			setState(172);
			expr(0);
			setState(173);
			match(T__10);
			setState(174);
			match(T__0);
			setState(175);
			instruction_expression();
			setState(176);
			match(T__1);
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
	public static class FonctionContext extends ParserRuleContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fonction);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				write();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				read();
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
	public static class WriteContext extends ParserRuleContext {
		public List<TerminalNode> MOTS() { return getTokens(Grammaire1Parser.MOTS); }
		public TerminalNode MOTS(int i) {
			return getToken(Grammaire1Parser.MOTS, i);
		}
		public TerminalNode PVG() { return getToken(Grammaire1Parser.PVG, 0); }
		public List<Id_variableContext> id_variable() {
			return getRuleContexts(Id_variableContext.class);
		}
		public Id_variableContext id_variable(int i) {
			return getRuleContext(Id_variableContext.class,i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__12);
			setState(183);
			match(MOTS);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(184);
				match(T__2);
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(185);
					id_variable();
					}
					break;
				case MOTS:
					{
					setState(186);
					match(MOTS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(T__10);
			setState(195);
			match(PVG);
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
	public static class ReadContext extends ParserRuleContext {
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public TerminalNode PVG() { return getToken(Grammaire1Parser.PVG, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammaire1Listener ) ((Grammaire1Listener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__13);
			setState(198);
			id_variable();
			setState(199);
			match(T__10);
			setState(200);
			match(PVG);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0005\ba\b\b\n\b\f\bd\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tl\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nr\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b~\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0086\b\u000b\n\u000b\f\u000b\u0089\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0097\b\f\n\f\f\f\u009a\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00a3\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00b5\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bc\b\u0011\u0005\u0011"+
		"\u00be\b\u0011\n\u0011\f\u0011\u00c1\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0001\u0016\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0002\u0000"+
		"\u0018\u0019\u001b\u001b\u00cb\u0000&\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000"+
		"\u0000\bD\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fT\u0001"+
		"\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000"+
		"\u0000\u0012k\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016"+
		"}\u0001\u0000\u0000\u0000\u0018\u008a\u0001\u0000\u0000\u0000\u001a\u009b"+
		"\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000\u0000\u0000\u001e\u00a4"+
		"\u0001\u0000\u0000\u0000 \u00b4\u0001\u0000\u0000\u0000\"\u00b6\u0001"+
		"\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001"+
		"\u0000\'(\u0003\n\u0005\u0000()\u0003\u0010\b\u0000)*\u0005\u0000\u0000"+
		"\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0005\u000f\u0000\u0000,0\u0005"+
		"\u0001\u0000\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000\u0000"+
		"/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0002"+
		"\u0000\u00004\u0003\u0001\u0000\u0000\u000056\u0005\u0010\u0000\u0000"+
		"6;\u0003\u0006\u0003\u000078\u0005\u0003\u0000\u00008:\u0003\u0006\u0003"+
		"\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>?\u0005\u001d\u0000\u0000?\u0005\u0001\u0000\u0000"+
		"\u0000@B\u0005\u001c\u0000\u0000AC\u0003\b\u0004\u0000BA\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0004\u0000\u0000EF\u0005\u0018\u0000\u0000FG\u0005\u0005\u0000\u0000"+
		"G\t\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IM\u0005\u0001\u0000"+
		"\u0000JL\u0003\f\u0006\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0002\u0000\u0000Q\u000b"+
		"\u0001\u0000\u0000\u0000RU\u0003\u000e\u0007\u0000SU\u0003\u0004\u0002"+
		"\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\r\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0005\u0010\u0000\u0000XY\u0005"+
		"\u001c\u0000\u0000YZ\u0005\b\u0000\u0000Z[\u0007\u0000\u0000\u0000[\\"+
		"\u0005\u001d\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005\t\u0000"+
		"\u0000^b\u0005\u0001\u0000\u0000_a\u0003\u0012\t\u0000`_\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005"+
		"\u0002\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gl\u0003\u0014\n\u0000"+
		"hl\u0003\u0018\f\u0000il\u0003\u001e\u000f\u0000jl\u0003 \u0010\u0000"+
		"kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0003"+
		"\u0006\u0003\u0000nq\u0005\b\u0000\u0000or\u0003\u0016\u000b\u0000pr\u0005"+
		"\u001a\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0005\u001d\u0000\u0000t\u0015\u0001\u0000"+
		"\u0000\u0000uv\u0006\u000b\uffff\uffff\u0000vw\u0005\n\u0000\u0000wx\u0003"+
		"\u0016\u000b\u0000xy\u0005\u000b\u0000\u0000y~\u0001\u0000\u0000\u0000"+
		"z~\u0003\u0006\u0003\u0000{~\u0005\u0018\u0000\u0000|~\u0005\u0019\u0000"+
		"\u0000}u\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0087\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\n\u0005\u0000\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081"+
		"\u0086\u0003\u0016\u000b\u0006\u0082\u0083\n\u0004\u0000\u0000\u0083\u0084"+
		"\u0005\u0016\u0000\u0000\u0084\u0086\u0003\u0016\u000b\u0005\u0085\u007f"+
		"\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b\u008c"+
		"\u0005\n\u0000\u0000\u008c\u008d\u0003\u001c\u000e\u0000\u008d\u008e\u0005"+
		"\u000b\u0000\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0090\u0003"+
		"\u0012\t\u0000\u0090\u0098\u0005\u0002\u0000\u0000\u0091\u0092\u0005\u0012"+
		"\u0000\u0000\u0092\u0093\u0005\u0001\u0000\u0000\u0093\u0094\u0003\u0012"+
		"\t\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0019\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u0005\u0017\u0000"+
		"\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e\u001b\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0003\u001a\r\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000"+
		"\u00a1\u00a3\u0003\u001a\r\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u001d\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0013\u0000\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7"+
		"\u0003\u0006\u0003\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0018\u0000\u0000\u00a9\u00aa\u0005\f\u0000\u0000\u00aa\u00ab\u0005\u0018"+
		"\u0000\u0000\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u00ad\u0003\u0016\u000b"+
		"\u0000\u00ad\u00ae\u0005\u000b\u0000\u0000\u00ae\u00af\u0005\u0001\u0000"+
		"\u0000\u00af\u00b0\u0003\u0012\t\u0000\u00b0\u00b1\u0005\u0002\u0000\u0000"+
		"\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b5\u0003\"\u0011\u0000\u00b3"+
		"\u00b5\u0003$\u0012\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5!\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\r\u0000\u0000\u00b7\u00bf\u0005\u001b\u0000\u0000\u00b8\u00bb\u0005\u0003"+
		"\u0000\u0000\u00b9\u00bc\u0003\u0006\u0003\u0000\u00ba\u00bc\u0005\u001b"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b8\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u000b"+
		"\u0000\u0000\u00c3\u00c4\u0005\u001d\u0000\u0000\u00c4#\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u000e\u0000\u0000\u00c6\u00c7\u0003\u0006\u0003"+
		"\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8\u00c9\u0005\u001d\u0000"+
		"\u0000\u00c9%\u0001\u0000\u0000\u0000\u00100;BMTbkq}\u0085\u0087\u0098"+
		"\u00a2\u00b4\u00bb\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}