grammar Euler;

// Parser

program     : stmt*
            ;

stmt        :	expr SEMI
            |   dcl SEMI
            |	ifstmt
            |	whilestmt
            |	assignstmt SEMI
            |   printstmt SEMI
            ;

dcl         :	NUMKW ID ASSIGN expr
            |	VECKW ID ASSIGN (VECTOR | expr)
            |   MTXKW ID ASSIGN (MATRIX | expr)
            ;

expr        :	addexpr
            ;

ifstmt      :	IF logstmt THEN (stmt)* elsestmts? END
            ;

elsestmts   :	elseifstmts* ELSE THEN (stmt)*
            |   elseifstmts+
            ;

elseifstmts :   ELSE IF logstmt THEN (stmt)*
            ;

printstmt   :   PRINT stringstmt (PLUS stringstmt)*
            ;

stringstmt  :   STRING
            |   NUM
            |   ID valindex?
            ;

valindex    :   LSQBRACK NUM RSQBRACK
            |   LSQBRACK NUM (COMMA NUM)* RSQBRACK
            ;

whilestmt   :	WHILE logstmt DO (stmt)* END
            ;

assignstmt  :	ID valindex? ASSIGN expr
            |   ID ASSIGN VECTOR
            |   ID ASSIGN MATRIX
            ;

addexpr     :	multiexpr
            |	multiexpr op=('+' | '-') addexpr
            ;

multiexpr   :	primeexpr
            |	primeexpr op=('*' | '/' | '%') multiexpr
            ;

primeexpr   :	ID valindex?
            |	NUM
            |	LPAREN addexpr RPAREN
            ;

logstmt     :   addexpr logop addexpr
            ;

logop       :	op=(EQEQ | BT | LT | BTEQ | LTEQ | NOTEQ)
            ;

// TOKENS

SEMI    : ';' ;
ASSIGN  : '=' ;
LT       :'<';
BT       :'>';
EQEQ     :'==';
NOTEQ    :'!=';
LTEQ     :'<=';
BTEQ     :'>=';

IF      : 'if';
THEN    : 'then';
ELSE    : 'else';
END     : 'end';
WHILE   : 'while';
DO      : 'do';
NUMKW   : 'num';
VECKW   : 'vec';
MTXKW   : 'mtx';
PRINT   : 'print';

PLUS    :'+';
MINUS   :'-';
MULT    :'*';
DIVID   :'/';
MOD     :'%';

LPAREN  :'(';
RPAREN  :')';
LSQBRACK:'[';
RSQBRACK:']';
COMMA   :',';

NUM     : [0-9]+('.'[0-9]+)? ;
MATRIX  : '{' WHITESPACE* (NUM|ID) WHITESPACE* (',' WHITESPACE* (NUM|ID))* WHITESPACE* (';' WHITESPACE* (NUM|ID) WHITESPACE* (',' WHITESPACE* (NUM|ID))* WHITESPACE* )* WHITESPACE*'}';
VECTOR  : '<' WHITESPACE* (NUM|ID) WHITESPACE* (',' WHITESPACE* (NUM|ID) WHITESPACE* )* WHITESPACE* '>';
STRING  : '"'([a-zA-Z0-9_:\-<>%#$&+/=?!.(),\\[\]* ]|'\\"')*'"';
ID      : [a-zA-Z_-] [a-zA-Z0-9_-]*;

WHITESPACE : [\r\n\t ]+ -> skip;
COMMENT1 : '/*' .*? '*/' -> skip;
COMMENT2 : '//' ~[\r\n]* -> skip;