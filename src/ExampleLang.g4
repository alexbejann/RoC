grammar ExampleLang;

program: method_declaration* statement* EOF;

method_declaration: 'functia ' IDENTIFIER PAREN_OPEN (argument IDENTIFIER (',' argument IDENTIFIER)*)? PAREN_CLOSE
                        CURLY_OPEN statement_body CURLY_CLOSE #methodReturnVoid
                   | 'functia ' IDENTIFIER PAREN_OPEN (argument IDENTIFIER (',' argument IDENTIFIER)*)? PAREN_CLOSE
                        'returneaza' argument CURLY_OPEN statement_body* CURLY_CLOSE #methodReturn;

statement: 'daca' PAREN_OPEN conditions PAREN_CLOSE CURLY_OPEN statement_body CURLY_CLOSE
            ('altfel daca' PAREN_OPEN conditions PAREN_CLOSE CURLY_OPEN statement_body CURLY_CLOSE )*
                ('daca nu' CURLY_OPEN statement_body CURLY_CLOSE)?
         | 'printeaza' PAREN_OPEN argument PAREN_CLOSE; #printStatement

conditions: expression;

statement_body: (expression | statement | variable_declaration)+;

expression: PAREN_OPEN expression PAREN_CLOSE                       #parenExpression
           | NOT expression                                 #notExpression
           | left=expression op=comparator right=expression #comparatorExpression
           | left=expression op=binary right=expression     #binaryExpression
           | BOOLEAN                                          #boolExpression
           | IDENTIFIER                                     #identifierExpression
           | NUMBER                                       #decimalExpression
           ;

variable_declaration: BOOLEAN_TYPE IDENTIFIER (EQUALS_TO BOOLEAN) SEMICOLON? #declareBoolean
                    | STRING_TYPE IDENTIFIER (EQUALS_TO STRING) SEMICOLON? #declareString
                    | NUMBER_TYPE IDENTIFIER (EQUALS_TO NUMBER) SEMICOLON? #declareNumber
                    ;

comparator: GT | GE | LT | LE | EQ;

binary: AND | OR;

argument: STRING_TYPE | BOOLEAN_TYPE | NUMBER_TYPE;

HELLO: 'hello';
HI:    'hi';
SEMICOLON: ';';

PAREN_OPEN: '(';
PAREN_CLOSE: ')';

CURLY_OPEN: '{';
CURLY_CLOSE: '}';

//Assign
EQUALS_TO: '<-';

//Types
NUMBER_TYPE: 'numar ';
STRING_TYPE: 'sdc ';
BOOLEAN_TYPE: 'bool ';

// Types values
BOOLEAN: 'TRUE' | 'FALSE';
STRING: '"' ~('\r'|'\n'|'"')* '"';
NUMBER: '-'? [0-9]+ ( ('.')? [0-9]+ )?;

// Operators
AND:'&&';
OR: '||';
GT : '>' ;
GE : '>=' ;
LT : '<' ;
LE : '<=' ;
EQ : '=' ;
NOT: '!';

COMMENT_LINE: '//' ~[\r\n]* -> skip;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [\r\n\t ]+ -> skip;
