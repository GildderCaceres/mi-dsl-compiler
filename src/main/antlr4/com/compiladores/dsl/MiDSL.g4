grammar MiDSL;

programa
    : instruccion* EOF
    ;

instruccion
    : maquinaDeclaracion
    | sensorDeclaracion
    | accionMaquina
    | condicion
    ;

maquinaDeclaracion
    : MAQUINA ID PUNTO_COMA
    ;

sensorDeclaracion
    : SENSOR ID IGUAL NUMBER PUNTO_COMA
    ;

accionMaquina
    : accion ID PUNTO_COMA
    ;

condicion
    : SI ID MAYOR NUMBER ENTONCES accionMaquina
    ;

accion
    : INICIAR
    | DETENER
    ;

MAQUINA : 'maquina';
SENSOR : 'sensor';

SI : 'si';
ENTONCES : 'entonces';

INICIAR : 'iniciar';
DETENER : 'detener';

MAYOR : '>';
IGUAL : '=';

PUNTO_COMA : ';';

NUMBER : [0-9]+;

ID : [a-zA-Z_][a-zA-Z0-9_]*;

WS : [ \t\r\n]+ -> skip;