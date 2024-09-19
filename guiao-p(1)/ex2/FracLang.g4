grammar FracLang;

//sequencia de comandos

program: (statements ';')* EOF;

statements:
    'display'  expr                             #DisplayExpr
    | ID '<='  expr                             #IDExpr
    ;   

expr:
    fraction                                    #FractionExpr
    | '(' expr ')'                              #SimpleExpr
    |op = ( '+' | '-') expr                     #AddSubIDNUMBER
    |ID                                         #SimpleID
    |NUMBER                                     #SimpleNumber
    |expr ('+' | '-'| '*' | '/' | ':') expr     #AddSubMultSubExpr
    | expr  op= ( '+' | '-') expr               #IdOperationExpr
    ;



ID: [a-z]+;       
fraction: NUMBER '/' NUMBER;          
NUMBER:[0-9]+;             
BREAKS:[ \n\t\r] -> skip;
COMMENTS: '--' .*? '\n' -> skip;




