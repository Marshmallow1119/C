// Generated from FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FracLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TEXT=12, NUMBER=13, STRING=14, FRACTION=15, BREAK=16, 
		COMMENTS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "TEXT", "NUMBER", "STRING", "FRACTION", "BREAK", "COMMENTS"
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


	public FracLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FracLang.g4"; }

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
		"\u0004\u0000\u0011p\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bJ\b\u000b\u000b\u000b\f\u000bK\u0001\f\u0004\fO\b\f"+
		"\u000b\f\f\fP\u0001\r\u0001\r\u0005\rU\b\r\n\r\f\rX\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010h\b\u0010\n\u0010\f\u0010k\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0002Vi\u0000\u0011\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"\u0001\u0000\u0003\u0001\u0000az\u0001\u000009\u0003\u0000\t\n\r\r  s"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000"+
		"\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t"+
		"1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001\u0000"+
		"\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000\u0000"+
		"\u0013<\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017I"+
		"\u0001\u0000\u0000\u0000\u0019N\u0001\u0000\u0000\u0000\u001bR\u0001\u0000"+
		"\u0000\u0000\u001d[\u0001\u0000\u0000\u0000\u001f_\u0001\u0000\u0000\u0000"+
		"!c\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u0005d\u0000\u0000&\'\u0005i\u0000\u0000\'(\u0005s\u0000\u0000"+
		"()\u0005p\u0000\u0000)*\u0005l\u0000\u0000*+\u0005a\u0000\u0000+,\u0005"+
		"y\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0006"+
		"\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\b\u0001\u0000\u0000\u0000"+
		"12\u0005+\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005-\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000056\u0005*\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u000078\u0005:\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005<\u0000"+
		"\u0000:;\u0005=\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005r\u0000"+
		"\u0000=>\u0005e\u0000\u0000>?\u0005a\u0000\u0000?@\u0005d\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000"+
		"CD\u0005d\u0000\u0000DE\u0005u\u0000\u0000EF\u0005c\u0000\u0000FG\u0005"+
		"e\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HJ\u0007\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MO\u0007"+
		"\u0001\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u001a\u0001\u0000"+
		"\u0000\u0000RV\u0005\"\u0000\u0000SU\t\u0000\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YZ\u0005\"\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0003\u0019\f"+
		"\u0000\\]\u0005/\u0000\u0000]^\u0003\u0019\f\u0000^\u001e\u0001\u0000"+
		"\u0000\u0000_`\u0007\u0002\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0006"+
		"\u000f\u0000\u0000b \u0001\u0000\u0000\u0000cd\u0005-\u0000\u0000de\u0005"+
		"-\u0000\u0000ei\u0001\u0000\u0000\u0000fh\t\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000lm\u0005\n\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006\u0010\u0000"+
		"\u0000o\"\u0001\u0000\u0000\u0000\u0005\u0000KPVi\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}