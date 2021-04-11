grammar RoC;

program: method_declaration* EOF;

method_declaration
                  : Method methodName=IDENTIFIER PAREN_OPEN argument_list? PAREN_CLOSE (Return returnType=type)?
                        CURLY_OPEN body=block+ (Return returnValue=type_value)? CURLY_CLOSE
                  ;

argument_list
            : (type IDENTIFIER (COMMA type  IDENTIFIER)*)
            ;

conditions
          : logical_expr
          ;

logical_expr
            : left=logical_expr (AND | OR) right=logical_expr       # LogicalExpressionAndOr
            | comparison_expr                                       # ComparisonExpression
            | PAREN_OPEN logical_expr PAREN_CLOSE                   # LogicalExpressionInParen
            ;

comparison_expr
                : left=arithmetic_expr comparator right=arithmetic_expr     # ComparisonExpressionWithOperator
                | PAREN_OPEN comparison_expr PAREN_CLOSE                    # ComparisonExpressionParens
                ;
block
      : statement_body
      ;

statement_body
                : (decisionStatement
                | iterationStatement
                | functionCall
                | printStatement
                | varExpression
                | variable_declaration SEMICOLON?)+
                ;

functionCall
            : IDENTIFIER PAREN_OPEN functionArgumentList? PAREN_CLOSE #MethodCall
            ;

functionArgumentList
                    :(type_value(COMMA type_value)*) #MethodCallArgumentList
                    ;

arithmetic_expr
              : left=arithmetic_expr op=(MULTIPLY | DIVIDE | MODULO) right=arithmetic_expr  # MULDIVMODOPGRP
              | left=arithmetic_expr op=(PLUS | MINUS)               right=arithmetic_expr  # ADDSUBGRP
              | PAREN_OPEN arithmetic_expr PAREN_CLOSE                                      # PARENGRP
              | functionCall                                                                # MethodCallExpr
              | NUMBER                                                                      # NUMBER
              | STRING                                                                      # STRING
              | BOOLEAN                                                                     # BOOLEAN
              | IDENTIFIER                                                                  # IDENTIFIER
              ;

decisionStatement: If PAREN_OPEN if_lhs=conditions PAREN_CLOSE CURLY_OPEN if_rhs=block CURLY_CLOSE
                 (Else_If PAREN_OPEN elseIF_lhs=conditions PAREN_CLOSE CURLY_OPEN elseIF_rhs=block CURLY_CLOSE )*
                 (Else CURLY_OPEN else_lhs=block CURLY_CLOSE)?
                 ;

printStatement: Print PAREN_OPEN (type_value) PAREN_CLOSE ;

iterationStatement
                  : While conditions Execute CURLY_OPEN block CURLY_CLOSE #WhileLoop
                  | For (NUMBER_TYPE IDENTIFIER EQUALS_TO (left_num=NUMBER | left_id=IDENTIFIER)) COLON conditions COLON (IDENTIFIER EQUALS_TO arithmetic_expr) Execute CURLY_OPEN statement_body CURLY_CLOSE #ForLoop
                  | Execute CURLY_OPEN block CURLY_CLOSE While conditions #DoWhileLoop
                  ;

variable_declaration: type lhs=IDENTIFIER EQUALS_TO arithmetic_expr;

varExpression
            : IDENTIFIER EQUALS_TO arithmetic_expr # AssignmentExpression
            ;

comparator
        : GT
        | GE
        | LT
        | LE
        | EQ
        | NOT_EQ
        ;

type
    : STRING_TYPE
    | BOOLEAN_TYPE
    | NUMBER_TYPE
    | AUTO_TYPE
    ;

type_value
        : BOOLEAN
        | STRING
        | NUMBER
        | IDENTIFIER
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
NUMBER : '0' | ('- ')? [1-9][0-9]* ('.'[0-9]*)?;

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
