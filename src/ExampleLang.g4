grammar ExampleLang;

program: method_declaration* statement* EOF;

method_declaration
                  : Method SPACE IDENTIFIER PAREN_OPEN (type IDENTIFIER (COMMA type IDENTIFIER)*)? PAREN_CLOSE (Return type)?
                        CURLY_OPEN statement_body* ( Return type)? CURLY_CLOSE
                  ;

statement
         : decisionStatement
         | iterationStatement
         | printStatement
         ;

conditions
          : equality_expr
          ;

equality_expr
            : logical_expr                      # LogicalExpression
            | equality_expr EQUALS logical_expr # EqualityEquals
            | equality_expr NOT_EQ logical_expr # EqualityNotEquals
            ;

logical_expr
            : logical_expr binary logical_expr     # LogicalExpressionAndOr
            | comparison_expr                      # ComparisonExpression
            | PAREN_OPEN logical_expr PAREN_CLOSE  # LogicalExpressionInParen
            | BOOLEAN                              # BOOLEAN
            | IDENTIFIER                           # LocalVariable
            ;

comparison_expr
                : comparison_operand comparator comparison_operand  # ComparisonExpressionWithOperator
                | PAREN_OPEN comparison_expr PAREN_CLOSE            # ComparisonExpressionParens
                ;

comparison_operand
                   : arithmetic_expr
                   ;

statement_body: (statement | variable_declaration)+;

arithmetic_expr
              : MINUS arithmetic_expr                  # UMINUS
              | arithmetic_expr mulop arithmetic_expr  # MULOPGRP
              | arithmetic_expr addop arithmetic_expr  # ADDOPGRP
              | PAREN_OPEN arithmetic_expr PAREN_CLOSE # PARENGRP
              | NUMBER                                 # NUMBER
              | IDENTIFIER                             # IDENTIFIER
              ;

addop
    : PLUS
    | MINUS
    ;

mulop
    : MULTIPLY
    | DIVIDE
    | MODULO
    ;

binary
     : AND
     | OR
     ;

decisionStatement: If PAREN_OPEN conditions PAREN_CLOSE CURLY_OPEN statement_body CURLY_CLOSE
                 (Else_If PAREN_OPEN conditions PAREN_CLOSE CURLY_OPEN statement_body CURLY_CLOSE )*
                 (Else CURLY_OPEN statement_body CURLY_CLOSE)?
                 ;

printStatement: Print PAREN_OPEN (IDENTIFIER | type_value) PAREN_CLOSE ;

iterationStatement
                  : while
                  | for
                  | do_while
                  ;

while: While conditions SPACE Execute CURLY_OPEN statement_body CURLY_CLOSE ;

do_while: Execute CURLY_OPEN statement_body CURLY_CLOSE While conditions ;

for: For SPACE (NUMBER_TYPE SPACE IDENTIFIER EQUALS_TO (left_num=NUMBER | left_id=IDENTIFIER)) COLON conditions COLON loop_incr SPACE Execute CURLY_OPEN statement_body CURLY_CLOSE ;

loop_incr
        : ()
        | IDENTIFIER EQUALS_TO arithmetic_expr
        ;

variable_declaration: type IDENTIFIER EQUALS_TO ( BOOLEAN
                                                | STRING
                                                | NUMBER ) SEMICOLON?;

comparator
        : GT
        | GE
        | LT
        | LE
        | EQ
        ;

type
    : STRING_TYPE
    | BOOLEAN_TYPE
    | NUMBER_TYPE
    ;

type_value
        : BOOLEAN
        | STRING
        | NUMBER
        ;

// Single character
PAREN_OPEN :'(';
PAREN_CLOSE:')';
CURLY_OPEN :'{';
CURLY_CLOSE:'}';
STR_OPEN   :'[';
STR_CLOSE  :']';
SEMICOLON  :';';
COLON      :':';
DOT        :'.';
COMMA      :',';
SPACE      :' ';
QUOTES     :'"';

// Arithmetic operators
PLUS    :'+';
MINUS   :'-';
MULTIPLY:'*';
DIVIDE  :'/';
MODULO  :'%';

//Types
NUMBER_TYPE : 'numar' ;
STRING_TYPE : 'sdc'   ;
BOOLEAN_TYPE: 'bool'  ;
AUTO_TYPE   :'automat';

While  : 'cat timp'  ;
If     : 'daca'      ;
Else   :'altfel daca';
Else_If: 'daca nu'   ;
Execute: 'executa'   ;
For    : 'pentru'    ;
Print  : 'printeaza' ;
Return :'returneaza' ;
Method :'functia'    ;


// Types values
BOOLEAN: 'ADEVARAT' | 'FALS';
STRING : '"' ~('\r'|'\n'|'"')* '"';
NUMBER : '-'? [0-9]+ ( ('.')? [0-9]+ )?;

// Relational Operators
AND   : '&&';
OR    : '||';
GT    : '>' ;
GE    : '>=';
LT    : '<' ;
LE    : '<=';
EQ    : '=' ;
NOT   : '!' ;
NOT_EQ: '!=';
EQUALS: '==';

//Assign
EQUALS_TO: '<-';

COMMENT_LINE: '#RoC' ~[\r\n]* -> skip;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [\r\n\t ]+ -> skip;
