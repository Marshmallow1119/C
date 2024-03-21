grammar Hello;
end: (greetings | r)+;
r: 'bye' ID+;
greetings : 'hello' ID+;
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip;
