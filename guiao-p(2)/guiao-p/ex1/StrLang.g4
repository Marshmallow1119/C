


grammar StrLang;


program: (statements)* EOF;

statements: 
        'print' '('? term')'?                    #termSimple
        | Var ':' term                          #TermVar
        | Var ':' 'input' '(' STRING ')'          #TermStatement
        ;

term:
    Var                        #TextTerm
    | STRING                   #PearspsText
    | 'print' term              #PrintStatement
    | term '+' term             #TermADD
    | term '-' term             #TermSUB
    | 'trim' term               #trimterm
    | term '/' term '/' term    #TermTermExpr
    | '(' term ')'              #ParenthesesExpr
    ;




STRING: '"' .*? '"';

BREAKS: [ \n\t\r] -> skip;
COMMENTS: ('//' .*? '\n') ->skip;
Var: [a-zA-Z0-9]+;
