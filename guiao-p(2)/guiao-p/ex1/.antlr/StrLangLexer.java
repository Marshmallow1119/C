// Generated from /home/tomas/C/guiao-p(2)/guiao-p/ex1/StrLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StrLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, BREAKS=11, COMMENTS=12, Var=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "BREAKS", "COMMENTS", "Var"
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


	public StrLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StrLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\rW\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0005\t;\b\t\n\t\f\t>\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bJ\b\u000b\n\u000b\f\u000bM\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0004\fT\b\f\u000b\f\f\fU\u0002<K\u0000"+
		"\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000"+
		"\u0002\u0003\u0000\t\n\r\r  \u0003\u000009AZazY\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005"+
		"#\u0001\u0000\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000"+
		"\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000"+
		"\u000f1\u0001\u0000\u0000\u0000\u00116\u0001\u0000\u0000\u0000\u00138"+
		"\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017E\u0001\u0000"+
		"\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b\u001c\u0005p\u0000\u0000"+
		"\u001c\u001d\u0005r\u0000\u0000\u001d\u001e\u0005i\u0000\u0000\u001e\u001f"+
		"\u0005n\u0000\u0000\u001f \u0005t\u0000\u0000 \u0002\u0001\u0000\u0000"+
		"\u0000!\"\u0005(\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005)"+
		"\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005:\u0000\u0000&\b\u0001"+
		"\u0000\u0000\u0000\'(\u0005i\u0000\u0000()\u0005n\u0000\u0000)*\u0005"+
		"p\u0000\u0000*+\u0005u\u0000\u0000+,\u0005t\u0000\u0000,\n\u0001\u0000"+
		"\u0000\u0000-.\u0005+\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005-"+
		"\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0005t\u0000\u000023\u0005"+
		"r\u0000\u000034\u0005i\u0000\u000045\u0005m\u0000\u00005\u0010\u0001\u0000"+
		"\u0000\u000067\u0005/\u0000\u00007\u0012\u0001\u0000\u0000\u00008<\u0005"+
		"\"\u0000\u00009;\t\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\"\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0006\n\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005"+
		"/\u0000\u0000FG\u0005/\u0000\u0000GK\u0001\u0000\u0000\u0000HJ\t\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0005\n\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0006\u000b\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RT\u0007\u0001"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u001a\u0001\u0000\u0000"+
		"\u0000\u0004\u0000<KU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}