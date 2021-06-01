grammar RoC;
// a RoC program REQUIRES to have a main method e.g.
//  functia main()
//  {
//    <do your thing :D>
//  }

program: method_declaration* EOF;
// Methods can do the return statement only at the end, this means NO MULTIPLE RETURN STATEMENTS
// All methods in RoC are static methods so that you can call them in the main method
method_declaration
                  : Method methodName=IDENTIFIER PAREN_OPEN argument_list? PAREN_CLOSE (Return returnType=type)?
                        CURLY_OPEN body=block* (Return returnValue=expr)? CURLY_CLOSE
                  ;

argument_list
            : (type IDENTIFIER (COMMA type  IDENTIFIER)*)
            ;
// The operators follows the JAVA presendence table that we've found on https://introcs.cs.princeton.edu/java/11precedence/
expr
    : PAREN_OPEN expr PAREN_CLOSE                                               # PARENGRP
    | left=expr op=(MULTIPLY | DIVIDE | MODULO) right=expr                      # MULDIVMODOPGRP
    | left=expr op=(PLUS | MINUS)               right=expr                      # ADDSUBGRP
    | left=expr op=comparator right=expr                                        # ComparisonExpressionWithOperator
    | left=expr op=(AND | OR) right=expr                                        # LogicalExpressionAndOr
    | functionCall                                                              # MethodCallExpr
    | SCANNERCALL                                                               # scannerCall
    | NUMBER                                                                    # NUMBER
    | SHORT                                                                     # SHORT
    | STRING                                                                    # STRING
    | BOOLEAN                                                                   # BOOLEAN
    | IDENTIFIER                                                                # IDENTIFIER
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
                    :(expr(COMMA expr)*) #MethodCallArgumentList
                    ;
// RoC supports only If else statements
decisionStatement: If PAREN_OPEN if_lhs=expr PAREN_CLOSE CURLY_OPEN if_rhs=block CURLY_CLOSE
                 (Else CURLY_OPEN else_lhs=block CURLY_CLOSE)?
                 ;

printStatement: Print PAREN_OPEN (expr) PAREN_CLOSE ;
// RoC has 2 iteration statements while and do while
iterationStatement
                  : While expr Execute CURLY_OPEN block CURLY_CLOSE #WhileLoop
                  | Execute CURLY_OPEN block CURLY_CLOSE While expr #DoWhileLoop
                  ;

variable_declaration: type lhs=IDENTIFIER EQUALS_TO rhs=expr;

varExpression
            : IDENTIFIER EQUALS_TO expr # AssignmentExpression
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
    | SHORT_TYPE
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
SHORT_TYPE : 'scurt' ;
NUMBER_TYPE : 'numar' ;
STRING_TYPE : 'sdc'   ;
BOOLEAN_TYPE: 'bool'  ;
AUTO_TYPE   :'automat';
SCANNER     :'scanner';

While  : 'cat timp'  ;
If     : 'daca'      ;
Else   :'altfel daca';
Execute: 'executa'   ;
Print  : 'printeaza' ;
Return :'returneaza' ;
Method :'functia'    ;
SCANNERCALL:'urmatorul';

// Types values
BOOLEAN: 'ADEVARAT' | 'FALS';
STRING : '"' ~('\r'|'\n'|'"')* '"';
SHORT  :  '$'?[0-9]; // Custom data type, which stores only numbers from 0 to 9 and negative ones
NUMBER : '0' | '$'? [1-9][0-9]*;// $21 represents -21

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
