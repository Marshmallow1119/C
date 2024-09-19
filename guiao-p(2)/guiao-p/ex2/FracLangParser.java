// Generated from FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FracLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TEXT=12, NUMBER=13, STRING=14, FRACTION=15, BREAK=16, 
		COMMENTS=17;
	public static final int
		RULE_stats = 0, RULE_program = 1, RULE_statement = 2, RULE_term = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"stats", "program", "statement", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'display'", "'('", "')'", "'+'", "'-'", "'*'", "':'", "'<='", 
			"'read'", "'reduce'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TEXT", "NUMBER", "STRING", "FRACTION", "BREAK", "COMMENTS"
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
	public String getGrammarFileName() { return "FracLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FracLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatsContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitStats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			program();
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FracLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 48236L) != 0)) {
				{
				{
				setState(10);
				statement();
				setState(11);
				match(T__0);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDisplayTermContext extends StatementContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StatementDisplayTermContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterStatementDisplayTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitStatementDisplayTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitStatementDisplayTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementTermContext extends StatementContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StatementTermContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterStatementTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitStatementTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitStatementTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new StatementDisplayTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__1);
				setState(21);
				term(0);
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case T__9:
			case T__10:
			case TEXT:
			case NUMBER:
			case FRACTION:
				_localctx = new StatementTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				term(0);
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermReduceContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermReduceContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermReduce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermReduce(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermTextMulAdContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermTextMulAdContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermTextMulAd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermTextMulAd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermTextMulAd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermTextContext extends TermContext {
		public TerminalNode TEXT() { return getToken(FracLangParser.TEXT, 0); }
		public TermTextContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermReadContext extends TermContext {
		public TerminalNode STRING() { return getToken(FracLangParser.STRING, 0); }
		public TermReadContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermNumberContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(FracLangParser.NUMBER, 0); }
		public TermNumberContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermOpContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermOpContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermParenthesisContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermParenthesisContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermFRACTIONContext extends TermContext {
		public TerminalNode FRACTION() { return getToken(FracLangParser.FRACTION, 0); }
		public TermFRACTIONContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermFRACTION(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermFRACTION(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermFRACTION(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermAtrContext extends TermContext {
		public TerminalNode TEXT() { return getToken(FracLangParser.TEXT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermAtrContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermAtr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermTextAddSubContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermTextAddSubContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterTermTextAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitTermTextAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitTermTextAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new TermParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(26);
				match(T__2);
				setState(27);
				term(0);
				setState(28);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new TermNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new TermOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				((TermOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((TermOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(32);
				term(8);
				}
				break;
			case 4:
				{
				_localctx = new TermTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(TEXT);
				}
				break;
			case 5:
				{
				_localctx = new TermFRACTIONContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(FRACTION);
				}
				break;
			case 6:
				{
				_localctx = new TermAtrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(TEXT);
				setState(36);
				match(T__8);
				setState(37);
				term(3);
				}
				break;
			case 7:
				{
				_localctx = new TermReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__9);
				setState(39);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new TermReduceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__10);
				setState(41);
				term(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TermTextMulAdContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(44);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(45);
						((TermTextMulAdContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((TermTextMulAdContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						term(8);
						}
						break;
					case 2:
						{
						_localctx = new TermTextAddSubContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(47);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(48);
						((TermTextAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((TermTextAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						term(7);
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u000e\b\u0001\n\u0001\f\u0001"+
		"\u0011\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0018\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00033\b\u0003\n\u0003\f\u0003"+
		"6\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0002\u0001\u0000\u0005\u0006\u0001\u0000\u0007\b>\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0017\u0001"+
		"\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001"+
		"\u0000\t\u0001\u0001\u0000\u0000\u0000\n\u000b\u0003\u0004\u0002\u0000"+
		"\u000b\f\u0005\u0001\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\n\u0001"+
		"\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0000"+
		"\u0000\u0001\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0002"+
		"\u0000\u0000\u0015\u0018\u0003\u0006\u0003\u0000\u0016\u0018\u0003\u0006"+
		"\u0003\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001a\u0006\u0003"+
		"\uffff\uffff\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0003"+
		"\u0006\u0003\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d+\u0001\u0000"+
		"\u0000\u0000\u001e+\u0005\r\u0000\u0000\u001f \u0007\u0000\u0000\u0000"+
		" +\u0003\u0006\u0003\b!+\u0005\f\u0000\u0000\"+\u0005\u000f\u0000\u0000"+
		"#$\u0005\f\u0000\u0000$%\u0005\t\u0000\u0000%+\u0003\u0006\u0003\u0003"+
		"&\'\u0005\n\u0000\u0000\'+\u0005\u000e\u0000\u0000()\u0005\u000b\u0000"+
		"\u0000)+\u0003\u0006\u0003\u0001*\u0019\u0001\u0000\u0000\u0000*\u001e"+
		"\u0001\u0000\u0000\u0000*\u001f\u0001\u0000\u0000\u0000*!\u0001\u0000"+
		"\u0000\u0000*\"\u0001\u0000\u0000\u0000*#\u0001\u0000\u0000\u0000*&\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+4\u0001\u0000\u0000\u0000"+
		",-\n\u0007\u0000\u0000-.\u0007\u0001\u0000\u0000.3\u0003\u0006\u0003\b"+
		"/0\n\u0006\u0000\u000001\u0007\u0000\u0000\u000013\u0003\u0006\u0003\u0007"+
		"2,\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0007\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u0000\u0005\u000f\u0017*24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}