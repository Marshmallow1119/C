

grammar FracLang;

stats:   program;
program: (statement ';')* EOF;


statement: 
        'display' term                #StatementDisplayTerm
        | term                        #StatementTerm
        ;


term: 
    '(' term ')'                                                 #TermParenthesis
    | NUMBER                                                     #TermNumber
    | op=('+' | '-') term                                        #TermOp
    | term op=( '*' | ':') term                                  #TermTextMulAd
    | term op=('+' | '-') term                                   #TermTextAddSub
    | TEXT                                                       #TermText
    | FRACTION                                                   #TermFRACTION
    | TEXT '<=' term                                             #TermAtr
    | 'read' STRING                                              #TermRead  
    | 'reduce' term                                              #TermReduce
    ;


TEXT:[a-z]+;
NUMBER:[0-9]+;
STRING: '"' .*? '"';
FRACTION: NUMBER '/' NUMBER;
BREAK:[ \n\t\r] -> skip;
COMMENTS: '--' .*? '\n' -> skip;