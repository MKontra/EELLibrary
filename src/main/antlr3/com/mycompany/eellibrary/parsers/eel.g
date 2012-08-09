grammar eel;
options { output=AST; }
@header {
package com.mycompany.eellibrary.parsers;
}

@lexer::header {
package com.mycompany.eellibrary.parsers;
import java.io.*;
}
public root 	:	expression^
	;
	
expression
	:	(LEFTPAR! expression RIGHTPAR!) (ID^ expression)?
	|	((QID|ID) ID^ (STRING|INT|QID|FLOAT)) (ID^ expression)?
	;

	/**
	:	ID ID ( ID | STRING | INT | FLOAT )
	;**/
ID  :	('a'..'z'|'A'..'Z'|'_' ) ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
QID 	:	ID('.'ID)*
	;




INT :	'0'..'9'+
    ;

LEFTPAR :	'('
	;
	
RIGHTPAR:	')'
	;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

STRING
    :  '"' ( ~('"') )* '"'
    ;


fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
