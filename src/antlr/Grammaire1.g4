grammar Grammaire1;

/** Header Section **/
@header {
    package antlr;
}

/** Parser Rules **/
/** start symbole **/
start: var_global declaration instruction EOF;

/*VAR_GLOBAL*/
var_global: VAR_GLOBAL '{' var_expression* '}';
var_expression: TYPE id_variable (',' id_variable)* PVG;
id_variable: ID tableau?;
tableau: '[' INT ']';

/*DECLARATION*/
declaration: 'DECLARATION' '{' declaration_expression* '}';
declaration_expression: const | var_expression;
const: 'CONST' TYPE ID '=' (INT|FLOAT| MOTS) PVG;

/*INSTRUCTION*/
instruction: 'INSTRACTION' '{' instruction_expression* '}';
instruction_expression: affectation 
                      |if 
                      |boucle 
                      |fonction
                      ;
/****affectation*****/
affectation: id_variable '=' (expr|CHAR) PVG;
expr:'('expr')'
    | expr OPRATEUR_ARETHMETIC1 expr
    | expr OPRATEUR_ARETHMETIC2 expr
    | id_variable
    |INT
    |FLOAT
    ;
/****if*****/
if: IFSTATEMENT '(' condition ')' '{' instruction_expression '}' 
    (ELSEFSTATEMENT '{' instruction_expression '}')*;
condition_simple: expr OPRATEUR_COMPARAISON expr;
condition: condition_simple (OPRATEUR_LOGIQUE condition_simple)?;
/****boucle*****/
boucle: FORSTATMENT '(' id_variable '=' INT ':'INT ':' expr ')' '{' instruction_expression '}';
/****fonction*****/
fonction: write | read;
write: 'write(' MOTS (','(id_variable|MOTS))* ')' PVG;
read: 'read(' id_variable ')' PVG;

/** Lexer Rules **/
VAR_GLOBAL:'VAR_GLOBAL';
/* *mots cles * */
TYPE: 'INTEGER'
    | 'FLOAT'
    | 'CHAR';
IFSTATEMENT: 'IF';
ELSEFSTATEMENT: 'ELSE';
FORSTATMENT: 'FOR';


/* *OPRATEUR * */
OPRATEUR_LOGIQUE: '||' | '&&';
OPRATEUR_ARETHMETIC1: '*' | '/';
OPRATEUR_ARETHMETIC2: '+' | '-';
OPRATEUR_COMPARAISON: '>' | '>=' | '==' | '!=' | '<' | '<=';



/* *vallues* */
INT:'0' |'-'? [1-9][0-9]*;
FLOAT: '-'? [1-9][0-9]* '.' [0-9]* [1-9];
CHAR:'"' (~["]) '"';
MOTS: '"' (~["])* '"';
/* ** */
ID: [A-Z][a-zA-Z0-9]*;
/**/
PVG: ';';

/** Hidden Tokens **/
WS: [ \t\r\n]+ -> skip;
