// Generated from /home/tomas/C/guiao-p(2)/guiao-p/ex1/StrLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StrLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, BREAKS=11, COMMENTS=12, Var=13;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_term = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'('", "')'", "':'", "'input'", "'+'", "'-'", "'trim'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"BREAKS", "COMMENTS", "Var"
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
	public String getGrammarFileName() { return "StrLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StrLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StrLangParser.EOF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Var) {
				{
				{
				setState(6);
				statements();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermVarContext extends StatementsContext {
		public TerminalNode Var() { return getToken(StrLangParser.Var, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermVarContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermStatementContext extends StatementsContext {
		public TerminalNode Var() { return getToken(StrLangParser.Var, 0); }
		public TerminalNode STRING() { return getToken(StrLangParser.STRING, 0); }
		public TermStatementContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermSimpleContext extends StatementsContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermSimpleContext(StatementsContext ctx) { copyFrom(ctx); }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new TermSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				setState(16);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(15);
					match(T__1);
					}
					break;
				}
				setState(18);
				term(0);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(19);
					match(T__2);
					}
				}

				}
				break;
			case 2:
				_localctx = new TermVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(Var);
				setState(23);
				match(T__3);
				setState(24);
				term(0);
				}
				break;
			case 3:
				_localctx = new TermStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(Var);
				setState(26);
				match(T__3);
				setState(27);
				match(T__4);
				setState(28);
				match(T__1);
				setState(29);
				match(STRING);
				setState(30);
				match(T__2);
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
	public static class PearspsTextContext extends TermContext {
		public TerminalNode STRING() { return getToken(StrLangParser.STRING, 0); }
		public PearspsTextContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextTermContext extends TermContext {
		public TerminalNode Var() { return getToken(StrLangParser.Var, 0); }
		public TextTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermTermExprContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermTermExprContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PrintStatementContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermADDContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermADDContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesExprContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ParenthesesExprContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermSUBContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermSUBContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrimtermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TrimtermContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				_localctx = new TextTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				match(Var);
				}
				break;
			case STRING:
				{
				_localctx = new PearspsTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(STRING);
				}
				break;
			case T__0:
				{
				_localctx = new PrintStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__0);
				setState(37);
				term(6);
				}
				break;
			case T__7:
				{
				_localctx = new TrimtermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__7);
				setState(39);
				term(3);
				}
				break;
			case T__1:
				{
				_localctx = new ParenthesesExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__1);
				setState(41);
				term(0);
				setState(42);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new TermADDContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(46);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(47);
						match(T__5);
						setState(48);
						term(6);
						}
						break;
					case 2:
						{
						_localctx = new TermSUBContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						match(T__6);
						setState(51);
						term(5);
						}
						break;
					case 3:
						{
						_localctx = new TermTermExprContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						match(T__8);
						setState(54);
						term(0);
						setState(55);
						match(T__8);
						setState(56);
						term(3);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 2:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\r@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0011"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		";\b\u0002\n\u0002\f\u0002>\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003"+
		"\u0000\u0002\u0004\u0000\u0000H\u0000\t\u0001\u0000\u0000\u0000\u0002"+
		"\u001f\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006\b"+
		"\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\u000b\u0001"+
		"\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000"+
		"\u0000\n\f\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\f\r"+
		"\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000\u0000\u0000\u000e\u0010\u0005"+
		"\u0001\u0000\u0000\u000f\u0011\u0005\u0002\u0000\u0000\u0010\u000f\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0015\u0005"+
		"\u0003\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015 \u0001\u0000\u0000\u0000\u0016\u0017\u0005\r"+
		"\u0000\u0000\u0017\u0018\u0005\u0004\u0000\u0000\u0018 \u0003\u0004\u0002"+
		"\u0000\u0019\u001a\u0005\r\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000"+
		"\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000"+
		"\u001d\u001e\u0005\n\u0000\u0000\u001e \u0005\u0003\u0000\u0000\u001f"+
		"\u000e\u0001\u0000\u0000\u0000\u001f\u0016\u0001\u0000\u0000\u0000\u001f"+
		"\u0019\u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0006"+
		"\u0002\uffff\uffff\u0000\"-\u0005\r\u0000\u0000#-\u0005\n\u0000\u0000"+
		"$%\u0005\u0001\u0000\u0000%-\u0003\u0004\u0002\u0006&\'\u0005\b\u0000"+
		"\u0000\'-\u0003\u0004\u0002\u0003()\u0005\u0002\u0000\u0000)*\u0003\u0004"+
		"\u0002\u0000*+\u0005\u0003\u0000\u0000+-\u0001\u0000\u0000\u0000,!\u0001"+
		"\u0000\u0000\u0000,#\u0001\u0000\u0000\u0000,$\u0001\u0000\u0000\u0000"+
		",&\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-<\u0001\u0000\u0000"+
		"\u0000./\n\u0005\u0000\u0000/0\u0005\u0006\u0000\u00000;\u0003\u0004\u0002"+
		"\u000612\n\u0004\u0000\u000023\u0005\u0007\u0000\u00003;\u0003\u0004\u0002"+
		"\u000545\n\u0002\u0000\u000056\u0005\t\u0000\u000067\u0003\u0004\u0002"+
		"\u000078\u0005\t\u0000\u000089\u0003\u0004\u0002\u00039;\u0001\u0000\u0000"+
		"\u0000:.\u0001\u0000\u0000\u0000:1\u0001\u0000\u0000\u0000:4\u0001\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000\u0007\t\u0010\u0014\u001f,:<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}