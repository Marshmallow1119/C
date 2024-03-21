grammar SuffixCalculator;
program:
    stat* EOF   // Zero or more r e p e t i t i o n s o f s t a t
    ;
stat:
    expr? NEWLINE // O p t a t iv e expr f o l l o w e d by an end−o f−l i n e
    ;
expr:
     expr expr op=('*'|'/'|'+'|'-') #ExprSuffix 
   | Number                         #ExprNumber
;
Number : [0-9]+('.'[0-9]+)?; //fixed point real number
NEWLINE: '\r'? '\n';
WS:  [ \t]+ -> skip;