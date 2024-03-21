grammar Readgrammar;
program:
    stat* EOF
    ;
stat:
    Number '-' Letras NEWLINE
    ;
Letras:[a-zA-Z]+;
Number:[0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;

