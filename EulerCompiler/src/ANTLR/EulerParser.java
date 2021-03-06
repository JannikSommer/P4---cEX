// Generated from C:/Users/janni/Documents/GitHub/P4---cEX/EulerCompiler/Grammar\Euler.g4 by ANTLR 4.8
package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EulerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, ASSIGN=2, LT=3, BT=4, EQEQ=5, NOTEQ=6, LTEQ=7, BTEQ=8, IF=9, THEN=10, 
		ELSE=11, END=12, WHILE=13, DO=14, NUMKW=15, VECKW=16, MTXKW=17, PRINT=18, 
		PLUS=19, MINUS=20, MULT=21, DIVID=22, MOD=23, LPAREN=24, RPAREN=25, LSQBRACK=26, 
		RSQBRACK=27, COMMA=28, NUM=29, MATRIX=30, VECTOR=31, STRING=32, ID=33, 
		WHITESPACE=34, COMMENT1=35, COMMENT2=36;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_dcl = 2, RULE_expr = 3, RULE_ifstmt = 4, 
		RULE_elsestmts = 5, RULE_elseifstmts = 6, RULE_printstmt = 7, RULE_stringstmt = 8, 
		RULE_valindex = 9, RULE_whilestmt = 10, RULE_assignstmt = 11, RULE_addexpr = 12, 
		RULE_multiexpr = 13, RULE_primeexpr = 14, RULE_logstmt = 15, RULE_logop = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "dcl", "expr", "ifstmt", "elsestmts", "elseifstmts", 
			"printstmt", "stringstmt", "valindex", "whilestmt", "assignstmt", "addexpr", 
			"multiexpr", "primeexpr", "logstmt", "logop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", "'if'", 
			"'then'", "'else'", "'end'", "'while'", "'do'", "'num'", "'vec'", "'mtx'", 
			"'print'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", "BTEQ", 
			"IF", "THEN", "ELSE", "END", "WHILE", "DO", "NUMKW", "VECKW", "MTXKW", 
			"PRINT", "PLUS", "MINUS", "MULT", "DIVID", "MOD", "LPAREN", "RPAREN", 
			"LSQBRACK", "RSQBRACK", "COMMA", "NUM", "MATRIX", "VECTOR", "STRING", 
			"ID", "WHITESPACE", "COMMENT1", "COMMENT2"
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
	public String getGrammarFileName() { return "Euler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EulerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				stmt();
				}
				}
				setState(39);
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EulerParser.SEMI, 0); }
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				expr();
				setState(41);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				dcl();
				setState(44);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				whilestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				assignstmt();
				setState(49);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				printstmt();
				setState(52);
				match(SEMI);
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

	public static class DclContext extends ParserRuleContext {
		public TerminalNode NUMKW() { return getToken(EulerParser.NUMKW, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VECKW() { return getToken(EulerParser.VECKW, 0); }
		public TerminalNode VECTOR() { return getToken(EulerParser.VECTOR, 0); }
		public TerminalNode MTXKW() { return getToken(EulerParser.MTXKW, 0); }
		public TerminalNode MATRIX() { return getToken(EulerParser.MATRIX, 0); }
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(NUMKW);
				setState(57);
				match(ID);
				setState(58);
				match(ASSIGN);
				setState(59);
				expr();
				}
				break;
			case VECKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(VECKW);
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VECTOR:
					{
					setState(63);
					match(VECTOR);
					}
					break;
				case LPAREN:
				case NUM:
				case ID:
					{
					setState(64);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case MTXKW:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(MTXKW);
				setState(68);
				match(ID);
				setState(69);
				match(ASSIGN);
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MATRIX:
					{
					setState(70);
					match(MATRIX);
					}
					break;
				case LPAREN:
				case NUM:
				case ID:
					{
					setState(71);
					expr();
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

	public static class ExprContext extends ParserRuleContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			addexpr();
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EulerParser.IF, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
		public TerminalNode END() { return getToken(EulerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElsestmtsContext elsestmts() {
			return getRuleContext(ElsestmtsContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			logstmt();
			setState(80);
			match(THEN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				stmt();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(87);
				elsestmts();
				}
			}

			setState(90);
			match(END);
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

	public static class ElsestmtsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EulerParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
		public List<ElseifstmtsContext> elseifstmts() {
			return getRuleContexts(ElseifstmtsContext.class);
		}
		public ElseifstmtsContext elseifstmts(int i) {
			return getRuleContext(ElseifstmtsContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElsestmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterElsestmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitElsestmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitElsestmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestmtsContext elsestmts() throws RecognitionException {
		ElsestmtsContext _localctx = new ElsestmtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsestmts);
		int _la;
		try {
			int _alt;
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						elseifstmts();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(98);
				match(ELSE);
				setState(99);
				match(THEN);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					stmt();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					elseifstmts();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELSE );
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

	public static class ElseifstmtsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EulerParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(EulerParser.IF, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EulerParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseifstmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterElseifstmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitElseifstmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitElseifstmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstmtsContext elseifstmts() throws RecognitionException {
		ElseifstmtsContext _localctx = new ElseifstmtsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseifstmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ELSE);
			setState(114);
			match(IF);
			setState(115);
			logstmt();
			setState(116);
			match(THEN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(117);
				stmt();
				}
				}
				setState(122);
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EulerParser.PRINT, 0); }
		public List<StringstmtContext> stringstmt() {
			return getRuleContexts(StringstmtContext.class);
		}
		public StringstmtContext stringstmt(int i) {
			return getRuleContext(StringstmtContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(EulerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(EulerParser.PLUS, i);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitPrintstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PRINT);
			setState(124);
			stringstmt();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(125);
				match(PLUS);
				setState(126);
				stringstmt();
				}
				}
				setState(131);
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

	public static class StringstmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EulerParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public StringstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterStringstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitStringstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitStringstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringstmtContext stringstmt() throws RecognitionException {
		StringstmtContext _localctx = new StringstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringstmt);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(STRING);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(135);
					valindex();
					}
				}

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

	public static class ValindexContext extends ParserRuleContext {
		public TerminalNode LSQBRACK() { return getToken(EulerParser.LSQBRACK, 0); }
		public List<TerminalNode> NUM() { return getTokens(EulerParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(EulerParser.NUM, i);
		}
		public TerminalNode RSQBRACK() { return getToken(EulerParser.RSQBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EulerParser.COMMA, i);
		}
		public ValindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterValindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitValindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitValindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValindexContext valindex() throws RecognitionException {
		ValindexContext _localctx = new ValindexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valindex);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(LSQBRACK);
				setState(141);
				match(NUM);
				setState(142);
				match(RSQBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(LSQBRACK);
				setState(144);
				match(NUM);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					match(NUM);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(RSQBRACK);
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

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EulerParser.WHILE, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode DO() { return getToken(EulerParser.DO, 0); }
		public TerminalNode END() { return getToken(EulerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whilestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WHILE);
			setState(156);
			logstmt();
			setState(157);
			match(DO);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << NUMKW) | (1L << VECKW) | (1L << MTXKW) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(158);
				stmt();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(END);
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

	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode VECTOR() { return getToken(EulerParser.VECTOR, 0); }
		public TerminalNode MATRIX() { return getToken(EulerParser.MATRIX, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignstmt);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ID);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(167);
					valindex();
					}
				}

				setState(170);
				match(ASSIGN);
				setState(171);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(ID);
				setState(173);
				match(ASSIGN);
				setState(174);
				match(VECTOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(ID);
				setState(176);
				match(ASSIGN);
				setState(177);
				match(MATRIX);
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

	public static class AddexprContext extends ParserRuleContext {
		public Token op;
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(EulerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EulerParser.MINUS, 0); }
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitAddexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addexpr);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				multiexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				multiexpr();
				setState(182);
				((AddexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((AddexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				addexpr();
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

	public static class MultiexprContext extends ParserRuleContext {
		public Token op;
		public PrimeexprContext primeexpr() {
			return getRuleContext(PrimeexprContext.class,0);
		}
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public TerminalNode MULT() { return getToken(EulerParser.MULT, 0); }
		public TerminalNode DIVID() { return getToken(EulerParser.DIVID, 0); }
		public TerminalNode MOD() { return getToken(EulerParser.MOD, 0); }
		public MultiexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterMultiexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitMultiexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitMultiexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiexprContext multiexpr() throws RecognitionException {
		MultiexprContext _localctx = new MultiexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiexpr);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				primeexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				primeexpr();
				setState(189);
				((MultiexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVID) | (1L << MOD))) != 0)) ) {
					((MultiexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				multiexpr();
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

	public static class PrimeexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerParser.NUM, 0); }
		public TerminalNode LPAREN() { return getToken(EulerParser.LPAREN, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EulerParser.RPAREN, 0); }
		public PrimeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterPrimeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitPrimeexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitPrimeexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeexprContext primeexpr() throws RecognitionException {
		PrimeexprContext _localctx = new PrimeexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primeexpr);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ID);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(195);
					valindex();
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(LPAREN);
				setState(200);
				addexpr();
				setState(201);
				match(RPAREN);
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

	public static class LogstmtContext extends ParserRuleContext {
		public List<AddexprContext> addexpr() {
			return getRuleContexts(AddexprContext.class);
		}
		public AddexprContext addexpr(int i) {
			return getRuleContext(AddexprContext.class,i);
		}
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public LogstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterLogstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitLogstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitLogstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogstmtContext logstmt() throws RecognitionException {
		LogstmtContext _localctx = new LogstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			addexpr();
			setState(206);
			logop();
			setState(207);
			addexpr();
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

	public static class LogopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode EQEQ() { return getToken(EulerParser.EQEQ, 0); }
		public TerminalNode BT() { return getToken(EulerParser.BT, 0); }
		public TerminalNode LT() { return getToken(EulerParser.LT, 0); }
		public TerminalNode BTEQ() { return getToken(EulerParser.BTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(EulerParser.LTEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(EulerParser.NOTEQ, 0); }
		public LogopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).enterLogop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerListener ) ((EulerListener)listener).exitLogop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerVisitor ) return ((EulerVisitor<? extends T>)visitor).visitLogop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((LogopContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << BT) | (1L << EQEQ) | (1L << NOTEQ) | (1L << LTEQ) | (1L << BTEQ))) != 0)) ) {
				((LogopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4K\n\4\5\4M\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6U\n\6"+
		"\f\6\16\6X\13\6\3\6\5\6[\n\6\3\6\3\6\3\7\7\7`\n\7\f\7\16\7c\13\7\3\7\3"+
		"\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\6\7n\n\7\r\7\16\7o\5\7r\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t"+
		"\16\t\u0085\13\t\3\n\3\n\3\n\3\n\5\n\u008b\n\n\5\n\u008d\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\13"+
		"\5\13\u009c\n\13\3\f\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f"+
		"\3\f\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b5\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00c3\n\17\3\20\3\20\5\20\u00c7\n\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00ce\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\5\3\2\25\26\3\2\27\31\3\2\5\n\2\u00e4\2\'\3"+
		"\2\2\2\48\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fq\3\2\2\2\16s\3\2"+
		"\2\2\20}\3\2\2\2\22\u008c\3\2\2\2\24\u009b\3\2\2\2\26\u009d\3\2\2\2\30"+
		"\u00b4\3\2\2\2\32\u00bb\3\2\2\2\34\u00c2\3\2\2\2\36\u00cd\3\2\2\2 \u00cf"+
		"\3\2\2\2\"\u00d3\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3"+
		"\2\2\2(\3\3\2\2\2)\'\3\2\2\2*+\5\b\5\2+,\7\3\2\2,9\3\2\2\2-.\5\6\4\2."+
		"/\7\3\2\2/9\3\2\2\2\609\5\n\6\2\619\5\26\f\2\62\63\5\30\r\2\63\64\7\3"+
		"\2\2\649\3\2\2\2\65\66\5\20\t\2\66\67\7\3\2\2\679\3\2\2\28*\3\2\2\28-"+
		"\3\2\2\28\60\3\2\2\28\61\3\2\2\28\62\3\2\2\28\65\3\2\2\29\5\3\2\2\2:;"+
		"\7\21\2\2;<\7#\2\2<=\7\4\2\2=M\5\b\5\2>?\7\22\2\2?@\7#\2\2@C\7\4\2\2A"+
		"D\7!\2\2BD\5\b\5\2CA\3\2\2\2CB\3\2\2\2DM\3\2\2\2EF\7\23\2\2FG\7#\2\2G"+
		"J\7\4\2\2HK\7 \2\2IK\5\b\5\2JH\3\2\2\2JI\3\2\2\2KM\3\2\2\2L:\3\2\2\2L"+
		">\3\2\2\2LE\3\2\2\2M\7\3\2\2\2NO\5\32\16\2O\t\3\2\2\2PQ\7\13\2\2QR\5 "+
		"\21\2RV\7\f\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2Y[\5\f\7\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\16\2\2"+
		"]\13\3\2\2\2^`\5\16\b\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2"+
		"\2\2ca\3\2\2\2de\7\r\2\2ei\7\f\2\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2jr\3\2\2\2ki\3\2\2\2ln\5\16\b\2ml\3\2\2\2no\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2qa\3\2\2\2qm\3\2\2\2r\r\3\2\2\2st\7\r\2\2tu"+
		"\7\13\2\2uv\5 \21\2vz\7\f\2\2wy\5\4\3\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\17\3\2\2\2|z\3\2\2\2}~\7\24\2\2~\u0083\5\22\n\2\177\u0080"+
		"\7\25\2\2\u0080\u0082\5\22\n\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0086\u008d\7\"\2\2\u0087\u008d\7\37\2\2\u0088\u008a\7#\2\2\u0089\u008b"+
		"\5\24\13\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2"+
		"\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008d\23"+
		"\3\2\2\2\u008e\u008f\7\34\2\2\u008f\u0090\7\37\2\2\u0090\u009c\7\35\2"+
		"\2\u0091\u0092\7\34\2\2\u0092\u0097\7\37\2\2\u0093\u0094\7\36\2\2\u0094"+
		"\u0096\7\37\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\7\35\2\2\u009b\u008e\3\2\2\2\u009b\u0091\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009e\7\17\2\2\u009e\u009f\5 \21\2\u009f\u00a3\7\20\2\2\u00a0"+
		"\u00a2\5\4\3\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\16\2\2\u00a7\27\3\2\2\2\u00a8\u00aa\7#\2\2\u00a9\u00ab\5\24\13"+
		"\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\7\4\2\2\u00ad\u00b5\5\b\5\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\4\2\2\u00b0"+
		"\u00b5\7!\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b5\7 \2"+
		"\2\u00b4\u00a8\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\31"+
		"\3\2\2\2\u00b6\u00bc\5\34\17\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\t\2\2"+
		"\2\u00b9\u00ba\5\32\16\2\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00c3\5\36\20\2\u00be\u00bf\5\36"+
		"\20\2\u00bf\u00c0\t\3\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c6\7#\2\2"+
		"\u00c5\u00c7\5\24\13\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ce"+
		"\3\2\2\2\u00c8\u00ce\7\37\2\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb\5\32\16"+
		"\2\u00cb\u00cc\7\33\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd"+
		"\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00d0\5\32\16"+
		"\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\5\32\16\2\u00d2!\3\2\2\2\u00d3\u00d4"+
		"\t\4\2\2\u00d4#\3\2\2\2\32\'8CJLVZaioqz\u0083\u008a\u008c\u0097\u009b"+
		"\u00a3\u00aa\u00b4\u00bb\u00c2\u00c6\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}