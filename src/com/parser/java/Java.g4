
grammar Java;

@lexer::members {
	
		int whiteSpaceCount = 0;
	int lineCommentCount = 0;
	String strComment;
	String strLineComment;
	int specialCharCount = 0;
	ArrayList<String> arrSpecialCharacter =  new  ArrayList<String>();
	ArrayList<String> arrKeywords =  new  ArrayList<String>();
}

@parser::members
{
		int constCount = 0;
	int classCount = 0;
	int keyWordCount = 0;
	int uidCount = 0;
	int uniqueUIDCount = 0;
	String strPackageName;
	String strClassName;
	
	boolean isClassSaved = false; 
	ArrayList<String> arrClass =  new  ArrayList<String>();
	ArrayList<String> arrKeyword =  new  ArrayList<String>();
	ArrayList<String> arrSpecialCharacter =  new  ArrayList<String>();
	ArrayList<String> arrUID =  new  ArrayList<String>();
	ArrayList<String> arrConst =  new  ArrayList<String>();
	int commentCount = 0;
 int countNew=0;

  
}
// starting point for parsing a java file
compilationUnit
    :   packageDeclaration? importDeclaration* typeDeclaration*  EOF
    ;

packageDeclaration
    :   annotation* 'package' qualifiedName {strPackageName = $qualifiedName.text;} ';'
    ;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

typeDeclaration
    :   classOrInterfaceModifier* classDeclaration 
    |   classOrInterfaceModifier* enumDeclaration
    |   classOrInterfaceModifier* interfaceDeclaration
    |   classOrInterfaceModifier* annotationTypeDeclaration 
    |   ';'
    ;

modifier
    :   classOrInterfaceModifier
    |   (   'native'
        |   'synchronized'
        |   'transient'
        |   'volatile'
        )
    ;

classOrInterfaceModifier
    :   annotation     // class or interface
    |   (   'public'     //{System.out.println("classOrInterfaceModifier");}
        |   'protected'  ////{System.out.println("classOrInterfaceModifier");}
        |   'private'    ////{System.out.println("classOrInterfaceModifier");}// class or interface
        |   'static'     ////{System.out.println("classOrInterfaceModifier");}// class or interface 
        |   'abstract'   ////{System.out.println("classOrInterfaceModifier");}// class or interface
        |   'final'      ////{System.out.println("classOrInterfaceModifier");}// class only -- does not apply to interfaces
        |   'strictfp'   ////{System.out.println("classOrInterfaceModifier");}// class or interface
        )
    ;

variableModifier
    :   'final' ////{System.out.println("variableModifier");}
    |   annotation
    ;

classDeclaration
    :   'class' Identifier typeParameters?  {classCount++;} {System.out.println($Identifier.text + "," + $Identifier.line);}
    
    { 
    	
    	arrClass.add($Identifier.text);
    	if (!isClassSaved) {
    	strClassName = $Identifier.text;
    	}isClassSaved = true;
    	
    } 
        ('extends' type)?
        ('implements' typeList)?
        classBody
    ;

typeParameters
    :   '<' typeParameter (',' typeParameter)* '>' ////{System.out.println("typeParameters");}
    ;

typeParameter
    :   Identifier {System.out.println($Identifier.text + "," + $Identifier.line);} ('extends' typeBound)? 
    ;

typeBound
    :   type ('&' type)*
    ;

enumDeclaration
    :   ENUM Identifier ('implements' typeList)? {System.out.println($Identifier.text + "," + $Identifier.line);}
        '{' enumConstants? ','? enumBodyDeclarations? '}' 
    ;

enumConstants
    :   enumConstant (',' enumConstant)* ////{System.out.println("enumConstants");}
    ;

enumConstant
    :   annotation* Identifier arguments? classBody? {System.out.println($Identifier.text + "," + $Identifier.line);}
    ;

enumBodyDeclarations
    :   ';' classBodyDeclaration* ////{System.out.println("enumBodyDeclarations");}
    ;

interfaceDeclaration
    :   'interface' Identifier typeParameters? ('extends' typeList)? interfaceBody {System.out.println($Identifier.text + "," + $Identifier.line);}
    ;

typeList
    :   type (',' type)* ////{System.out.println("typeList");}
    ;

classBody
    :   '{' classBodyDeclaration* '}' ////{System.out.println("classBody");}
    ;

interfaceBody
    :   '{' interfaceBodyDeclaration* '}' ////{System.out.println("interfaceBody");}
    ;

classBodyDeclaration
    :   ';' ////{System.out.println("classBodyDeclaration");}
    |   'static'? block
    |   modifier* memberDeclaration
    ;

