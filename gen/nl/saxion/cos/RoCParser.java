// Generated from C:/Programe_si_chestii/Olanda/Saxion/Year 2/Compilers_OS/31/src\RoC.g4 by ANTLR 4.9.1
package nl.saxion.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAREN_OPEN=1, PAREN_CLOSE=2, CURLY_OPEN=3, CURLY_CLOSE=4, STR_OPEN=5, 
		STR_CLOSE=6, SEMICOLON=7, COLON=8, DOT=9, COMMA=10, QUOTES=11, PLUS=12, 
		MINUS=13, MULTIPLY=14, DIVIDE=15, MODULO=16, NUMBER_TYPE=17, STRING_TYPE=18, 
		BOOLEAN_TYPE=19, AUTO_TYPE=20, While=21, If=22, Else=23, Else_If=24, Execute=25, 
		For=26, Print=27, Return=28, Method=29, BOOLEAN=30, STRING=31, NUMBER=32, 
		AND=33, OR=34, GT=35, GE=36, LT=37, LE=38, EQ=39, NOT=40, NOT_EQ=41, EQUALS=42, 
		EQUALS_TO=43, COMMENT_LINE=44, IDENTIFIER=45, WS=46;
	public static final int
		RULE_program = 0, RULE_method_declaration = 1, RULE_argument_list = 2, 
		RULE_conditions = 3, RULE_logical_expr = 4, RULE_comparison_expr = 5, 
		RULE_statement_body = 6, RULE_arithmetic_expr = 7, RULE_decisionStatement = 8, 
		RULE_printStatement = 9, RULE_iterationStatement = 10, RULE_variable_declaration = 11, 
		RULE_varExpression = 12, RULE_comparator = 13, RULE_type = 14, RULE_type_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method_declaration", "argument_list", "conditions", "logical_expr", 
			"comparison_expr", "statement_body", "arithmetic_expr", "decisionStatement", 
			"printStatement", "iterationStatement", "variable_declaration", "varExpression", 
			"comparator", "type", "type_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "'.'", 
			"','", "'\"'", "'+'", "'-'", "'*'", "'/'", "'%'", "'numar'", "'sdc'", 
			"'bool'", "'automat'", "'cat timp'", "'daca'", "'altfel daca'", "'daca nu'", 
			"'executa'", "'pentru'", "'printeaza'", "'returneaza'", "'functia'", 
			null, null, null, "'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", "'='", 
			"'!'", "'!='", "'=='", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "STR_OPEN", 
			"STR_CLOSE", "SEMICOLON", "COLON", "DOT", "COMMA", "QUOTES", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "AUTO_TYPE", "While", "If", "Else", "Else_If", "Execute", 
			"For", "Print", "Return", "Method", "BOOLEAN", "STRING", "NUMBER", "AND", 
			"OR", "GT", "GE", "LT", "LE", "EQ", "NOT", "NOT_EQ", "EQUALS", "EQUALS_TO", 
			"COMMENT_LINE", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "RoC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RoCParser.EOF, 0); }
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Method) {
				{
				{
				setState(32);
				method_declaration();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	public static class Method_declarationContext extends ParserRuleContext {
		public Token methodName;
		public Statement_bodyContext body;
		public TerminalNode Method() { return getToken(RoCParser.Method, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> Return() { return getTokens(RoCParser.Return); }
		public TerminalNode Return(int i) {
			return getToken(RoCParser.Return, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(Method);
			setState(41);
			((Method_declarationContext)_localctx).methodName = match(IDENTIFIER);
			setState(42);
			match(PAREN_OPEN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE))) != 0)) {
				{
				setState(43);
				argument_list();
				}
			}

			setState(46);
			match(PAREN_CLOSE);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(47);
				match(Return);
				setState(48);
				type();
				}
			}

			setState(51);
			match(CURLY_OPEN);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				((Method_declarationContext)_localctx).body = statement_body();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE) | (1L << While) | (1L << If) | (1L << Execute) | (1L << For) | (1L << Print) | (1L << IDENTIFIER))) != 0) );
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(57);
				match(Return);
				setState(58);
				match(IDENTIFIER);
				}
			}

			setState(61);
			match(CURLY_CLOSE);
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

	public static class Argument_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RoCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RoCParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			type();
			setState(64);
			match(IDENTIFIER);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(65);
				match(COMMA);
				setState(66);
				type();
				setState(67);
				match(IDENTIFIER);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionsContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			logical_expr(0);
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

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionContext extends Logical_exprContext {
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public ComparisonExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionInParenContext extends Logical_exprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public LogicalExpressionInParenContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpressionInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpressionInParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpressionInParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionAndOrContext extends Logical_exprContext {
		public Logical_exprContext left;
		public Logical_exprContext right;
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RoCParser.AND, 0); }
		public TerminalNode OR() { return getToken(RoCParser.OR, 0); }
		public LogicalExpressionAndOrContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterLogicalExpressionAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitLogicalExpressionAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitLogicalExpressionAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_logical_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				comparison_expr();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(PAREN_OPEN);
				setState(79);
				logical_expr(0);
				setState(80);
				match(PAREN_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionAndOrContext(new Logical_exprContext(_parentctx, _parentState));
					((LogicalExpressionAndOrContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(84);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(86);
					((LogicalExpressionAndOrContext)_localctx).right = logical_expr(4);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Comparison_exprContext extends ParserRuleContext {
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
	 
		public Comparison_exprContext() { }
		public void copyFrom(Comparison_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionParensContext extends Comparison_exprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public ComparisonExpressionParensContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparisonExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparisonExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparisonExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionWithOperatorContext extends Comparison_exprContext {
		public Arithmetic_exprContext left;
		public Arithmetic_exprContext right;
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public ComparisonExpressionWithOperatorContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparisonExpressionWithOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparisonExpressionWithOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparisonExpressionWithOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison_expr);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((ComparisonExpressionWithOperatorContext)_localctx).left = arithmetic_expr(0);
				setState(93);
				comparator();
				setState(94);
				((ComparisonExpressionWithOperatorContext)_localctx).right = arithmetic_expr(0);
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(PAREN_OPEN);
				setState(97);
				comparison_expr();
				setState(98);
				match(PAREN_CLOSE);
				}
				break;
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public List<DecisionStatementContext> decisionStatement() {
			return getRuleContexts(DecisionStatementContext.class);
		}
		public DecisionStatementContext decisionStatement(int i) {
			return getRuleContext(DecisionStatementContext.class,i);
		}
		public List<IterationStatementContext> iterationStatement() {
			return getRuleContexts(IterationStatementContext.class);
		}
		public IterationStatementContext iterationStatement(int i) {
			return getRuleContext(IterationStatementContext.class,i);
		}
		public List<PrintStatementContext> printStatement() {
			return getRuleContexts(PrintStatementContext.class);
		}
		public PrintStatementContext printStatement(int i) {
			return getRuleContext(PrintStatementContext.class,i);
		}
		public List<VarExpressionContext> varExpression() {
			return getRuleContexts(VarExpressionContext.class);
		}
		public VarExpressionContext varExpression(int i) {
			return getRuleContext(VarExpressionContext.class,i);
		}
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RoCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RoCParser.SEMICOLON, i);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitStatement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitStatement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(110);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case If:
						{
						setState(102);
						decisionStatement();
						}
						break;
					case While:
					case Execute:
					case For:
						{
						setState(103);
						iterationStatement();
						}
						break;
					case Print:
						{
						setState(104);
						printStatement();
						}
						break;
					case IDENTIFIER:
						{
						setState(105);
						varExpression();
						}
						break;
					case NUMBER_TYPE:
					case STRING_TYPE:
					case BOOLEAN_TYPE:
					case AUTO_TYPE:
						{
						setState(106);
						variable_declaration();
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(107);
							match(SEMICOLON);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDSUBGRPContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public Token op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RoCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RoCParser.MINUS, 0); }
		public ADDSUBGRPContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterADDSUBGRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitADDSUBGRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitADDSUBGRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NUMBERContext extends Arithmetic_exprContext {
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public NUMBERContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterNUMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitNUMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitNUMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STRINGContext extends Arithmetic_exprContext {
		public TerminalNode STRING() { return getToken(RoCParser.STRING, 0); }
		public STRINGContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitSTRING(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENGRPContext extends Arithmetic_exprContext {
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public PARENGRPContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterPARENGRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitPARENGRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitPARENGRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDENTIFIERContext extends Arithmetic_exprContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public IDENTIFIERContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitIDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitIDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BOOLEANContext extends Arithmetic_exprContext {
		public TerminalNode BOOLEAN() { return getToken(RoCParser.BOOLEAN, 0); }
		public BOOLEANContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULDIVMODOPGRPContext extends Arithmetic_exprContext {
		public Arithmetic_exprContext left;
		public Token op;
		public Arithmetic_exprContext right;
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(RoCParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RoCParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(RoCParser.MODULO, 0); }
		public MULDIVMODOPGRPContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterMULDIVMODOPGRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitMULDIVMODOPGRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitMULDIVMODOPGRP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_arithmetic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_OPEN:
				{
				_localctx = new PARENGRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(PAREN_OPEN);
				setState(116);
				arithmetic_expr(0);
				setState(117);
				match(PAREN_CLOSE);
				}
				break;
			case NUMBER:
				{
				_localctx = new NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(STRING);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BOOLEANContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IDENTIFIERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVMODOPGRPContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((MULDIVMODOPGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(126);
						((MULDIVMODOPGRPContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
							((MULDIVMODOPGRPContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						((MULDIVMODOPGRPContext)_localctx).right = arithmetic_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ADDSUBGRPContext(new Arithmetic_exprContext(_parentctx, _parentState));
						((ADDSUBGRPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						((ADDSUBGRPContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ADDSUBGRPContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						((ADDSUBGRPContext)_localctx).right = arithmetic_expr(7);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class DecisionStatementContext extends ParserRuleContext {
		public ConditionsContext if_lhs;
		public Statement_bodyContext if_rhs;
		public ConditionsContext elseIF_lhs;
		public Statement_bodyContext elseIF_rhs;
		public Statement_bodyContext else_lhs;
		public TerminalNode If() { return getToken(RoCParser.If, 0); }
		public List<TerminalNode> PAREN_OPEN() { return getTokens(RoCParser.PAREN_OPEN); }
		public TerminalNode PAREN_OPEN(int i) {
			return getToken(RoCParser.PAREN_OPEN, i);
		}
		public List<TerminalNode> PAREN_CLOSE() { return getTokens(RoCParser.PAREN_CLOSE); }
		public TerminalNode PAREN_CLOSE(int i) {
			return getToken(RoCParser.PAREN_CLOSE, i);
		}
		public List<TerminalNode> CURLY_OPEN() { return getTokens(RoCParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(RoCParser.CURLY_OPEN, i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(RoCParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(RoCParser.CURLY_CLOSE, i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public List<TerminalNode> Else_If() { return getTokens(RoCParser.Else_If); }
		public TerminalNode Else_If(int i) {
			return getToken(RoCParser.Else_If, i);
		}
		public TerminalNode Else() { return getToken(RoCParser.Else, 0); }
		public DecisionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterDecisionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitDecisionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitDecisionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionStatementContext decisionStatement() throws RecognitionException {
		DecisionStatementContext _localctx = new DecisionStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decisionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(If);
			setState(137);
			match(PAREN_OPEN);
			setState(138);
			((DecisionStatementContext)_localctx).if_lhs = conditions();
			setState(139);
			match(PAREN_CLOSE);
			setState(140);
			match(CURLY_OPEN);
			setState(141);
			((DecisionStatementContext)_localctx).if_rhs = statement_body();
			setState(142);
			match(CURLY_CLOSE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else_If) {
				{
				{
				setState(143);
				match(Else_If);
				setState(144);
				match(PAREN_OPEN);
				setState(145);
				((DecisionStatementContext)_localctx).elseIF_lhs = conditions();
				setState(146);
				match(PAREN_CLOSE);
				setState(147);
				match(CURLY_OPEN);
				setState(148);
				((DecisionStatementContext)_localctx).elseIF_rhs = statement_body();
				setState(149);
				match(CURLY_CLOSE);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(156);
				match(Else);
				setState(157);
				match(CURLY_OPEN);
				setState(158);
				((DecisionStatementContext)_localctx).else_lhs = statement_body();
				setState(159);
				match(CURLY_CLOSE);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(RoCParser.Print, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(RoCParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(RoCParser.PAREN_CLOSE, 0); }
		public Type_valueContext type_value() {
			return getRuleContext(Type_valueContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(Print);
			setState(164);
			match(PAREN_OPEN);
			{
			setState(165);
			type_value();
			}
			setState(166);
			match(PAREN_CLOSE);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopContext extends IterationStatementContext {
		public Token left_num;
		public Token left_id;
		public TerminalNode For() { return getToken(RoCParser.For, 0); }
		public List<TerminalNode> COLON() { return getTokens(RoCParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RoCParser.COLON, i);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode Execute() { return getToken(RoCParser.Execute, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(RoCParser.NUMBER_TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RoCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RoCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQUALS_TO() { return getTokens(RoCParser.EQUALS_TO); }
		public TerminalNode EQUALS_TO(int i) {
			return getToken(RoCParser.EQUALS_TO, i);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public ForLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileLoopContext extends IterationStatementContext {
		public TerminalNode Execute() { return getToken(RoCParser.Execute, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public TerminalNode While() { return getToken(RoCParser.While, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public DoWhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(RoCParser.While, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode Execute() { return getToken(RoCParser.Execute, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(RoCParser.CURLY_OPEN, 0); }
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(RoCParser.CURLY_CLOSE, 0); }
		public WhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_iterationStatement);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(While);
				setState(169);
				conditions();
				setState(170);
				match(Execute);
				setState(171);
				match(CURLY_OPEN);
				setState(172);
				statement_body();
				setState(173);
				match(CURLY_CLOSE);
				}
				break;
			case For:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(For);
				{
				setState(176);
				match(NUMBER_TYPE);
				setState(177);
				match(IDENTIFIER);
				setState(178);
				match(EQUALS_TO);
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(179);
					((ForLoopContext)_localctx).left_num = match(NUMBER);
					}
					break;
				case IDENTIFIER:
					{
					setState(180);
					((ForLoopContext)_localctx).left_id = match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
				match(COLON);
				setState(184);
				conditions();
				setState(185);
				match(COLON);
				{
				setState(186);
				match(IDENTIFIER);
				setState(187);
				match(EQUALS_TO);
				setState(188);
				arithmetic_expr(0);
				}
				setState(190);
				match(Execute);
				setState(191);
				match(CURLY_OPEN);
				setState(192);
				statement_body();
				setState(193);
				match(CURLY_CLOSE);
				}
				break;
			case Execute:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(Execute);
				setState(196);
				match(CURLY_OPEN);
				setState(197);
				statement_body();
				setState(198);
				match(CURLY_CLOSE);
				setState(199);
				match(While);
				setState(200);
				conditions();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Token lhs;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUALS_TO() { return getToken(RoCParser.EQUALS_TO, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			type();
			setState(205);
			((Variable_declarationContext)_localctx).lhs = match(IDENTIFIER);
			setState(206);
			match(EQUALS_TO);
			setState(207);
			arithmetic_expr(0);
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

	public static class VarExpressionContext extends ParserRuleContext {
		public VarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpression; }
	 
		public VarExpressionContext() { }
		public void copyFrom(VarExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExpressionContext extends VarExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS_TO() { return getToken(RoCParser.EQUALS_TO, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public AssignmentExpressionContext(VarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExpressionContext varExpression() throws RecognitionException {
		VarExpressionContext _localctx = new VarExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varExpression);
		try {
			_localctx = new AssignmentExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(EQUALS_TO);
			setState(211);
			arithmetic_expr(0);
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(RoCParser.GT, 0); }
		public TerminalNode GE() { return getToken(RoCParser.GE, 0); }
		public TerminalNode LT() { return getToken(RoCParser.LT, 0); }
		public TerminalNode LE() { return getToken(RoCParser.LE, 0); }
		public TerminalNode EQ() { return getToken(RoCParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(RoCParser.NOT_EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NOT_EQ))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(RoCParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(RoCParser.BOOLEAN_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(RoCParser.NUMBER_TYPE, 0); }
		public TerminalNode AUTO_TYPE() { return getToken(RoCParser.AUTO_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_TYPE) | (1L << STRING_TYPE) | (1L << BOOLEAN_TYPE) | (1L << AUTO_TYPE))) != 0)) ) {
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

	public static class Type_valueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(RoCParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(RoCParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(RoCParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RoCParser.IDENTIFIER, 0); }
		public Type_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).enterType_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoCListener ) ((RoCListener)listener).exitType_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoCVisitor ) return ((RoCVisitor<? extends T>)visitor).visitType_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_valueContext type_value() throws RecognitionException {
		Type_valueContext _localctx = new Type_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		case 7:
			return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00de\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\5\3>\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6U\n\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\6\bq\n\b\r\b\16\br"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00a4\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\2\4\n\20\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\b\3\2#$\3\2\20"+
		"\22\3\2\16\17\4\2%)++\3\2\23\26\4\2 \"//\2\u00e7\2%\3\2\2\2\4*\3\2\2\2"+
		"\6A\3\2\2\2\bL\3\2\2\2\nT\3\2\2\2\ff\3\2\2\2\16p\3\2\2\2\20}\3\2\2\2\22"+
		"\u008a\3\2\2\2\24\u00a5\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce\3\2\2\2\32\u00d3"+
		"\3\2\2\2\34\u00d7\3\2\2\2\36\u00d9\3\2\2\2 \u00db\3\2\2\2\"$\5\4\3\2#"+
		"\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2"+
		"\3)\3\3\2\2\2*+\7\37\2\2+,\7/\2\2,.\7\3\2\2-/\5\6\4\2.-\3\2\2\2./\3\2"+
		"\2\2/\60\3\2\2\2\60\63\7\4\2\2\61\62\7\36\2\2\62\64\5\36\20\2\63\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\5\2\2\668\5\16\b\2\67\66\3"+
		"\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;<\7\36\2\2<>\7/\2\2="+
		";\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\6\2\2@\5\3\2\2\2AB\5\36\20\2BI\7/\2"+
		"\2CD\7\f\2\2DE\5\36\20\2EF\7/\2\2FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\5\n\6\2M\t\3\2\2\2NO\b\6\1\2OU\5"+
		"\f\7\2PQ\7\3\2\2QR\5\n\6\2RS\7\4\2\2SU\3\2\2\2TN\3\2\2\2TP\3\2\2\2U[\3"+
		"\2\2\2VW\f\5\2\2WX\t\2\2\2XZ\5\n\6\6YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\\13\3\2\2\2][\3\2\2\2^_\5\20\t\2_`\5\34\17\2`a\5\20\t\2ag\3"+
		"\2\2\2bc\7\3\2\2cd\5\f\7\2de\7\4\2\2eg\3\2\2\2f^\3\2\2\2fb\3\2\2\2g\r"+
		"\3\2\2\2hq\5\22\n\2iq\5\26\f\2jq\5\24\13\2kq\5\32\16\2ln\5\30\r\2mo\7"+
		"\t\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2ph\3\2\2\2pi\3\2\2\2pj\3\2\2\2pk\3"+
		"\2\2\2pl\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tu\b\t\1\2u"+
		"v\7\3\2\2vw\5\20\t\2wx\7\4\2\2x~\3\2\2\2y~\7\"\2\2z~\7!\2\2{~\7 \2\2|"+
		"~\7/\2\2}t\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0087\3\2"+
		"\2\2\177\u0080\f\t\2\2\u0080\u0081\t\3\2\2\u0081\u0086\5\20\t\n\u0082"+
		"\u0083\f\b\2\2\u0083\u0084\t\4\2\2\u0084\u0086\5\20\t\t\u0085\177\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\30\2"+
		"\2\u008b\u008c\7\3\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7\4\2\2\u008e\u008f"+
		"\7\5\2\2\u008f\u0090\5\16\b\2\u0090\u009b\7\6\2\2\u0091\u0092\7\32\2\2"+
		"\u0092\u0093\7\3\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\4\2\2\u0095\u0096"+
		"\7\5\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\6\2\2\u0098\u009a\3\2\2\2"+
		"\u0099\u0091\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00a3\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\31\2\2"+
		"\u009f\u00a0\7\5\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\23\3\2\2\2\u00a5"+
		"\u00a6\7\35\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7"+
		"\4\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\5\b\5\2\u00ac"+
		"\u00ad\7\33\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\5\16\b\2\u00af\u00b0\7"+
		"\6\2\2\u00b0\u00cd\3\2\2\2\u00b1\u00b2\7\34\2\2\u00b2\u00b3\7\23\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4\u00b7\7-\2\2\u00b5\u00b8\7\"\2\2\u00b6\u00b8\7/\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\7\n\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		"\u00be\7-\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\33"+
		"\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c4\7\6\2\2\u00c4"+
		"\u00cd\3\2\2\2\u00c5\u00c6\7\33\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\5"+
		"\16\b\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb\5\b\5\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00aa\3\2\2\2\u00cc\u00b1\3\2\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\5\36\20\2\u00cf\u00d0\7/\2\2\u00d0\u00d1"+
		"\7-\2\2\u00d1\u00d2\5\20\t\2\u00d2\31\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4"+
		"\u00d5\7-\2\2\u00d5\u00d6\5\20\t\2\u00d6\33\3\2\2\2\u00d7\u00d8\t\5\2"+
		"\2\u00d8\35\3\2\2\2\u00d9\u00da\t\6\2\2\u00da\37\3\2\2\2\u00db\u00dc\t"+
		"\7\2\2\u00dc!\3\2\2\2\25%.\639=IT[fnpr}\u0085\u0087\u009b\u00a3\u00b7"+
		"\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}