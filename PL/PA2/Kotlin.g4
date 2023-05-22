grammar Kotlin;

// parser rules

prog : package? imports* declaration* EOF ;

package : PACKAGE PACKAGENAME NEWLINE ;
imports : IMPORT IMPORTNAME* NEWLINE ;
declaration : function
            | variable
            | class
            | comment
            ;

function : FUN ID funcParameters (COLON type QM?)? funcBody ;
funcParameters : LPAREN (funcParameter (COMMA funcParameter)*)? RPAREN ;
funcParameter : ID COLON type ;
funcBody : LCURL statements RCURL
         | EQ statements
         ;

variable : varType? ID (COLON type)? assn?
         | varType? if
         ;
varType : VAL
        | VAR
        ;
assn	: assnOperator expr ;
assnOperator : '='
             | '+='
             | '-='
             | '*='
             | '/='
             | '%='
             ;
num : INT
    | REAL
    | STRING
    ;
string : '"' (strContent | dollarStr)* '"' ;
strContent : STRING
           | num
           | DOLLAR STRING
           ;
strlength : STRING '.length' ; 

dollarStr : DOLLAR LCURL strContent RCURL ;

class : CLASS ID classParameters (COLON parentClass)? classBody ;
classParameters : LPAREN (classParameter (COMMA classParameter)*)? RPAREN ;
classParameter : (VAL | VAR) ID COLON type ;
parentClass : ID '()' ;
classBody : LCURL statements RCURL ;

comment : LCOMMENT
        | DCOMMENT
        ;

statements : NEWLINE* (statement (NEWLINE statement)*)? NEWLINE* ;
statement : function
          | variable
          | expr
          | if
          | loop
          | return
          ;

expr : expr ('*'|'/') (COLON)* expr
     | expr ('+'|'-') (COLON)* expr
     | expr ('>'|'<'|'='|'!') (COLON)* expr
     | expr ('&&'|'||') expr
     | expr ('++'|'--')
     | expr IN expr
     | expr '..' expr
     | expr IS type
     | num
     | ID
     | list
     | range
     | strlength
     | LPAREN expr RPAREN
     ;

if : IF LPAREN expr RPAREN ifBody (else)? ;
else : ELSE if
     | ELSE ifBody
     ;
ifBody : LCURL statements RCURL;

loop : forloop
     | whileloop
     ;
forloop : FOR LPAREN expr RPAREN statements ;
list : 'listOf' '[' string (COMMA string)* ']' ;
range : num '..' num
      | num ('up'|'down')? num ('step')? num
      ;
whileloop : WHILE LPAREN expr RPAREN statements ;

return : RETURN ID
       | RETURN expr
       | RETURN num
       | RETURN NULL
       ;


type : 'Double'
     | 'Float'
     | 'Long'
     | 'Int'
     | 'Short'
     | 'Byte'
     | 'Any'
     | 'String'
     | 'list'
     ;


// lexer rules

LCOMMENT : '//' ~[\r\n]* ;
DCOMMENT : '/*' (DCOMMENT | . )*? '*/' ;

COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURL : '{' ;
RCURL : '}' ;
COLON : ':' ;
EQ : '=' ;
EQEQ : '==' ;
EQEQEQ : '===' ;
DOLLAR : '$' ;
QM : '?' ;

PACKAGE : 'package' ;
IMPORT : 'import' ;
CLASS : 'class' ;
FUN : 'fun' ;
OBJ : 'object' ;
VAL : 'val' ;
VAR : 'var' ;
NULL : 'null' ;

IF : 'if' ;
ELSE : 'else' ;
FOR : 'for' ;
WHILE : 'while' ;
RETURN : 'return' ;
IN : 'in' ;
NOT_IN : '!in' ;
IS : 'is' ;

NEWLINE	: [\r\n]+ ;
INT: [+-]?[0-9]+ ;
REAL: [+-]?'+'?[0-9]+'.'[0-9]* ;
STRING: [a-zA-Z]+ ;
PACKAGENAME: [a-zA-Z.]+;
IMPORTNAME: [a-zA-Z.*]+;
ID: [a-zA-Z]+[0-9]*;
WS: [ \t\r\n]+ -> skip ;