memberDeclaration
    :   methodDeclaration ////{System.out.println("memberDeclaration");}
    |   genericMethodDeclaration
    |   fieldDeclaration
    |   constructorDeclaration
    |   genericConstructorDeclaration
    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   (type|'void') Identifier formalParameters ('[' ']')* {System.out.println($Identifier.text + ",MethodDecl," + $Identifier.line);}
        ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;

genericMethodDeclaration
    :   typeParameters methodDeclaration ////{System.out.println("genericMethodDeclaration");}
    ;

constructorDeclaration
    :   Identifier formalParameters ('throws' qualifiedNameList)? {System.out.println($Identifier.text + ",ConstructorDecl" + $Identifier.line);}
        constructorBody
    ;

genericConstructorDeclaration
    :   typeParameters constructorDeclaration ////{System.out.println("genericConstructorDeclaration");}
    ;

fieldDeclaration
    :   type variableDeclarators ';' 
    ;

interfaceBodyDeclaration
    :   modifier* interfaceMemberDeclaration ////{System.out.println("interfaceBodyDeclaration");}
    |   ';'
    ;

interfaceMemberDeclaration
    :   constDeclaration ////{System.out.println("interfaceMemberDeclaration");}
    |   interfaceMethodDeclaration
    |   genericInterfaceMethodDeclaration
    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;

constDeclaration
    :   type constantDeclarator (',' constantDeclarator)* ';' {constCount++;} {System.out.println("constDeclaration"+$constantDeclarator.text);}
    ;

constantDeclarator
    :   Identifier ('[' ']')* '=' variableInitializer {System.out.println($Identifier.text + ",Const" + $Identifier.line);}
    ;

// see matching of [] comment in methodDeclaratorRest
interfaceMethodDeclaration
    :   (type|'void') Identifier formalParameters ('[' ']')* {System.out.println($Identifier.text + ",interfaceMethodDecl" + $Identifier.line);}
        ('throws' qualifiedNameList)?
        ';'
    ;

genericInterfaceMethodDeclaration
    :   typeParameters interfaceMethodDeclaration  ////{System.out.println("genericInterfaceMethodDeclaration");}
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*  
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?  {uniqueUIDCount++;uidCount++;System.out.println(  "Declarator," + $variableDeclaratorId.text+"Line no");}  //Final for UID x,y,z 
    ;

variableDeclaratorId
    :   Identifier ('[' ']')* {System.out.println($Identifier.text + ",Declarator," + $Identifier.line);}  
    ;

variableInitializer
    :   arrayInitializer {System.out.println("variableInitializer");}
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}' ////{System.out.println("arrayInitializer");}
    ;

enumConstantName
    :   Identifier {System.out.println($Identifier.text + ",ConstName" + $Identifier.line);}
    ; 

type
    :   classOrInterfaceType ('[' ']')* ////{System.out.println("type");}
    |   primitiveType ('[' ']')*
    ;

classOrInterfaceType
    :   Identifier typeArguments? ('.' Identifier typeArguments? )* {System.out.println($Identifier.text + ",ClassOrInterfaceType" + $Identifier.line);}
    ;

primitiveType
    :   'boolean' ////{System.out.println("primitiveType");}
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>' ////{System.out.println("typeArguments");}
    ;

typeArgument
    :   type ////{System.out.println("typeArgument");}
    |   '?' (('extends' | 'super') type)?
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)* ////{System.out.println("qualifiedNameList");}
    ;

formalParameters
    :   '(' formalParameterList? ')' ////{System.out.println("formalParameters");}
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)? ////{System.out.println("formalParameterList");}
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* type variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifier* type '...' variableDeclaratorId
    ;

methodBody
    :   block
    ;

constructorBody
    :   block
    ;

qualifiedName
    :   Identifier ('.' Identifier)* {System.out.println($Identifier.text + ",QualifiedName" + $Identifier.line);}
    ;

literal
    :   IntegerLiteral  {constCount++;}
    |   FloatingPointLiteral {constCount++;}
    |   CharacterLiteral {constCount++;}
    |   StringLiteral {constCount++;}
    |   BooleanLiteral {constCount++;} 
    |   'null'
    ;

// ANNOTATIONS

annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;

annotationName : qualifiedName ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :   Identifier '=' elementValue
    ;

elementValue
    :   expression
    |   annotation
    |   elementValueArrayInitializer
    ;

elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

annotationTypeDeclaration
    :   '@' 'interface' Identifier annotationTypeBody
    ;

annotationTypeBody
    :   '{' (annotationTypeElementDeclaration)* '}'
    ;

