grammar ExampleLang;

program: statement* EOF;

statement: (HELLO | HI) SEMICOLON;

HELLO: 'hello';
HI:    'hi';
SEMICOLON: ';';

WS: [\r\n\t ]+ -> skip;
