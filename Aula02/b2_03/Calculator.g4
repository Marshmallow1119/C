grammar Calculator;
program:

    stat* EOF
        ;
    stat: 
        expr? NEWLINE
        ;
        //etiquetas começam com #
    expr: 
          '-' expr                                 #ExprMinus
        | '+' expr                                 #ExprPlus
        | expr op=( '*' | '/' | '%') expr          #ExprMultDivMod
        | expr op=( '+' | '-' ) expr               #ExprAddSub
        | Integer                                  #ExprInteger
        | '(' expr ')'                             #ExprParent
        ;
    Integer: [0-9]+;
    NEWLINE:'\r'? '\n';
    WS: [ \t]+ ->   skip;
    COMMENT: '#' .*? '\n' -> skip;