annotationTypeElementDeclaration
    :   modifier* annotationTypeElementRest
    |   ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    :   type annotationMethodOrConstantRest ';'
    |   classDeclaration ';'?
    |   interfaceDeclaration ';'?
    |   enumDeclaration ';'?
    |   annotationTypeDeclaration ';'?
    ;

annotationMethodOrConstantRest
    :   annotationMethodRest
    |   annotationConstantRest
    ;

annotationMethodRest
    :   Identifier '(' ')' defaultValue? {System.out.println($Identifier.text + ",annotationMethodRest" + $Identifier.line);}
    ;

annotationConstantRest
    :   variableDeclarators
    ;

defaultValue
    :   'default' elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    |   typeDeclaration
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   variableModifier* type variableDeclarators
    ;

statement
    :   block
    |   ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'try' block (catchClause+ finallyBlock? | finallyBlock)
    |   'try' resourceSpecification block catchClause* finallyBlock?
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';' {System.out.println($Identifier.text + ",statementBreak," + $Identifier.line);}
    |   'continue' Identifier? ';' {System.out.println($Identifier.text + ",StatementContinue," + $Identifier.line);}
    |   ';'
    |   statementExpression ';'
    |   Identifier ':' statement {System.out.println($Identifier.text + ",Statementsemicoln," + $Identifier.line);}
    ;

catchClause
    :   'catch' '(' variableModifier* catchType Identifier ')' block {System.out.println($Identifier.text + ",catchClause," + $Identifier.line);}
    ;

catchType
    :   qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    :   'finally' block
    ;

resourceSpecification
    :   '(' resources ';'? ')'
    ;

resources
    :   resource (';' resource)*
    ;

resource
    :   variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' constantExpression ':'
    |   'case' enumConstantName ':'
    |   'default' ':'
    ;

forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifier* type variableDeclaratorId ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;

expression
    :   primary
    |   expression '.' Identifier {System.out.println($Identifier.text + ",expression," + $Identifier.line);}
    |   expression '.' 'this'
    |   expression '.' 'new' nonWildcardTypeArguments? innerCreator
    |   expression '.' 'super' superSuffix
    |   expression '.' explicitGenericInvocation
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   'new' creator
    |   '(' type ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression 'instanceof' type
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   <assoc=right> expression
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        expression
    ;

primary
    :   '(' expression ')'
    |   'this'
    |   'super'
    |   literal {}
    |   Identifier {System.out.println($Identifier.text + ",primary," +$Identifier.line);uidCount++;}
    |   type '.' 'class'
    |   'void' '.' 'class' ////{System.out.println("expr found ");}
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   Identifier typeArgumentsOrDiamond? ('.' Identifier typeArgumentsOrDiamond?)* {System.out.println($Identifier.text + ",createName," + $Identifier.line);}
    |   primitiveType
    ;

innerCreator
    :   Identifier  nonWildcardTypeArgumentsOrDiamond? classCreatorRest {System.out.println($Identifier.text + ",innerCreator" + $Identifier.line);}
    ;

arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments classBody?
    ;

explicitGenericInvocation
    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;

nonWildcardTypeArguments
    :   '<' typeList '>'
    ;

typeArgumentsOrDiamond
    :   '<' '>'
    |   typeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    :   '<' '>'
    |   nonWildcardTypeArguments
    ;

superSuffix
    :   arguments
    |   '.' Identifier arguments? {System.out.println($Identifier.text + ",superSuffix" + $Identifier.line);}
    ;

explicitGenericInvocationSuffix
    :   'super' superSuffix
    |   Identifier arguments {System.out.println($Identifier.text + ",ExpricitGenericInvocation" + $Identifier.line);}
    ;

arguments
    :   '(' expressionList? ')'
    ;

// LEXER

// §3.9 Keywords

