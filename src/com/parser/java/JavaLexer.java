// Generated from Java.g4 by ANTLR 4.5
package com.parser.java;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", 
		"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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


		
		int whiteSpaceCount = 0;
		int lineCommentCount = 0;
		String strComment;
		String strLineComment;
		int specialCharCount = 0;
		ArrayList<String> arrSpecialCharacter =  new  ArrayList<String>();
		ArrayList<String> arrKeywords =  new  ArrayList<String>();


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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
		case 0:
			ABSTRACT_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ASSERT_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			BOOLEAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			BREAK_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			BYTE_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			CASE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			CATCH_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			CLASS_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			CONTINUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			DEFAULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			DOUBLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			ENUM_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			EXTENDS_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			FINAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			FINALLY_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			FLOAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			GOTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			IMPLEMENTS_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			IMPORT_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			INSTANCEOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			INTERFACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			LONG_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			NATIVE_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			NEW_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			PACKAGE_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			PRIVATE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			PROTECTED_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			PUBLIC_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			RETURN_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			SHORT_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			STATIC_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			STRICTFP_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			SUPER_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			SWITCH_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			SYNCHRONIZED_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			THIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			THROW_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			THROWS_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			TRANSIENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			TRY_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			VOID_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			VOLATILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 98:
			LBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 99:
			RBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 100:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 101:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 102:
			SEMI_action((RuleContext)_localctx, actionIndex);
			break;
		case 103:
			COMMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 104:
			DOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 105:
			ASSIGN_action((RuleContext)_localctx, actionIndex);
			break;
		case 106:
			GT_action((RuleContext)_localctx, actionIndex);
			break;
		case 107:
			LT_action((RuleContext)_localctx, actionIndex);
			break;
		case 108:
			BANG_action((RuleContext)_localctx, actionIndex);
			break;
		case 109:
			TILDE_action((RuleContext)_localctx, actionIndex);
			break;
		case 122:
			MUL_action((RuleContext)_localctx, actionIndex);
			break;
		case 144:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 145:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 146:
			LINE_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ABSTRACT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			arrKeywords.add(getText());
			break;
		}
	}
	private void ASSERT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			arrKeywords.add(getText());
			break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			arrKeywords.add(getText());
			break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			arrKeywords.add(getText());
			break;
		}
	}
	private void BYTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			arrKeywords.add(getText());
			break;
		}
	}
	private void CASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			arrKeywords.add(getText());
			break;
		}
	}
	private void CATCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			arrKeywords.add(getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			arrKeywords.add(getText());
			break;
		}
	}
	private void CLASS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			arrKeywords.add(getText());
			break;
		}
	}
	private void CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			arrKeywords.add(getText());
			break;
		}
	}
	private void CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			arrKeywords.add(getText());
			break;
		}
	}
	private void DEFAULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			arrKeywords.add(getText());
			break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			arrKeywords.add(getText());
			break;
		}
	}
	private void DOUBLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			arrKeywords.add(getText());
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			arrKeywords.add(getText());
			break;
		}
	}
	private void ENUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			arrKeywords.add(getText());
			break;
		}
	}
	private void EXTENDS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			arrKeywords.add(getText());
			break;
		}
	}
	private void FINAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			arrKeywords.add(getText());
			break;
		}
	}
	private void FINALLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			arrKeywords.add(getText());
			break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			arrKeywords.add(getText());
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			arrKeywords.add(getText());
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			arrKeywords.add(getText());
			break;
		}
	}
	private void GOTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			arrKeywords.add(getText());
			break;
		}
	}
	private void IMPLEMENTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			arrKeywords.add(getText());
			break;
		}
	}
	private void IMPORT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			arrKeywords.add(getText());
			break;
		}
	}
	private void INSTANCEOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			arrKeywords.add(getText());
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			arrKeywords.add(getText());
			break;
		}
	}
	private void INTERFACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			arrKeywords.add(getText());
			break;
		}
	}
	private void LONG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			arrKeywords.add(getText());
			break;
		}
	}
	private void NATIVE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			arrKeywords.add(getText());
			break;
		}
	}
	private void NEW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			arrKeywords.add(getText());
			break;
		}
	}
	private void PACKAGE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			arrKeywords.add(getText());
			break;
		}
	}
	private void PRIVATE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			arrKeywords.add(getText());
			break;
		}
	}
	private void PROTECTED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			arrKeywords.add(getText());
			break;
		}
	}
	private void PUBLIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			arrKeywords.add(getText());
			break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			arrKeywords.add(getText());
			break;
		}
	}
	private void SHORT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			arrKeywords.add(getText());
			break;
		}
	}
	private void STATIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			arrKeywords.add(getText());
			break;
		}
	}
	private void STRICTFP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			arrKeywords.add(getText());
			break;
		}
	}
	private void SUPER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:
			arrKeywords.add(getText());
			break;
		}
	}
	private void SWITCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:
			arrKeywords.add(getText());
			break;
		}
	}
	private void SYNCHRONIZED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			arrKeywords.add(getText());
			break;
		}
	}
	private void THIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			arrKeywords.add(getText());
			break;
		}
	}
	private void THROW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			arrKeywords.add(getText());
			break;
		}
	}
	private void THROWS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			arrKeywords.add(getText());
			break;
		}
	}
	private void TRANSIENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			arrKeywords.add(getText());
			break;
		}
	}
	private void TRY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:
			arrKeywords.add(getText());
			break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:
			arrKeywords.add(getText());
			break;
		}
	}
	private void VOLATILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:
			arrKeywords.add(getText());
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49:
			arrKeywords.add(getText());
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 51:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 53:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 55:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void SEMI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 56:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 57:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void DOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 58:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 59:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 60:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 61:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void BANG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 62:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void TILDE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 63:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void MUL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 64:
			arrSpecialCharacter.add(getText());specialCharCount++;
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 65:
			whiteSpaceCount++;
			break;
		case 66:
			whiteSpaceCount++;
			break;
		case 67:
			whiteSpaceCount++;
			break;
		case 68:
			whiteSpaceCount++;
			break;
		case 69:
			whiteSpaceCount++;
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 70:
			 lineCommentCount = lineCommentCount+1 + getText().length();
			    	/*System.out.println("---------------------------------------------------------------- COMMENT COUNT IS"+ getText().length() );
			    	{strComment=getText(); System.out.println("COMMENT Char count hi is"+ getText()); }*/ 
			        
			        skip();
			break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 71:
			{ lineCommentCount = lineCommentCount+1 + getText().length();
			    	/*System.out.println("---------------------------------------------------------------- COMMENT COUNT IS"+ getText().length() );
			    	{strComment=getText(); System.out.println("COMMENT Char count hi is"+ getText()); }*/ 
			        } 
			        skip();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 140:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 141:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2k\u04aa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u02e5\n\64"+
		"\3\65\3\65\5\65\u02e9\n\65\3\66\3\66\5\66\u02ed\n\66\3\67\3\67\5\67\u02f1"+
		"\n\67\38\38\58\u02f5\n8\39\39\3:\3:\3:\5:\u02fc\n:\3:\3:\3:\5:\u0301\n"+
		":\5:\u0303\n:\3;\3;\7;\u0307\n;\f;\16;\u030a\13;\3;\5;\u030d\n;\3<\3<"+
		"\5<\u0311\n<\3=\3=\3>\3>\5>\u0317\n>\3?\6?\u031a\n?\r?\16?\u031b\3@\3"+
		"@\3@\3@\3A\3A\7A\u0324\nA\fA\16A\u0327\13A\3A\5A\u032a\nA\3B\3B\3C\3C"+
		"\5C\u0330\nC\3D\3D\5D\u0334\nD\3D\3D\3E\3E\7E\u033a\nE\fE\16E\u033d\13"+
		"E\3E\5E\u0340\nE\3F\3F\3G\3G\5G\u0346\nG\3H\3H\3H\3H\3I\3I\7I\u034e\n"+
		"I\fI\16I\u0351\13I\3I\5I\u0354\nI\3J\3J\3K\3K\5K\u035a\nK\3L\3L\5L\u035e"+
		"\nL\3M\3M\3M\5M\u0363\nM\3M\5M\u0366\nM\3M\5M\u0369\nM\3M\3M\3M\5M\u036e"+
		"\nM\3M\5M\u0371\nM\3M\3M\3M\5M\u0376\nM\3M\3M\3M\5M\u037b\nM\3N\3N\3N"+
		"\3O\3O\3P\5P\u0383\nP\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\5S\u038e\nS\3T\3T\5T"+
		"\u0392\nT\3T\3T\3T\5T\u0397\nT\3T\3T\5T\u039b\nT\3U\3U\3U\3V\3V\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\5W\u03ab\nW\3X\3X\3X\3X\3X\3X\3X\3X\5X\u03b5\nX"+
		"\3Y\3Y\3Z\3Z\5Z\u03bb\nZ\3Z\3Z\3[\6[\u03c0\n[\r[\16[\u03c1\3\\\3\\\5\\"+
		"\u03c6\n\\\3]\3]\3]\3]\5]\u03cc\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5"+
		"^\u03d9\n^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3c\3c\3"+
		"c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3"+
		"k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3n\3o\3o\3o\3p\3p\3q\3q\3r\3r\3r\3s\3s\3"+
		"s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3{\3{\3"+
		"|\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\7\u008d\u0467\n\u008d\f\u008d\16\u008d\u046a\13\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0472\n\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u047a\n\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\6\u0092\u048c"+
		"\n\u0092\r\u0092\16\u0092\u048d\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\7\u0093\u0496\n\u0093\f\u0093\16\u0093\u0499\13\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094"+
		"\u04a4\n\u0094\f\u0094\16\u0094\u04a7\13\u0094\3\u0094\3\u0094\3\u0497"+
		"\2\u0095\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2"+
		"k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\66\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad"+
		"\67\u00af8\u00b1\2\u00b39\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf"+
		"\2\u00c1:\u00c3;\u00c5<\u00c7=\u00c9>\u00cb?\u00cd@\u00cfA\u00d1B\u00d3"+
		"C\u00d5D\u00d7E\u00d9F\u00dbG\u00ddH\u00dfI\u00e1J\u00e3K\u00e5L\u00e7"+
		"M\u00e9N\u00ebO\u00edP\u00efQ\u00f1R\u00f3S\u00f5T\u00f7U\u00f9V\u00fb"+
		"W\u00fdX\u00ffY\u0101Z\u0103[\u0105\\\u0107]\u0109^\u010b_\u010d`\u010f"+
		"a\u0111b\u0113c\u0115d\u0117e\u0119f\u011b\2\u011d\2\u011fg\u0121h\u0123"+
		"i\u0125j\u0127k\3\2\27\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2"+
		"DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2\f\f\17\17\u04bc\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2\u0097\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3"+
		"\2\2\2\2\u00b3\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2"+
		"\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2"+
		"\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3"+
		"\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2"+
		"\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105"+
		"\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2"+
		"\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117"+
		"\3\2\2\2\2\u0119\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2"+
		"\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\3\u0129\3\2\2\2\5\u0134\3\2\2\2\7\u013d"+
		"\3\2\2\2\t\u0147\3\2\2\2\13\u014f\3\2\2\2\r\u0156\3\2\2\2\17\u015d\3\2"+
		"\2\2\21\u0165\3\2\2\2\23\u016c\3\2\2\2\25\u0174\3\2\2\2\27\u017c\3\2\2"+
		"\2\31\u0187\3\2\2\2\33\u0191\3\2\2\2\35\u0196\3\2\2\2\37\u019f\3\2\2\2"+
		"!\u01a6\3\2\2\2#\u01ad\3\2\2\2%\u01b7\3\2\2\2\'\u01bf\3\2\2\2)\u01c9\3"+
		"\2\2\2+\u01d1\3\2\2\2-\u01d7\3\2\2\2/\u01dc\3\2\2\2\61\u01e3\3\2\2\2\63"+
		"\u01f0\3\2\2\2\65\u01f9\3\2\2\2\67\u0206\3\2\2\29\u020c\3\2\2\2;\u0218"+
		"\3\2\2\2=\u021f\3\2\2\2?\u0228\3\2\2\2A\u022e\3\2\2\2C\u0238\3\2\2\2E"+
		"\u0242\3\2\2\2G\u024e\3\2\2\2I\u0257\3\2\2\2K\u0260\3\2\2\2M\u0268\3\2"+
		"\2\2O\u0271\3\2\2\2Q\u027c\3\2\2\2S\u0284\3\2\2\2U\u028d\3\2\2\2W\u029c"+
		"\3\2\2\2Y\u02a3\3\2\2\2[\u02ab\3\2\2\2]\u02b4\3\2\2\2_\u02c0\3\2\2\2a"+
		"\u02c6\3\2\2\2c\u02cd\3\2\2\2e\u02d8\3\2\2\2g\u02e4\3\2\2\2i\u02e6\3\2"+
		"\2\2k\u02ea\3\2\2\2m\u02ee\3\2\2\2o\u02f2\3\2\2\2q\u02f6\3\2\2\2s\u0302"+
		"\3\2\2\2u\u0304\3\2\2\2w\u0310\3\2\2\2y\u0312\3\2\2\2{\u0316\3\2\2\2}"+
		"\u0319\3\2\2\2\177\u031d\3\2\2\2\u0081\u0321\3\2\2\2\u0083\u032b\3\2\2"+
		"\2\u0085\u032f\3\2\2\2\u0087\u0331\3\2\2\2\u0089\u0337\3\2\2\2\u008b\u0341"+
		"\3\2\2\2\u008d\u0345\3\2\2\2\u008f\u0347\3\2\2\2\u0091\u034b\3\2\2\2\u0093"+
		"\u0355\3\2\2\2\u0095\u0359\3\2\2\2\u0097\u035d\3\2\2\2\u0099\u037a\3\2"+
		"\2\2\u009b\u037c\3\2\2\2\u009d\u037f\3\2\2\2\u009f\u0382\3\2\2\2\u00a1"+
		"\u0386\3\2\2\2\u00a3\u0388\3\2\2\2\u00a5\u038a\3\2\2\2\u00a7\u039a\3\2"+
		"\2\2\u00a9\u039c\3\2\2\2\u00ab\u039f\3\2\2\2\u00ad\u03aa\3\2\2\2\u00af"+
		"\u03b4\3\2\2\2\u00b1\u03b6\3\2\2\2\u00b3\u03b8\3\2\2\2\u00b5\u03bf\3\2"+
		"\2\2\u00b7\u03c5\3\2\2\2\u00b9\u03cb\3\2\2\2\u00bb\u03d8\3\2\2\2\u00bd"+
		"\u03da\3\2\2\2\u00bf\u03e1\3\2\2\2\u00c1\u03e3\3\2\2\2\u00c3\u03e8\3\2"+
		"\2\2\u00c5\u03eb\3\2\2\2\u00c7\u03ee\3\2\2\2\u00c9\u03f1\3\2\2\2\u00cb"+
		"\u03f4\3\2\2\2\u00cd\u03f7\3\2\2\2\u00cf\u03fa\3\2\2\2\u00d1\u03fd\3\2"+
		"\2\2\u00d3\u0400\3\2\2\2\u00d5\u0403\3\2\2\2\u00d7\u0406\3\2\2\2\u00d9"+
		"\u0409\3\2\2\2\u00db\u040c\3\2\2\2\u00dd\u040f\3\2\2\2\u00df\u0412\3\2"+
		"\2\2\u00e1\u0414\3\2\2\2\u00e3\u0416\3\2\2\2\u00e5\u0419\3\2\2\2\u00e7"+
		"\u041c\3\2\2\2\u00e9\u041f\3\2\2\2\u00eb\u0422\3\2\2\2\u00ed\u0425\3\2"+
		"\2\2\u00ef\u0428\3\2\2\2\u00f1\u042b\3\2\2\2\u00f3\u042e\3\2\2\2\u00f5"+
		"\u0430\3\2\2\2\u00f7\u0432\3\2\2\2\u00f9\u0435\3\2\2\2\u00fb\u0437\3\2"+
		"\2\2\u00fd\u0439\3\2\2\2\u00ff\u043b\3\2\2\2\u0101\u043d\3\2\2\2\u0103"+
		"\u043f\3\2\2\2\u0105\u0442\3\2\2\2\u0107\u0445\3\2\2\2\u0109\u0448\3\2"+
		"\2\2\u010b\u044b\3\2\2\2\u010d\u044e\3\2\2\2\u010f\u0451\3\2\2\2\u0111"+
		"\u0454\3\2\2\2\u0113\u0457\3\2\2\2\u0115\u045b\3\2\2\2\u0117\u045f\3\2"+
		"\2\2\u0119\u0464\3\2\2\2\u011b\u0471\3\2\2\2\u011d\u0479\3\2\2\2\u011f"+
		"\u047b\3\2\2\2\u0121\u047d\3\2\2\2\u0123\u048b\3\2\2\2\u0125\u0491\3\2"+
		"\2\2\u0127\u049f\3\2\2\2\u0129\u012a\7c\2\2\u012a\u012b\7d\2\2\u012b\u012c"+
		"\7u\2\2\u012c\u012d\7v\2\2\u012d\u012e\7t\2\2\u012e\u012f\7c\2\2\u012f"+
		"\u0130\7e\2\2\u0130\u0131\7v\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b\2\2"+
		"\2\u0133\4\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136\7u\2\2\u0136\u0137\7"+
		"u\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139\u013a\7v\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\b\3\3\2\u013c\6\3\2\2\2\u013d\u013e\7d\2\2\u013e"+
		"\u013f\7q\2\2\u013f\u0140\7q\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2"+
		"\u0142\u0143\7c\2\2\u0143\u0144\7p\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\b\4\4\2\u0146\b\3\2\2\2\u0147\u0148\7d\2\2\u0148\u0149\7t\2\2\u0149\u014a"+
		"\7g\2\2\u014a\u014b\7c\2\2\u014b\u014c\7m\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\b\5\5\2\u014e\n\3\2\2\2\u014f\u0150\7d\2\2\u0150\u0151\7{\2\2\u0151"+
		"\u0152\7v\2\2\u0152\u0153\7g\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\6\6"+
		"\2\u0155\f\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158\7c\2\2\u0158\u0159\7"+
		"u\2\2\u0159\u015a\7g\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\7\7\2\u015c"+
		"\16\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\7c\2\2\u015f\u0160\7v\2\2\u0160"+
		"\u0161\7e\2\2\u0161\u0162\7j\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\b\b"+
		"\2\u0164\20\3\2\2\2\u0165\u0166\7e\2\2\u0166\u0167\7j\2\2\u0167\u0168"+
		"\7c\2\2\u0168\u0169\7t\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\t\t\2\u016b"+
		"\22\3\2\2\2\u016c\u016d\7e\2\2\u016d\u016e\7n\2\2\u016e\u016f\7c\2\2\u016f"+
		"\u0170\7u\2\2\u0170\u0171\7u\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\n\n"+
		"\2\u0173\24\3\2\2\2\u0174\u0175\7e\2\2\u0175\u0176\7q\2\2\u0176\u0177"+
		"\7p\2\2\u0177\u0178\7u\2\2\u0178\u0179\7v\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\b\13\13\2\u017b\26\3\2\2\2\u017c\u017d\7e\2\2\u017d\u017e\7q\2"+
		"\2\u017e\u017f\7p\2\2\u017f\u0180\7v\2\2\u0180\u0181\7k\2\2\u0181\u0182"+
		"\7p\2\2\u0182\u0183\7w\2\2\u0183\u0184\7g\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\b\f\f\2\u0186\30\3\2\2\2\u0187\u0188\7f\2\2\u0188\u0189\7g\2\2"+
		"\u0189\u018a\7h\2\2\u018a\u018b\7c\2\2\u018b\u018c\7w\2\2\u018c\u018d"+
		"\7n\2\2\u018d\u018e\7v\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b\r\r\2\u0190"+
		"\32\3\2\2\2\u0191\u0192\7f\2\2\u0192\u0193\7q\2\2\u0193\u0194\3\2\2\2"+
		"\u0194\u0195\b\16\16\2\u0195\34\3\2\2\2\u0196\u0197\7f\2\2\u0197\u0198"+
		"\7q\2\2\u0198\u0199\7w\2\2\u0199\u019a\7d\2\2\u019a\u019b\7n\2\2\u019b"+
		"\u019c\7g\2\2\u019c\u019d\3\2\2\2\u019d\u019e\b\17\17\2\u019e\36\3\2\2"+
		"\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3"+
		"\7g\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\20\20\2\u01a5 \3\2\2\2\u01a6"+
		"\u01a7\7g\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7w\2\2\u01a9\u01aa\7o\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b\21\21\2\u01ac\"\3\2\2\2\u01ad\u01ae"+
		"\7g\2\2\u01ae\u01af\7z\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7g\2\2\u01b1"+
		"\u01b2\7p\2\2\u01b2\u01b3\7f\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\3\2\2"+
		"\2\u01b5\u01b6\b\22\22\2\u01b6$\3\2\2\2\u01b7\u01b8\7h\2\2\u01b8\u01b9"+
		"\7k\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7n\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\b\23\23\2\u01be&\3\2\2\2\u01bf\u01c0\7h\2\2"+
		"\u01c0\u01c1\7k\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4"+
		"\7n\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7{\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\b\24\24\2\u01c8(\3\2\2\2\u01c9\u01ca\7h\2\2\u01ca\u01cb\7n\2\2"+
		"\u01cb\u01cc\7q\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d0\b\25\25\2\u01d0*\3\2\2\2\u01d1\u01d2\7h\2\2\u01d2"+
		"\u01d3\7q\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\b\26"+
		"\26\2\u01d6,\3\2\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9\7h\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01db\b\27\27\2\u01db.\3\2\2\2\u01dc\u01dd\7i\2\2\u01dd"+
		"\u01de\7q\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7q\2\2\u01e0\u01e1\3\2\2"+
		"\2\u01e1\u01e2\b\30\30\2\u01e2\60\3\2\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5"+
		"\7o\2\2\u01e5\u01e6\7r\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7g\2\2\u01e8"+
		"\u01e9\7o\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7p\2\2\u01eb\u01ec\7v\2\2"+
		"\u01ec\u01ed\7u\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\b\31\31\2\u01ef\62"+
		"\3\2\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7o\2\2\u01f2\u01f3\7r\2\2\u01f3"+
		"\u01f4\7q\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6\7v\2\2\u01f6\u01f7\3\2\2"+
		"\2\u01f7\u01f8\b\32\32\2\u01f8\64\3\2\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb"+
		"\7p\2\2\u01fb\u01fc\7u\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7c\2\2\u01fe"+
		"\u01ff\7p\2\2\u01ff\u0200\7e\2\2\u0200\u0201\7g\2\2\u0201\u0202\7q\2\2"+
		"\u0202\u0203\7h\2\2\u0203\u0204\3\2\2\2\u0204\u0205\b\33\33\2\u0205\66"+
		"\3\2\2\2\u0206\u0207\7k\2\2\u0207\u0208\7p\2\2\u0208\u0209\7v\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\b\34\34\2\u020b8\3\2\2\2\u020c\u020d\7k\2\2"+
		"\u020d\u020e\7p\2\2\u020e\u020f\7v\2\2\u020f\u0210\7g\2\2\u0210\u0211"+
		"\7t\2\2\u0211\u0212\7h\2\2\u0212\u0213\7c\2\2\u0213\u0214\7e\2\2\u0214"+
		"\u0215\7g\2\2\u0215\u0216\3\2\2\2\u0216\u0217\b\35\35\2\u0217:\3\2\2\2"+
		"\u0218\u0219\7n\2\2\u0219\u021a\7q\2\2\u021a\u021b\7p\2\2\u021b\u021c"+
		"\7i\2\2\u021c\u021d\3\2\2\2\u021d\u021e\b\36\36\2\u021e<\3\2\2\2\u021f"+
		"\u0220\7p\2\2\u0220\u0221\7c\2\2\u0221\u0222\7v\2\2\u0222\u0223\7k\2\2"+
		"\u0223\u0224\7x\2\2\u0224\u0225\7g\2\2\u0225\u0226\3\2\2\2\u0226\u0227"+
		"\b\37\37\2\u0227>\3\2\2\2\u0228\u0229\7p\2\2\u0229\u022a\7g\2\2\u022a"+
		"\u022b\7y\2\2\u022b\u022c\3\2\2\2\u022c\u022d\b  \2\u022d@\3\2\2\2\u022e"+
		"\u022f\7r\2\2\u022f\u0230\7c\2\2\u0230\u0231\7e\2\2\u0231\u0232\7m\2\2"+
		"\u0232\u0233\7c\2\2\u0233\u0234\7i\2\2\u0234\u0235\7g\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\b!!\2\u0237B\3\2\2\2\u0238\u0239\7r\2\2\u0239\u023a"+
		"\7t\2\2\u023a\u023b\7k\2\2\u023b\u023c\7x\2\2\u023c\u023d\7c\2\2\u023d"+
		"\u023e\7v\2\2\u023e\u023f\7g\2\2\u023f\u0240\3\2\2\2\u0240\u0241\b\"\""+
		"\2\u0241D\3\2\2\2\u0242\u0243\7r\2\2\u0243\u0244\7t\2\2\u0244\u0245\7"+
		"q\2\2\u0245\u0246\7v\2\2\u0246\u0247\7g\2\2\u0247\u0248\7e\2\2\u0248\u0249"+
		"\7v\2\2\u0249\u024a\7g\2\2\u024a\u024b\7f\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024d\b##\2\u024dF\3\2\2\2\u024e\u024f\7r\2\2\u024f\u0250\7w\2\2\u0250"+
		"\u0251\7d\2\2\u0251\u0252\7n\2\2\u0252\u0253\7k\2\2\u0253\u0254\7e\2\2"+
		"\u0254\u0255\3\2\2\2\u0255\u0256\b$$\2\u0256H\3\2\2\2\u0257\u0258\7t\2"+
		"\2\u0258\u0259\7g\2\2\u0259\u025a\7v\2\2\u025a\u025b\7w\2\2\u025b\u025c"+
		"\7t\2\2\u025c\u025d\7p\2\2\u025d\u025e\3\2\2\2\u025e\u025f\b%%\2\u025f"+
		"J\3\2\2\2\u0260\u0261\7u\2\2\u0261\u0262\7j\2\2\u0262\u0263\7q\2\2\u0263"+
		"\u0264\7t\2\2\u0264\u0265\7v\2\2\u0265\u0266\3\2\2\2\u0266\u0267\b&&\2"+
		"\u0267L\3\2\2\2\u0268\u0269\7u\2\2\u0269\u026a\7v\2\2\u026a\u026b\7c\2"+
		"\2\u026b\u026c\7v\2\2\u026c\u026d\7k\2\2\u026d\u026e\7e\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0270\b\'\'\2\u0270N\3\2\2\2\u0271\u0272\7u\2\2\u0272\u0273"+
		"\7v\2\2\u0273\u0274\7t\2\2\u0274\u0275\7k\2\2\u0275\u0276\7e\2\2\u0276"+
		"\u0277\7v\2\2\u0277\u0278\7h\2\2\u0278\u0279\7r\2\2\u0279\u027a\3\2\2"+
		"\2\u027a\u027b\b((\2\u027bP\3\2\2\2\u027c\u027d\7u\2\2\u027d\u027e\7w"+
		"\2\2\u027e\u027f\7r\2\2\u027f\u0280\7g\2\2\u0280\u0281\7t\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0283\b))\2\u0283R\3\2\2\2\u0284\u0285\7u\2\2\u0285\u0286"+
		"\7y\2\2\u0286\u0287\7k\2\2\u0287\u0288\7v\2\2\u0288\u0289\7e\2\2\u0289"+
		"\u028a\7j\2\2\u028a\u028b\3\2\2\2\u028b\u028c\b**\2\u028cT\3\2\2\2\u028d"+
		"\u028e\7u\2\2\u028e\u028f\7{\2\2\u028f\u0290\7p\2\2\u0290\u0291\7e\2\2"+
		"\u0291\u0292\7j\2\2\u0292\u0293\7t\2\2\u0293\u0294\7q\2\2\u0294\u0295"+
		"\7p\2\2\u0295\u0296\7k\2\2\u0296\u0297\7|\2\2\u0297\u0298\7g\2\2\u0298"+
		"\u0299\7f\2\2\u0299\u029a\3\2\2\2\u029a\u029b\b++\2\u029bV\3\2\2\2\u029c"+
		"\u029d\7v\2\2\u029d\u029e\7j\2\2\u029e\u029f\7k\2\2\u029f\u02a0\7u\2\2"+
		"\u02a0\u02a1\3\2\2\2\u02a1\u02a2\b,,\2\u02a2X\3\2\2\2\u02a3\u02a4\7v\2"+
		"\2\u02a4\u02a5\7j\2\2\u02a5\u02a6\7t\2\2\u02a6\u02a7\7q\2\2\u02a7\u02a8"+
		"\7y\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\b--\2\u02aaZ\3\2\2\2\u02ab\u02ac"+
		"\7v\2\2\u02ac\u02ad\7j\2\2\u02ad\u02ae\7t\2\2\u02ae\u02af\7q\2\2\u02af"+
		"\u02b0\7y\2\2\u02b0\u02b1\7u\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\b..\2"+
		"\u02b3\\\3\2\2\2\u02b4\u02b5\7v\2\2\u02b5\u02b6\7t\2\2\u02b6\u02b7\7c"+
		"\2\2\u02b7\u02b8\7p\2\2\u02b8\u02b9\7u\2\2\u02b9\u02ba\7k\2\2\u02ba\u02bb"+
		"\7g\2\2\u02bb\u02bc\7p\2\2\u02bc\u02bd\7v\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02bf\b//\2\u02bf^\3\2\2\2\u02c0\u02c1\7v\2\2\u02c1\u02c2\7t\2\2\u02c2"+
		"\u02c3\7{\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\b\60\60\2\u02c5`\3\2\2\2"+
		"\u02c6\u02c7\7x\2\2\u02c7\u02c8\7q\2\2\u02c8\u02c9\7k\2\2\u02c9\u02ca"+
		"\7f\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\b\61\61\2\u02ccb\3\2\2\2\u02cd"+
		"\u02ce\7x\2\2\u02ce\u02cf\7q\2\2\u02cf\u02d0\7n\2\2\u02d0\u02d1\7c\2\2"+
		"\u02d1\u02d2\7v\2\2\u02d2\u02d3\7k\2\2\u02d3\u02d4\7n\2\2\u02d4\u02d5"+
		"\7g\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\b\62\62\2\u02d7d\3\2\2\2\u02d8"+
		"\u02d9\7y\2\2\u02d9\u02da\7j\2\2\u02da\u02db\7k\2\2\u02db\u02dc\7n\2\2"+
		"\u02dc\u02dd\7g\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\b\63\63\2\u02dff\3"+
		"\2\2\2\u02e0\u02e5\5i\65\2\u02e1\u02e5\5k\66\2\u02e2\u02e5\5m\67\2\u02e3"+
		"\u02e5\5o8\2\u02e4\u02e0\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2"+
		"\2\u02e4\u02e3\3\2\2\2\u02e5h\3\2\2\2\u02e6\u02e8\5s:\2\u02e7\u02e9\5"+
		"q9\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9j\3\2\2\2\u02ea\u02ec"+
		"\5\177@\2\u02eb\u02ed\5q9\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"l\3\2\2\2\u02ee\u02f0\5\u0087D\2\u02ef\u02f1\5q9\2\u02f0\u02ef\3\2\2\2"+
		"\u02f0\u02f1\3\2\2\2\u02f1n\3\2\2\2\u02f2\u02f4\5\u008fH\2\u02f3\u02f5"+
		"\5q9\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5p\3\2\2\2\u02f6\u02f7"+
		"\t\2\2\2\u02f7r\3\2\2\2\u02f8\u0303\7\62\2\2\u02f9\u0300\5y=\2\u02fa\u02fc"+
		"\5u;\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0301\3\2\2\2\u02fd"+
		"\u02fe\5}?\2\u02fe\u02ff\5u;\2\u02ff\u0301\3\2\2\2\u0300\u02fb\3\2\2\2"+
		"\u0300\u02fd\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u02f8\3\2\2\2\u0302\u02f9"+
		"\3\2\2\2\u0303t\3\2\2\2\u0304\u030c\5w<\2\u0305\u0307\5{>\2\u0306\u0305"+
		"\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030d\5w<\2\u030c\u0308\3\2\2"+
		"\2\u030c\u030d\3\2\2\2\u030dv\3\2\2\2\u030e\u0311\7\62\2\2\u030f\u0311"+
		"\5y=\2\u0310\u030e\3\2\2\2\u0310\u030f\3\2\2\2\u0311x\3\2\2\2\u0312\u0313"+
		"\t\3\2\2\u0313z\3\2\2\2\u0314\u0317\5w<\2\u0315\u0317\7a\2\2\u0316\u0314"+
		"\3\2\2\2\u0316\u0315\3\2\2\2\u0317|\3\2\2\2\u0318\u031a\7a\2\2\u0319\u0318"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"~\3\2\2\2\u031d\u031e\7\62\2\2\u031e\u031f\t\4\2\2\u031f\u0320\5\u0081"+
		"A\2\u0320\u0080\3\2\2\2\u0321\u0329\5\u0083B\2\u0322\u0324\5\u0085C\2"+
		"\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032a\5\u0083B"+
		"\2\u0329\u0325\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0082\3\2\2\2\u032b\u032c"+
		"\t\5\2\2\u032c\u0084\3\2\2\2\u032d\u0330\5\u0083B\2\u032e\u0330\7a\2\2"+
		"\u032f\u032d\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u0086\3\2\2\2\u0331\u0333"+
		"\7\62\2\2\u0332\u0334\5}?\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0336\5\u0089E\2\u0336\u0088\3\2\2\2\u0337\u033f"+
		"\5\u008bF\2\u0338\u033a\5\u008dG\2\u0339\u0338\3\2\2\2\u033a\u033d\3\2"+
		"\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033e\u0340\5\u008bF\2\u033f\u033b\3\2\2\2\u033f\u0340"+
		"\3\2\2\2\u0340\u008a\3\2\2\2\u0341\u0342\t\6\2\2\u0342\u008c\3\2\2\2\u0343"+
		"\u0346\5\u008bF\2\u0344\u0346\7a\2\2\u0345\u0343\3\2\2\2\u0345\u0344\3"+
		"\2\2\2\u0346\u008e\3\2\2\2\u0347\u0348\7\62\2\2\u0348\u0349\t\7\2\2\u0349"+
		"\u034a\5\u0091I\2\u034a\u0090\3\2\2\2\u034b\u0353\5\u0093J\2\u034c\u034e"+
		"\5\u0095K\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2"+
		"\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0354"+
		"\5\u0093J\2\u0353\u034f\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0092\3\2\2"+
		"\2\u0355\u0356\t\b\2\2\u0356\u0094\3\2\2\2\u0357\u035a\5\u0093J\2\u0358"+
		"\u035a\7a\2\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u0096\3\2"+
		"\2\2\u035b\u035e\5\u0099M\2\u035c\u035e\5\u00a5S\2\u035d\u035b\3\2\2\2"+
		"\u035d\u035c\3\2\2\2\u035e\u0098\3\2\2\2\u035f\u0360\5u;\2\u0360\u0362"+
		"\7\60\2\2\u0361\u0363\5u;\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0366\5\u009bN\2\u0365\u0364\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0369\5\u00a3R\2\u0368\u0367\3\2\2"+
		"\2\u0368\u0369\3\2\2\2\u0369\u037b\3\2\2\2\u036a\u036b\7\60\2\2\u036b"+
		"\u036d\5u;\2\u036c\u036e\5\u009bN\2\u036d\u036c\3\2\2\2\u036d\u036e\3"+
		"\2\2\2\u036e\u0370\3\2\2\2\u036f\u0371\5\u00a3R\2\u0370\u036f\3\2\2\2"+
		"\u0370\u0371\3\2\2\2\u0371\u037b\3\2\2\2\u0372\u0373\5u;\2\u0373\u0375"+
		"\5\u009bN\2\u0374\u0376\5\u00a3R\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376\u037b\3\2\2\2\u0377\u0378\5u;\2\u0378\u0379\5\u00a3R\2\u0379"+
		"\u037b\3\2\2\2\u037a\u035f\3\2\2\2\u037a\u036a\3\2\2\2\u037a\u0372\3\2"+
		"\2\2\u037a\u0377\3\2\2\2\u037b\u009a\3\2\2\2\u037c\u037d\5\u009dO\2\u037d"+
		"\u037e\5\u009fP\2\u037e\u009c\3\2\2\2\u037f\u0380\t\t\2\2\u0380\u009e"+
		"\3\2\2\2\u0381\u0383\5\u00a1Q\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2"+
		"\2\u0383\u0384\3\2\2\2\u0384\u0385\5u;\2\u0385\u00a0\3\2\2\2\u0386\u0387"+
		"\t\n\2\2\u0387\u00a2\3\2\2\2\u0388\u0389\t\13\2\2\u0389\u00a4\3\2\2\2"+
		"\u038a\u038b\5\u00a7T\2\u038b\u038d\5\u00a9U\2\u038c\u038e\5\u00a3R\2"+
		"\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u00a6\3\2\2\2\u038f\u0391"+
		"\5\177@\2\u0390\u0392\7\60\2\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2"+
		"\u0392\u039b\3\2\2\2\u0393\u0394\7\62\2\2\u0394\u0396\t\4\2\2\u0395\u0397"+
		"\5\u0081A\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2"+
		"\2\u0398\u0399\7\60\2\2\u0399\u039b\5\u0081A\2\u039a\u038f\3\2\2\2\u039a"+
		"\u0393\3\2\2\2\u039b\u00a8\3\2\2\2\u039c\u039d\5\u00abV\2\u039d\u039e"+
		"\5\u009fP\2\u039e\u00aa\3\2\2\2\u039f\u03a0\t\f\2\2\u03a0\u00ac\3\2\2"+
		"\2\u03a1\u03a2\7v\2\2\u03a2\u03a3\7t\2\2\u03a3\u03a4\7w\2\2\u03a4\u03ab"+
		"\7g\2\2\u03a5\u03a6\7h\2\2\u03a6\u03a7\7c\2\2\u03a7\u03a8\7n\2\2\u03a8"+
		"\u03a9\7u\2\2\u03a9\u03ab\7g\2\2\u03aa\u03a1\3\2\2\2\u03aa\u03a5\3\2\2"+
		"\2\u03ab\u00ae\3\2\2\2\u03ac\u03ad\7)\2\2\u03ad\u03ae\5\u00b1Y\2\u03ae"+
		"\u03af\7)\2\2\u03af\u03b5\3\2\2\2\u03b0\u03b1\7)\2\2\u03b1\u03b2\5\u00b9"+
		"]\2\u03b2\u03b3\7)\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03ac\3\2\2\2\u03b4\u03b0"+
		"\3\2\2\2\u03b5\u00b0\3\2\2\2\u03b6\u03b7\n\r\2\2\u03b7\u00b2\3\2\2\2\u03b8"+
		"\u03ba\7$\2\2\u03b9\u03bb\5\u00b5[\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3"+
		"\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\7$\2\2\u03bd\u00b4\3\2\2\2\u03be"+
		"\u03c0\5\u00b7\\\2\u03bf\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03bf"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u00b6\3\2\2\2\u03c3\u03c6\n\16\2\2"+
		"\u03c4\u03c6\5\u00b9]\2\u03c5\u03c3\3\2\2\2\u03c5\u03c4\3\2\2\2\u03c6"+
		"\u00b8\3\2\2\2\u03c7\u03c8\7^\2\2\u03c8\u03cc\t\17\2\2\u03c9\u03cc\5\u00bb"+
		"^\2\u03ca\u03cc\5\u00bd_\2\u03cb\u03c7\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb"+
		"\u03ca\3\2\2\2\u03cc\u00ba\3\2\2\2\u03cd\u03ce\7^\2\2\u03ce\u03d9\5\u008b"+
		"F\2\u03cf\u03d0\7^\2\2\u03d0\u03d1\5\u008bF\2\u03d1\u03d2\5\u008bF\2\u03d2"+
		"\u03d9\3\2\2\2\u03d3\u03d4\7^\2\2\u03d4\u03d5\5\u00bf`\2\u03d5\u03d6\5"+
		"\u008bF\2\u03d6\u03d7\5\u008bF\2\u03d7\u03d9\3\2\2\2\u03d8\u03cd\3\2\2"+
		"\2\u03d8\u03cf\3\2\2\2\u03d8\u03d3\3\2\2\2\u03d9\u00bc\3\2\2\2\u03da\u03db"+
		"\7^\2\2\u03db\u03dc\7w\2\2\u03dc\u03dd\5\u0083B\2\u03dd\u03de\5\u0083"+
		"B\2\u03de\u03df\5\u0083B\2\u03df\u03e0\5\u0083B\2\u03e0\u00be\3\2\2\2"+
		"\u03e1\u03e2\t\20\2\2\u03e2\u00c0\3\2\2\2\u03e3\u03e4\7p\2\2\u03e4\u03e5"+
		"\7w\2\2\u03e5\u03e6\7n\2\2\u03e6\u03e7\7n\2\2\u03e7\u00c2\3\2\2\2\u03e8"+
		"\u03e9\7*\2\2\u03e9\u03ea\bb\64\2\u03ea\u00c4\3\2\2\2\u03eb\u03ec\7+\2"+
		"\2\u03ec\u03ed\bc\65\2\u03ed\u00c6\3\2\2\2\u03ee\u03ef\7}\2\2\u03ef\u03f0"+
		"\bd\66\2\u03f0\u00c8\3\2\2\2\u03f1\u03f2\7\177\2\2\u03f2\u03f3\be\67\2"+
		"\u03f3\u00ca\3\2\2\2\u03f4\u03f5\7]\2\2\u03f5\u03f6\bf8\2\u03f6\u00cc"+
		"\3\2\2\2\u03f7\u03f8\7_\2\2\u03f8\u03f9\bg9\2\u03f9\u00ce\3\2\2\2\u03fa"+
		"\u03fb\7=\2\2\u03fb\u03fc\bh:\2\u03fc\u00d0\3\2\2\2\u03fd\u03fe\7.\2\2"+
		"\u03fe\u03ff\bi;\2\u03ff\u00d2\3\2\2\2\u0400\u0401\7\60\2\2\u0401\u0402"+
		"\bj<\2\u0402\u00d4\3\2\2\2\u0403\u0404\7?\2\2\u0404\u0405\bk=\2\u0405"+
		"\u00d6\3\2\2\2\u0406\u0407\7@\2\2\u0407\u0408\bl>\2\u0408\u00d8\3\2\2"+
		"\2\u0409\u040a\7>\2\2\u040a\u040b\bm?\2\u040b\u00da\3\2\2\2\u040c\u040d"+
		"\7#\2\2\u040d\u040e\bn@\2\u040e\u00dc\3\2\2\2\u040f\u0410\7\u0080\2\2"+
		"\u0410\u0411\boA\2\u0411\u00de\3\2\2\2\u0412\u0413\7A\2\2\u0413\u00e0"+
		"\3\2\2\2\u0414\u0415\7<\2\2\u0415\u00e2\3\2\2\2\u0416\u0417\7?\2\2\u0417"+
		"\u0418\7?\2\2\u0418\u00e4\3\2\2\2\u0419\u041a\7>\2\2\u041a\u041b\7?\2"+
		"\2\u041b\u00e6\3\2\2\2\u041c\u041d\7@\2\2\u041d\u041e\7?\2\2\u041e\u00e8"+
		"\3\2\2\2\u041f\u0420\7#\2\2\u0420\u0421\7?\2\2\u0421\u00ea\3\2\2\2\u0422"+
		"\u0423\7(\2\2\u0423\u0424\7(\2\2\u0424\u00ec\3\2\2\2\u0425\u0426\7~\2"+
		"\2\u0426\u0427\7~\2\2\u0427\u00ee\3\2\2\2\u0428\u0429\7-\2\2\u0429\u042a"+
		"\7-\2\2\u042a\u00f0\3\2\2\2\u042b\u042c\7/\2\2\u042c\u042d\7/\2\2\u042d"+
		"\u00f2\3\2\2\2\u042e\u042f\7-\2\2\u042f\u00f4\3\2\2\2\u0430\u0431\7/\2"+
		"\2\u0431\u00f6\3\2\2\2\u0432\u0433\7,\2\2\u0433\u0434\b|B\2\u0434\u00f8"+
		"\3\2\2\2\u0435\u0436\7\61\2\2\u0436\u00fa\3\2\2\2\u0437\u0438\7(\2\2\u0438"+
		"\u00fc\3\2\2\2\u0439\u043a\7~\2\2\u043a\u00fe\3\2\2\2\u043b\u043c\7`\2"+
		"\2\u043c\u0100\3\2\2\2\u043d\u043e\7\'\2\2\u043e\u0102\3\2\2\2\u043f\u0440"+
		"\7-\2\2\u0440\u0441\7?\2\2\u0441\u0104\3\2\2\2\u0442\u0443\7/\2\2\u0443"+
		"\u0444\7?\2\2\u0444\u0106\3\2\2\2\u0445\u0446\7,\2\2\u0446\u0447\7?\2"+
		"\2\u0447\u0108\3\2\2\2\u0448\u0449\7\61\2\2\u0449\u044a\7?\2\2\u044a\u010a"+
		"\3\2\2\2\u044b\u044c\7(\2\2\u044c\u044d\7?\2\2\u044d\u010c\3\2\2\2\u044e"+
		"\u044f\7~\2\2\u044f\u0450\7?\2\2\u0450\u010e\3\2\2\2\u0451\u0452\7`\2"+
		"\2\u0452\u0453\7?\2\2\u0453\u0110\3\2\2\2\u0454\u0455\7\'\2\2\u0455\u0456"+
		"\7?\2\2\u0456\u0112\3\2\2\2\u0457\u0458\7>\2\2\u0458\u0459\7>\2\2\u0459"+
		"\u045a\7?\2\2\u045a\u0114\3\2\2\2\u045b\u045c\7@\2\2\u045c\u045d\7@\2"+
		"\2\u045d\u045e\7?\2\2\u045e\u0116\3\2\2\2\u045f\u0460\7@\2\2\u0460\u0461"+
		"\7@\2\2\u0461\u0462\7@\2\2\u0462\u0463\7?\2\2\u0463\u0118\3\2\2\2\u0464"+
		"\u0468\5\u011b\u008e\2\u0465\u0467\5\u011d\u008f\2\u0466\u0465\3\2\2\2"+
		"\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u011a"+
		"\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u0472\t\21\2\2\u046c\u046d\n\22\2\2"+
		"\u046d\u0472\6\u008e\2\2\u046e\u046f\t\23\2\2\u046f\u0470\t\24\2\2\u0470"+
		"\u0472\6\u008e\3\2\u0471\u046b\3\2\2\2\u0471\u046c\3\2\2\2\u0471\u046e"+
		"\3\2\2\2\u0472\u011c\3\2\2\2\u0473\u047a\t\25\2\2\u0474\u0475\n\22\2\2"+
		"\u0475\u047a\6\u008f\4\2\u0476\u0477\t\23\2\2\u0477\u0478\t\24\2\2\u0478"+
		"\u047a\6\u008f\5\2\u0479\u0473\3\2\2\2\u0479\u0474\3\2\2\2\u0479\u0476"+
		"\3\2\2\2\u047a\u011e\3\2\2\2\u047b\u047c\7B\2\2\u047c\u0120\3\2\2\2\u047d"+
		"\u047e\7\60\2\2\u047e\u047f\7\60\2\2\u047f\u0480\7\60\2\2\u0480\u0122"+
		"\3\2\2\2\u0481\u0482\7\"\2\2\u0482\u048c\b\u0092C\2\u0483\u0484\7\17\2"+
		"\2\u0484\u048c\b\u0092D\2\u0485\u0486\7\13\2\2\u0486\u048c\b\u0092E\2"+
		"\u0487\u0488\7\16\2\2\u0488\u048c\b\u0092F\2\u0489\u048a\7\f\2\2\u048a"+
		"\u048c\b\u0092G\2\u048b\u0481\3\2\2\2\u048b\u0483\3\2\2\2\u048b\u0485"+
		"\3\2\2\2\u048b\u0487\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\b\u0092"+
		"H\2\u0490\u0124\3\2\2\2\u0491\u0492\7\61\2\2\u0492\u0493\7,\2\2\u0493"+
		"\u0497\3\2\2\2\u0494\u0496\13\2\2\2\u0495\u0494\3\2\2\2\u0496\u0499\3"+
		"\2\2\2\u0497\u0498\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u049a\3\2\2\2\u0499"+
		"\u0497\3\2\2\2\u049a\u049b\7,\2\2\u049b\u049c\7\61\2\2\u049c\u049d\3\2"+
		"\2\2\u049d\u049e\b\u0093I\2\u049e\u0126\3\2\2\2\u049f\u04a0\7\61\2\2\u04a0"+
		"\u04a1\7\61\2\2\u04a1\u04a5\3\2\2\2\u04a2\u04a4\n\26\2\2\u04a3\u04a2\3"+
		"\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04a8\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04a9\b\u0094J\2\u04a9\u0128"+
		"\3\2\2\2\65\2\u02e4\u02e8\u02ec\u02f0\u02f4\u02fb\u0300\u0302\u0308\u030c"+
		"\u0310\u0316\u031b\u0325\u0329\u032f\u0333\u033b\u033f\u0345\u034f\u0353"+
		"\u0359\u035d\u0362\u0365\u0368\u036d\u0370\u0375\u037a\u0382\u038d\u0391"+
		"\u0396\u039a\u03aa\u03b4\u03ba\u03c1\u03c5\u03cb\u03d8\u0468\u0471\u0479"+
		"\u048b\u048d\u0497\u04a5K\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\3"+
		"\t\t\3\n\n\3\13\13\3\f\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21\21\3\22\22"+
		"\3\23\23\3\24\24\3\25\25\3\26\26\3\27\27\3\30\30\3\31\31\3\32\32\3\33"+
		"\33\3\34\34\3\35\35\3\36\36\3\37\37\3  \3!!\3\"\"\3##\3$$\3%%\3&&\3\'"+
		"\'\3((\3))\3**\3++\3,,\3--\3..\3//\3\60\60\3\61\61\3\62\62\3\63\63\3b"+
		"\64\3c\65\3d\66\3e\67\3f8\3g9\3h:\3i;\3j<\3k=\3l>\3m?\3n@\3oA\3|B\3\u0092"+
		"C\3\u0092D\3\u0092E\3\u0092F\3\u0092G\b\2\2\3\u0093H\3\u0094I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}