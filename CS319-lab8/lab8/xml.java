// Generated from xml.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xml extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTING=1, STOPPING=2, ELEMENTTAG=3, EMAIL=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "ALPHA", "SPECIALCHAR", "ELEMENTNAME", "LOCAL", "DOMAIN", "DATE", 
		"STARTING", "STOPPING", "ELEMENTTAG", "EMAIL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STARTING", "STOPPING", "ELEMENTTAG", "EMAIL", "WS"
	};
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


	  boolean tag = false;
	  String tagName = "";


	public xml(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			STARTING_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			STOPPING_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ELEMENTTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			EMAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STARTING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			tag = true;
			break;
		case 1:
			tag = true;
			break;
		}
	}
	private void STOPPING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			tag = false;
			break;
		}
	}
	private void ELEMENTTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:


			  tagName = getText();
			  System.out.println("Element Name: " + getText());


			break;
		}
	}
	private void EMAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			  System.out.println("Email: " + getText());

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("matching WS rule");skip();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return ELEMENTTAG_sempred((RuleContext)_localctx, predIndex);
		case 10:
			return EMAIL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ELEMENTTAG_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return tag;
		}
		return true;
	}
	private boolean EMAIL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !tag && tagName.matches("(?i)email");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7\u008e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5(\n\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\5\5\62\n\5\5\5\64\n\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\5\5C\n\5\3\5"+
		"\5\5F\n\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\5\5P\n\5\3\6\3\6\3\6\5\6"+
		"U\n\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\5\6`\n\6\7\6b\n\6\f\6\16\6"+
		"e\13\6\3\7\6\7h\n\7\r\7\16\7i\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\6\r\u0089\n\r\r\r\16\r\u008a\3\r\3\r\2\2\16\3\2\5\2\7\2\t"+
		"\2\13\2\r\2\17\2\21\3\23\4\25\5\27\6\31\7\3\2\20\3\2\62;\4\2C\\c|\t\2"+
		"##&&(/<=??aa\u0080\u0080\b\2/\60CMO\\aacmo|\4\2/\60aa\4\2ZZzz\b\2/\60"+
		"CNP\\aacnp|\7\2CY[\\aacy{|\6\2\60\60\62;C\\c|\3\2\63;\3\2\63\64\3\2\65"+
		"\65\3\2\62\63\5\2\13\f\17\17\"\"\u00a4\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2"+
		"\2\2\tO\3\2\2\2\13T\3\2\2\2\rg\3\2\2\2\17p\3\2\2\2\21x\3\2\2\2\23z\3\2"+
		"\2\2\25}\3\2\2\2\27\u0081\3\2\2\2\31\u0088\3\2\2\2\33\34\t\2\2\2\34\4"+
		"\3\2\2\2\35\36\t\3\2\2\36\6\3\2\2\2\37 \t\4\2\2 \b\3\2\2\2!\64\7z\2\2"+
		"\"#\7Z\2\2#\64\7o\2\2$\61\7O\2\2%(\5\3\2\2&(\t\5\2\2\'%\3\2\2\2\'&\3\2"+
		"\2\2(.\3\2\2\2)-\5\3\2\2*-\t\6\2\2+-\5\5\3\2,)\3\2\2\2,*\3\2\2\2,+\3\2"+
		"\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\'\3\2"+
		"\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63!\3\2\2\2\63\"\3\2\2\2\63$\3\2\2\2"+
		"\64P\3\2\2\2\65B\t\7\2\2\669\5\3\2\2\679\t\b\2\28\66\3\2\2\28\67\3\2\2"+
		"\29?\3\2\2\2:>\5\3\2\2;>\t\6\2\2<>\5\5\3\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B8\3\2\2\2BC\3\2\2"+
		"\2CP\3\2\2\2DF\t\t\2\2ED\3\2\2\2FL\3\2\2\2GK\5\3\2\2HK\t\6\2\2IK\5\5\3"+
		"\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2O\63\3\2\2\2O\65\3\2\2\2OE\3\2\2\2P\n\3\2\2\2QU\5\3\2\2RU"+
		"\5\5\3\2SU\5\7\4\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2Uc\3\2\2\2VZ\5\3\2\2W"+
		"Z\5\5\3\2XZ\5\7\4\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Zb\3\2\2\2[_\7\60\2\2"+
		"\\`\5\3\2\2]`\5\5\3\2^`\5\7\4\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`b\3\2\2"+
		"\2aY\3\2\2\2a[\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\f\3\2\2\2ec\3\2"+
		"\2\2fh\t\n\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\16\3\2\2\2kq\t"+
		"\13\2\2lm\t\f\2\2mq\t\2\2\2no\t\r\2\2oq\t\16\2\2pk\3\2\2\2pl\3\2\2\2p"+
		"n\3\2\2\2q\20\3\2\2\2rs\7>\2\2st\7\61\2\2tu\3\2\2\2uy\b\t\2\2vw\7>\2\2"+
		"wy\b\t\3\2xr\3\2\2\2xv\3\2\2\2y\22\3\2\2\2z{\7@\2\2{|\b\n\4\2|\24\3\2"+
		"\2\2}~\6\13\2\2~\177\5\t\5\2\177\u0080\b\13\5\2\u0080\26\3\2\2\2\u0081"+
		"\u0082\6\f\3\2\u0082\u0083\5\13\6\2\u0083\u0084\7B\2\2\u0084\u0085\5\r"+
		"\7\2\u0085\u0086\b\f\6\2\u0086\30\3\2\2\2\u0087\u0089\t\17\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\r\7\2\u008d\32\3\2\2\2\31\2\',.\61\638=?"+
		"BEJLOTY_acipx\u008a\b\3\t\2\3\t\3\3\n\4\3\13\5\3\f\6\3\r\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}