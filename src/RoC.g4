grammar RoC;

program: method_declaration* EOF;

method_declaration
                  : Method methodName=IDENTIFIER PAREN_OPEN argument_list? PAREN_CLOSE (Return returnType=type)?
                        CURLY_OPEN body=block* (Return returnValue=arithmetic_expr)? CURLY_CLOSE
                  ;

argument_list
            : (type IDENTIFIER (COMMA type  IDENTIFIER)*)
            ;

conditions
          : logical_expr
          ;

logical_expr
            : PAREN_OPEN logical_expr PAREN_CLOSE                   # LogicalExpressionInParen
            | left=logical_expr (AND | OR) right=logical_expr       # LogicalExpressionAndOr
            | left=arithmetic_expr comparator right=arithmetic_expr # ComparisonExpressionWithOperator
            ;

block
      : (decisionStatement
      | iterationStatement
      | functionCall
      | printStatement
      | varExpression
      | variable_declaration)+
      ;

functionCall
            : IDENTIFIER PAREN_OPEN functionArgumentList? PAREN_CLOSE #MethodCall
            ;

functionArgumentList
                    :(arithmetic_expr(COMMA arithmetic_expr)*) #MethodCallArgumentList
                    ;

arithmetic_expr
              : PAREN_OPEN arithmetic_expr PAREN_CLOSE                                      # PARENGRP
              | left=arithmetic_expr op=(MULTIPLY | DIVIDE | MODULO) right=arithmetic_expr  # MULDIVMODOPGRP
              | left=arithmetic_expr op=(PLUS | MINUS)               right=arithmetic_expr  # ADDSUBGRP
              | functionCall                                                                # MethodCallExpr
              | scannerCall                                                                 # CallSCANNER
              | SCANNER                                                                     # SCANNER
              | NUMBER                                                                      # NUMBER
              | STRING                                                                      # STRING
              | BOOLEAN                                                                     # BOOLEAN
              | IDENTIFIER                                                                  # IDENTIFIER
              ;

decisionStatement: If PAREN_OPEN if_lhs=conditions PAREN_CLOSE CURLY_OPEN if_rhs=block CURLY_CLOSE
                 (Else_If PAREN_OPEN elseIF_lhs=conditions PAREN_CLOSE CURLY_OPEN elseIF_rhs=block CURLY_CLOSE )*
                 (Else CURLY_OPEN else_lhs=block CURLY_CLOSE)?
                 ;

printStatement: Print PAREN_OPEN (arithmetic_expr) PAREN_CLOSE ;

iterationStatement
                  : While conditions Execute CURLY_OPEN block CURLY_CLOSE #WhileLoop
                  | Execute CURLY_OPEN block CURLY_CLOSE While conditions #DoWhileLoop
                  ;

variable_declaration: type lhs=IDENTIFIER EQUALS_TO rhs=arithmetic_expr;

scannerCall
            : IDENTIFIER DOT SCANNERCALL
            ;

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
    | SCANNER
    ;

// Single character
PAREN_OPEN :'(';
PAREN_CLOSE:')';
CURLY_OPEN :'{';
CURLY_CLOSE:'}';
COLON      :':';
DOT        :'.';
COMMA      :',';

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
SCANNER     :'scanner';

While  : 'cat timp'  ;
If     : 'daca'      ;
Else   :'altfel daca';
Else_If: 'daca nu'   ;
Execute: 'executa'   ;
Print  : 'printeaza' ;
Return :'returneaza' ;
Method :'functia'    ;
SCANNERCALL:'urmatorul';

// Types values
BOOLEAN: 'ADEVARAT' | 'FALS';
STRING : '"' ~('\r'|'\n'|'"')* '"';
NUMBER : '0' | [1-9][0-9]*;// Only Positive numbers

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
INPUT : '<<';

//Assign
EQUALS_TO: '<-';

COMMENT_LINE: '#RoC' ~[\r\n]* -> skip;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [\r\n\t ]+ -> skip;
