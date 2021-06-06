grammar RoC;
// a RoC program REQUIRES to have a main method e.g.
//  functia main()
//  {
//    <do your thing :D>
//  }
// NOTE: If you want to define a function that you want to use in the main function you have
// declare it before the main

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
// The operators follows the JAVA precedence table that we've found on https://introcs.cs.princeton.edu/java/11precedence/
expr
    : PAREN_OPEN expr PAREN_CLOSE                                               # PARENGRP                          //  Level 16
    | left=expr op=(MULTIPLY | DIVIDE | MODULO) right=expr                      # MULDIVMODOPGRP                    //  Level 12
    | left=expr op=(PLUS | MINUS)               right=expr                      # ADDSUBGRP                         //  Level 11
    | left=expr op=relationalComparators        right=expr                      # RelationalComparisonExpression    //  Level 9
    | left=expr op=equalityOperators            right=expr                      # EqualityComparisonExpression      //  Level 8
    | left=expr op=AND                          right=expr                      # LogicalExpressionAnd              //  Level 4
    | left=expr op=OR                           right=expr                      # LogicalExpressionOr               //  Level 3
    | functionCall                                                              # MethodCallExpr
    | SCANNERCALL                                                               # scannerCall
    | SHORT                                                                     # SHORT
    | NUMBER                                                                    # NUMBER
    | STRING                                                                    # STRING
    | BOOLEAN                                                                   # BOOLEAN
    | IDENTIFIER                                                                # IDENTIFIER
    ;
// The block rule represents the body of a decission statement, iteration statement and function body
block
      : (decisionStatement
      | iterationStatement
      | functionCall
      | printStatement
      | varExpression
      | variable_declaration)+
      ;
// This represents the function call foo(), foo(a, a+2, b*2)
functionCall
            : IDENTIFIER PAREN_OPEN functionArgumentList? PAREN_CLOSE #MethodCall
            ;

functionArgumentList
                    :(expr(COMMA expr)*) #MethodCallArgumentList
                    ;
// RoC supports only If else statements
// RoC would have the else if statements like this into the grammar
// (Else_If PAREN_OPEN elseIF_lhs=expr PAREN_CLOSE CURLY_OPEN elseIF_rhs=block CURLY_CLOSE )*
// However, it's not implemented due to label issues that I couldn't figure out.
// and instead of having unwanted behaviour I remvoed them from the grammar
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

// Relational Comparators <, >, <=
relationalComparators
                        : GT
                        | GE
                        | LT
                        | LE
                        ;
// Equality comparators !=, =
equalityOperators
                    : EQ
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
COMMA      :',';

// Arithmetic operators
PLUS    :'+';
MINUS   :'-';
MULTIPLY:'*';
DIVIDE  :'/';
MODULO  :'%';

//Types
SHORT_TYPE  : 'scurt' ;
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
