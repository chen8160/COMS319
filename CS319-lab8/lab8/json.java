// Generated from json.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class json extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTING=1, STOPPING=2, ELEMENTTAG=3, EMAIL=4, DATETEST=5, PHONE=6, CREDITCARD=7, 
		OTHER=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "ALPHA", "SPECIALCHAR", "ELEMENTNAME", "LOCAL", "DOMAIN", "DATE", 
		"MONTH", "YEAR", "THREEDIGIT", "FOURDIGIT", "VISA", "MASTER", "AMERICANEXP", 
		"DINERSCLUB", "DISCOVER", "JCB", "STARTING", "STOPPING", "ELEMENTTAG", 
		"EMAIL", "DATETEST", "PHONE", "CREDITCARD", "OTHER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STARTING", "STOPPING", "ELEMENTTAG", "EMAIL", "DATETEST", "PHONE", 
		"CREDITCARD", "OTHER", "WS"
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
	  boolean value = false;
	  String tagName = "";


	public json(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "json.g4"; }

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
		case 17:
			STARTING_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			STOPPING_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			ELEMENTTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			EMAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			DATETEST_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			PHONE_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			CREDITCARD_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STARTING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			tag = true;
			break;
		}
	}
	private void STOPPING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			tag = false;
			break;
		}
	}
	private void ELEMENTTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:


			  tagName = getText().substring(1, getText().length() - 2);
			  System.out.println("Element Name: " + tagName);


			break;
		}
	}
	private void EMAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			  System.out.println("Email: " + getText().substring(getText().length() - 2));

			break;
		}
	}
	private void DATETEST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			  System.out.println("Date: " + getText().substring(getText().length() - 2));

			break;
		}
	}
	private void PHONE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			  System.out.println("Phone: " + getText().substring(getText().length() - 2));

			break;
		}
	}
	private void CREDITCARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			  System.out.println("Credit Card: " + getText().substring(getText().length() - 2));

			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:

			  System.out.println("Other: " + "TAG: " + tagName + " " + getText().substring(getText().length() - 2));

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("matching WS rule");skip();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return ELEMENTTAG_sempred((RuleContext)_localctx, predIndex);
		case 20:
			return EMAIL_sempred((RuleContext)_localctx, predIndex);
		case 21:
			return DATETEST_sempred((RuleContext)_localctx, predIndex);
		case 22:
			return PHONE_sempred((RuleContext)_localctx, predIndex);
		case 23:
			return CREDITCARD_sempred((RuleContext)_localctx, predIndex);
		case 24:
			return OTHER_sempred((RuleContext)_localctx, predIndex);
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
			return tag && tagName.matches("(?i)email");
		}
		return true;
	}
	private boolean DATETEST_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return tag && tagName.matches("(?i)date");
		}
		return true;
	}
	private boolean PHONE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return tag && tagName.matches("(?i)phone");
		}
		return true;
	}
	private boolean CREDITCARD_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return tag && tagName.matches("(?i)creditcard");
		}
		return true;
	}
	private boolean OTHER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return tag && !tagName.matches("(?i)email") && !tagName.matches("(?i)date") && !tagName.matches("(?i)phone") && !tagName.matches("(?i)creditcard");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\u0180\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5D\n\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\5\5N\n\5\5\5P\n\5\3"+
		"\5\3\5\3\5\5\5U\n\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\5\5_\n\5\3\5\5"+
		"\5b\n\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\5\5l\n\5\3\6\3\6\3\6\5\6q"+
		"\n\6\3\6\3\6\3\6\5\6v\n\6\3\6\3\6\3\6\3\6\5\6|\n\6\7\6~\n\6\f\6\16\6\u0081"+
		"\13\6\3\7\6\7\u0084\n\7\r\7\16\7\u0085\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n"+
		"\b\3\b\5\b\u0090\n\b\3\t\3\t\3\t\5\t\u0095\n\t\3\t\5\t\u0098\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b9\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00d9\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e0\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00fe\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u010f\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0126\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0133\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0152\n\30\3\30\3\30\5\30\u0156\n\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0162\n\31\3\31"+
		"\3\31\5\31\u0166\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u0170"+
		"\n\32\r\32\16\32\u0171\3\32\3\32\5\32\u0176\n\32\3\32\3\32\3\33\6\33\u017b"+
		"\n\33\r\33\16\33\u017c\3\33\3\33\2\2\34\3\2\5\2\7\2\t\2\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\3\'\4)\5+\6-\7/\b\61\t"+
		"\63\n\65\13\3\2\25\3\2\62;\4\2C\\c|\t\2##&&(/<=??aa\u0080\u0080\b\2/\60"+
		"CMO\\aacmo|\4\2/\60aa\4\2ZZzz\b\2/\60CNP\\aacnp|\7\2CY[\\aacy{|\6\2/\60"+
		"\62;C\\c|\3\2\65\65\3\2\62\63\3\2\63\64\3\2\63;\3\2\63\63\3\2\62\64\3"+
		"\2\63\67\4\2\66\6699\3\2\62\67\5\2\13\f\17\17\"\"\u01a6\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\tk\3\2\2\2\13"+
		"p\3\2\2\2\r\u0083\3\2\2\2\17\u008f\3\2\2\2\21\u0097\3\2\2\2\23\u00a2\3"+
		"\2\2\2\25\u00a4\3\2\2\2\27\u00a8\3\2\2\2\31\u00ad\3\2\2\2\33\u00ba\3\2"+
		"\2\2\35\u00c2\3\2\2\2\37\u00df\3\2\2\2!\u00f3\3\2\2\2#\u010e\3\2\2\2%"+
		"\u0110\3\2\2\2\'\u0113\3\2\2\2)\u0116\3\2\2\2+\u011e\3\2\2\2-\u0129\3"+
		"\2\2\2/\u0136\3\2\2\2\61\u0159\3\2\2\2\63\u0169\3\2\2\2\65\u017a\3\2\2"+
		"\2\678\t\2\2\28\4\3\2\2\29:\t\3\2\2:\6\3\2\2\2;<\t\4\2\2<\b\3\2\2\2=P"+
		"\7z\2\2>?\7Z\2\2?P\7o\2\2@M\7O\2\2AD\5\3\2\2BD\t\5\2\2CA\3\2\2\2CB\3\2"+
		"\2\2DJ\3\2\2\2EI\5\3\2\2FI\t\6\2\2GI\5\5\3\2HE\3\2\2\2HF\3\2\2\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MC\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2O=\3\2\2\2O>\3\2\2\2O@\3\2\2\2Pl\3\2\2\2Q^\t\7\2\2RU\5\3"+
		"\2\2SU\t\b\2\2TR\3\2\2\2TS\3\2\2\2U[\3\2\2\2VZ\5\3\2\2WZ\t\6\2\2XZ\5\5"+
		"\3\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2^T\3\2\2\2^_\3\2\2\2_l\3\2\2\2`b\t\t\2\2a`\3\2\2\2bh\3"+
		"\2\2\2cg\5\3\2\2dg\t\6\2\2eg\5\5\3\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2kO\3\2\2\2kQ\3\2\2\2ka\3"+
		"\2\2\2l\n\3\2\2\2mq\5\3\2\2nq\5\5\3\2oq\5\7\4\2pm\3\2\2\2pn\3\2\2\2po"+
		"\3\2\2\2q\177\3\2\2\2rv\5\3\2\2sv\5\5\3\2tv\5\7\4\2ur\3\2\2\2us\3\2\2"+
		"\2ut\3\2\2\2v~\3\2\2\2w{\7\60\2\2x|\5\3\2\2y|\5\5\3\2z|\5\7\4\2{x\3\2"+
		"\2\2{y\3\2\2\2{z\3\2\2\2|~\3\2\2\2}u\3\2\2\2}w\3\2\2\2~\u0081\3\2\2\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\f\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0084\t\n\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\16\3\2\2\2\u0087\u0088\t\13\2\2\u0088\u0090"+
		"\t\f\2\2\u0089\u008a\t\r\2\2\u008a\u0090\t\2\2\2\u008b\u008d\7\62\2\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\t\16\2\2\u008f\u0087\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2\2\2"+
		"\u0090\20\3\2\2\2\u0091\u0092\t\17\2\2\u0092\u0098\t\20\2\2\u0093\u0095"+
		"\7\62\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0098\t\16\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\22"+
		"\3\2\2\2\u0099\u009a\7\64\2\2\u009a\u009b\7\62\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\t\2\2\2\u009d\u00a3\t\2\2\2\u009e\u009f\7\64\2\2\u009f\u00a0"+
		"\7\63\2\2\u00a0\u00a1\7\62\2\2\u00a1\u00a3\7\62\2\2\u00a2\u0099\3\2\2"+
		"\2\u00a2\u009e\3\2\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\5\3\2\2\u00a5\u00a6"+
		"\5\3\2\2\u00a6\u00a7\5\3\2\2\u00a7\26\3\2\2\2\u00a8\u00a9\5\3\2\2\u00a9"+
		"\u00aa\5\3\2\2\u00aa\u00ab\5\3\2\2\u00ab\u00ac\5\3\2\2\u00ac\30\3\2\2"+
		"\2\u00ad\u00b8\7\66\2\2\u00ae\u00af\5\27\f\2\u00af\u00b0\5\27\f\2\u00b0"+
		"\u00b1\5\27\f\2\u00b1\u00b2\5\25\13\2\u00b2\u00b9\3\2\2\2\u00b3\u00b4"+
		"\5\25\13\2\u00b4\u00b5\5\25\13\2\u00b5\u00b6\5\25\13\2\u00b6\u00b7\5\25"+
		"\13\2\u00b7\u00b9\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9"+
		"\32\3\2\2\2\u00ba\u00bb\7\67\2\2\u00bb\u00bc\t\21\2\2\u00bc\u00bd\5\27"+
		"\f\2\u00bd\u00be\5\27\f\2\u00be\u00bf\5\27\f\2\u00bf\u00c0\5\3\2\2\u00c0"+
		"\u00c1\5\3\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7\65\2\2\u00c3\u00c4\t\22"+
		"\2\2\u00c4\u00c5\5\27\f\2\u00c5\u00c6\5\27\f\2\u00c6\u00c7\5\27\f\2\u00c7"+
		"\u00c8\5\3\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7\65\2\2\u00ca\u00cb\7\62"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\t\23\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\5\25\13\2\u00cf\u00d0\5\25\13\2\u00d0\u00d1\5\25\13\2\u00d1\u00d2"+
		"\5\3\2\2\u00d2\u00d3\5\3\2\2\u00d3\u00e0\3\2\2\2\u00d4\u00d5\7\65\2\2"+
		"\u00d5\u00d9\78\2\2\u00d6\u00d7\7\65\2\2\u00d7\u00d9\7:\2\2\u00d8\u00d4"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5\25\13\2"+
		"\u00db\u00dc\5\25\13\2\u00dc\u00dd\5\25\13\2\u00dd\u00de\5\25\13\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00c9\3\2\2\2\u00df\u00d8\3\2\2\2\u00e0 \3\2\2\2"+
		"\u00e1\u00e2\78\2\2\u00e2\u00e3\7\62\2\2\u00e3\u00e4\7\63\2\2\u00e4\u00e5"+
		"\7\63\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5\27\f\2\u00e7\u00e8\5\27\f"+
		"\2\u00e8\u00e9\5\27\f\2\u00e9\u00f4\3\2\2\2\u00ea\u00eb\78\2\2\u00eb\u00ec"+
		"\7\67\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\27\f\2\u00ee\u00ef\5\27\f"+
		"\2\u00ef\u00f0\5\27\f\2\u00f0\u00f1\5\3\2\2\u00f1\u00f2\5\3\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00e1\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f4\"\3\2\2\2"+
		"\u00f5\u00f6\7\64\2\2\u00f6\u00f7\7\63\2\2\u00f7\u00f8\7\65\2\2\u00f8"+
		"\u00fe\7\63\2\2\u00f9\u00fa\7\63\2\2\u00fa\u00fb\7:\2\2\u00fb\u00fc\7"+
		"\62\2\2\u00fc\u00fe\7\62\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\5\25\13\2\u0100\u0101\5\25\13\2\u0101\u0102"+
		"\5\25\13\2\u0102\u0103\5\3\2\2\u0103\u0104\5\3\2\2\u0104\u010f\3\2\2\2"+
		"\u0105\u0106\7\65\2\2\u0106\u0107\7\67\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\5\25\13\2\u0109\u010a\5\25\13\2\u010a\u010b\5\25\13\2\u010b\u010c\5\27"+
		"\f\2\u010c\u010d\5\3\2\2\u010d\u010f\3\2\2\2\u010e\u00fd\3\2\2\2\u010e"+
		"\u0105\3\2\2\2\u010f$\3\2\2\2\u0110\u0111\7}\2\2\u0111\u0112\b\23\2\2"+
		"\u0112&\3\2\2\2\u0113\u0114\7\177\2\2\u0114\u0115\b\24\3\2\u0115(\3\2"+
		"\2\2\u0116\u0117\6\25\2\2\u0117\u0118\7$\2\2\u0118\u0119\5\t\5\2\u0119"+
		"\u011a\7$\2\2\u011a\u011b\7<\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\25"+
		"\4\2\u011d*\3\2\2\2\u011e\u011f\6\26\3\2\u011f\u0120\7$\2\2\u0120\u0121"+
		"\5\13\6\2\u0121\u0122\7B\2\2\u0122\u0123\5\r\7\2\u0123\u0125\7$\2\2\u0124"+
		"\u0126\7.\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\b\26\5\2\u0128,\3\2\2\2\u0129\u012a\6\27\4\2\u012a\u012b"+
		"\7$\2\2\u012b\u012c\5\17\b\2\u012c\u012d\7\61\2\2\u012d\u012e\5\21\t\2"+
		"\u012e\u012f\7\61\2\2\u012f\u0130\5\23\n\2\u0130\u0132\7$\2\2\u0131\u0133"+
		"\7.\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\b\27\6\2\u0135.\3\2\2\2\u0136\u0137\6\30\5\2\u0137\u0151\7$\2\2"+
		"\u0138\u0139\5\25\13\2\u0139\u013a\7/\2\2\u013a\u013b\5\25\13\2\u013b"+
		"\u013c\7/\2\2\u013c\u013d\5\27\f\2\u013d\u0152\3\2\2\2\u013e\u013f\7*"+
		"\2\2\u013f\u0140\5\25\13\2\u0140\u0141\7+\2\2\u0141\u0142\5\25\13\2\u0142"+
		"\u0143\7/\2\2\u0143\u0144\5\27\f\2\u0144\u0152\3\2\2\2\u0145\u0146\5\25"+
		"\13\2\u0146\u0147\7\"\2\2\u0147\u0148\5\25\13\2\u0148\u0149\7\"\2\2\u0149"+
		"\u014a\5\27\f\2\u014a\u0152\3\2\2\2\u014b\u014c\5\25\13\2\u014c\u014d"+
		"\7\60\2\2\u014d\u014e\5\25\13\2\u014e\u014f\7\60\2\2\u014f\u0150\5\27"+
		"\f\2\u0150\u0152\3\2\2\2\u0151\u0138\3\2\2\2\u0151\u013e\3\2\2\2\u0151"+
		"\u0145\3\2\2\2\u0151\u014b\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\7$"+
		"\2\2\u0154\u0156\7.\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\b\30\7\2\u0158\60\3\2\2\2\u0159\u015a\6\31"+
		"\6\2\u015a\u0161\7$\2\2\u015b\u0162\5\31\r\2\u015c\u0162\5\33\16\2\u015d"+
		"\u0162\5\35\17\2\u015e\u0162\5\37\20\2\u015f\u0162\5!\21\2\u0160\u0162"+
		"\5#\22\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161"+
		"\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0165\7$\2\2\u0164\u0166\7.\2\2\u0165\u0164\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\31\b\2\u0168\62\3\2\2\2\u0169"+
		"\u016a\6\32\7\2\u016a\u016f\7$\2\2\u016b\u0170\5\3\2\2\u016c\u0170\5\5"+
		"\3\2\u016d\u0170\5\7\4\2\u016e\u0170\7\"\2\2\u016f\u016b\3\2\2\2\u016f"+
		"\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\7$\2\2\u0174\u0176\7.\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0178\b\32\t\2\u0178\64\3\2\2\2\u0179\u017b"+
		"\t\24\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b\33\n\2\u017f\66"+
		"\3\2\2\2+\2CHJMOTY[^afhkpu{}\177\u0085\u008c\u008f\u0094\u0097\u00a2\u00b8"+
		"\u00d8\u00df\u00f3\u00fd\u010e\u0125\u0132\u0151\u0155\u0161\u0165\u016f"+
		"\u0171\u0175\u017c\13\3\23\2\3\24\3\3\25\4\3\26\5\3\27\6\3\30\7\3\31\b"+
		"\3\32\t\3\33\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}