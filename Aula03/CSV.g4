grammar CSV;

file: row+ EOF;

row: field (',' field)* '\r'? '\n';

field: TEXT;

TEXT: [a-zA-Z0-9]+;