ABSTRACT      : 'abstract'{arrKeywords.add(getText());}; 
ASSERT        : 'assert'{arrKeywords.add(getText());};
BOOLEAN       : 'boolean'{arrKeywords.add(getText());};
BREAK         : 'break'{arrKeywords.add(getText());};
BYTE          : 'byte'{arrKeywords.add(getText());};
CASE          : 'case'{arrKeywords.add(getText());};
CATCH         : 'catch'{arrKeywords.add(getText());};
CHAR          : 'char'{arrKeywords.add(getText());};
CLASS         : 'class'{arrKeywords.add(getText());}; 
CONST         : 'const'{arrKeywords.add(getText());};
CONTINUE      : 'continue'{arrKeywords.add(getText());};
DEFAULT       : 'default'{arrKeywords.add(getText());};
DO            : 'do'{arrKeywords.add(getText());};
DOUBLE        : 'double'{arrKeywords.add(getText());};
ELSE          : 'else'{arrKeywords.add(getText());};
ENUM          : 'enum'{arrKeywords.add(getText());};
EXTENDS       : 'extends'{arrKeywords.add(getText());};
FINAL         : 'final'{arrKeywords.add(getText());};
FINALLY       : 'finally'{arrKeywords.add(getText());};
FLOAT         : 'float'{arrKeywords.add(getText());};
FOR           : 'for'{arrKeywords.add(getText());};
IF            : 'if'{arrKeywords.add(getText());};
GOTO          : 'goto'{arrKeywords.add(getText());};
IMPLEMENTS    : 'implements'{arrKeywords.add(getText());};
IMPORT        : 'import'{arrKeywords.add(getText());};
INSTANCEOF    : 'instanceof'{arrKeywords.add(getText());};
INT           : 'int'{arrKeywords.add(getText());};
INTERFACE     : 'interface'{arrKeywords.add(getText());};
LONG          : 'long'{arrKeywords.add(getText());};
NATIVE        : 'native'{arrKeywords.add(getText());};
NEW           : 'new'{arrKeywords.add(getText());};
PACKAGE       : 'package'{arrKeywords.add(getText());};
PRIVATE       : 'private'{arrKeywords.add(getText());};
PROTECTED     : 'protected'{arrKeywords.add(getText());};
PUBLIC        : 'public'{arrKeywords.add(getText());};
RETURN        : 'return'{arrKeywords.add(getText());};
SHORT         : 'short'{arrKeywords.add(getText());};
STATIC        : 'static'{arrKeywords.add(getText());};
STRICTFP      : 'strictfp'{arrKeywords.add(getText());};
SUPER         : 'super'{arrKeywords.add(getText());};
SWITCH        : 'switch'{arrKeywords.add(getText());};
SYNCHRONIZED  : 'synchronized'{arrKeywords.add(getText());};
THIS          : 'this'{arrKeywords.add(getText());};
THROW         : 'throw'{arrKeywords.add(getText());};
THROWS        : 'throws'{arrKeywords.add(getText());};
TRANSIENT     : 'transient'{arrKeywords.add(getText());};
TRY           : 'try'{arrKeywords.add(getText());};
VOID          : 'void'{arrKeywords.add(getText());};
VOLATILE      : 'volatile'{arrKeywords.add(getText());};
WHILE         : 'while'{arrKeywords.add(getText());}; 

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// §3.10.5 String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// §3.11 Separators

LPAREN          : '(' {arrSpecialCharacter.add(getText());specialCharCount++;};
RPAREN          : ')' {arrSpecialCharacter.add(getText());specialCharCount++;};
LBRACE          : '{' {arrSpecialCharacter.add(getText());specialCharCount++;};
RBRACE          : '}' {arrSpecialCharacter.add(getText());specialCharCount++;};
LBRACK          : '[' {arrSpecialCharacter.add(getText());specialCharCount++;};
RBRACK          : ']' {arrSpecialCharacter.add(getText());specialCharCount++;};
SEMI            : ';' ;
COMMA           : ',' ;
DOT             : '.' {arrSpecialCharacter.add(getText());specialCharCount++;};

// §3.12 Operators

ASSIGN          : '=' {System.out.println("Assign Point"+ getText());};
GT              : '>';
LT              : '<';
BANG            : '!'{arrSpecialCharacter.add(getText());specialCharCount++;};
TILDE           : '~'{arrSpecialCharacter.add(getText());specialCharCount++;};
QUESTION        : '?'{arrSpecialCharacter.add(getText());specialCharCount++;};
COLON           : ':'{arrSpecialCharacter.add(getText());specialCharCount++;};
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&'{arrSpecialCharacter.add(getText());specialCharCount++;};
OR              : '||'{arrSpecialCharacter.add(getText());specialCharCount++;};
INC             : '++';
DEC             : '--';
ADD             : '+'{arrSpecialCharacter.add(getText());specialCharCount++;};
SUB             : '-'{arrSpecialCharacter.add(getText());specialCharCount++;};
MUL             : '*'{arrSpecialCharacter.add(getText());specialCharCount++;};
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_]// these are the "java letters or digits" below 0xFF 
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  (' '|'\r'{whiteSpaceCount++;}|'\t'{whiteSpaceCount++;}|'\u000C'{whiteSpaceCount++;}|'\n'{whiteSpaceCount++;}) + -> skip
    ;



COMMENT
    :   '/*' .*? '*/' { {strComment=getText(); System.out.println("COMMENT Char count hi is"+ getText()); lineCommentCount += getText().length();} 
        skip();}
    ; 


LINE_COMMENT
    :   '//' ~[\r\n]*{{strLineComment=getText(); lineCommentCount += getText().length();} 
        skip();}
    ;

    
 