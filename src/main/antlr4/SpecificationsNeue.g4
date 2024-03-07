grammar SpecificationsNeue;

specTopLevel: sstruct EOF;

// lPreds: 'classification' lPred (COMMA lPred)* SCOLON;
// lPred: ident MAPSTO expr;

// conjunct_expr_list : expr (COMMA expr)*;

//relies: 'rely'  conjunct_expr_list SCOLON;
//guarantees: 'guarantee' conjunct_expr_list SCOLON;

//procedure: 'procedure' ident SCOLON (modifies | requires | ensures | relies | guarantees | lPreds)*;
//block: 'block' (pos=(BEGIN | END)?) (name=ident) SCOLON (assume_stmt | assert_stmt)+;

switchcase: '('test=expr ',' result=expr')';
switchstmt: 'switch' expr switchcase+ ;
fundeclaration: 'def' (EXTERN | GHOST)? (type='function'|'macro') (name=ident) (arglist) (EQ_OP expr)? ;
valdeclaration: 'def' (EXTERN | GHOST)? (type='var'|'const') (name=ident) EQ_OP (EQ_OP expr)? ;
declaration : fundeclaration | valdeclaration ; 

assume_stmt : ASSUME (arg=expr) SCOLON ;
assert_stmt : ASSERT (arg=expr) SCOLON ;

//modifies: 'modifies' ident (COMMA ident)* SCOLON;
//requires: 'requires' conjunct_expr_list SCOLON ;
//ensures: 'ensures' conjunct_expr_list SCOLON ;

boolLit : TRUE | FALSE;

arrayAccess: ident '[' expr']';

ident : ID;
nat: (DIGIT)+ ;
bv: value=nat BVSIZE;

boogieTypeName: BVSIZE #bvBType
        | INT #intBType
        | BOOL #boolBType
        | '[' (keyT=boogieTypeName) ']' (valT=boogieTypeName) #mapBType
        ;

arglist : expr (',' expr)* ;

sexpterm : expr | declaration ;
sexpdef: ident (COLON sexpTypeName)? '=' (expr);

sstruct : '{' (sexpdef (';' sexpdef)*)? '}';
slist : '(' expr (',' expr)* ')' ;

sexpTypeName : boogieTypeName
    | '{' (ident COLON sexpTypeName)* '}'
    | '(' sexpTypeName* ')'
    | ('bot' | 'void')
    | ('top' | '_')
    ;

logOp : IMPLIES_OP | AND_OP | OR_OP ;
relOp : EQ_OP | LT_OP | GT_OP | LE_OP | GE_OP | NEQ_OP;
addSubOp : ADD_OP | SUB_OP;
mulDivModOp: MUL_OP | DIV_OP | MOD_OP;

// based upon boogie grammar: https://boogie-docs.readthedocs.io/en/latest/LangRef.html#grammar
expr : arg1=expr ( EQUIV_OP arg2=expr )+ #equivExpr
    | arg1=expr ( op=logOp arg2=expr )+ #logicalExpr
    | arg1=expr ( op=relOp arg2=expr )+ #relExpr
    | arg1=expr ( op=addSubOp arg2=expr )+ #arithExpr
    | arg1=expr ( op=mulDivModOp arg2=expr )+ #mathExpr
    | arg1=expr '[' (pointer=expr) (COMMA (beginslice=expr) (COLON (endslice=expr))? )? ']' #sliceExpr
    | arg1=expr ('.' (field=ident)) #fieldAccessExpr
    | <assoc=right> expr slist #sexprApply
    | sstruct #structExpr
    | slist #listExpr
    | unaryExpr #unexp
    ;

unaryExpr : atomExpr #atomUnaryExpr
          | SUB_OP unaryExpr #negExpr
          | NOT_OP unaryExpr #notExpr
          ;

predicate: '('(q=FORALL|EXISTS) (bound=boundList) DCOLON (body=expr) ')';
typed_variable : (name=ident) COLON (btype=boogieTypeName) ;
boundList : typed_variable  (COMMA typed_variable)* ;

atomExpr : boolLit #boolLitExpr
         | bv #bvExpr
         | nat #natExpr
         | OLD LPAREN expr RPAREN #oldExpr
         | IF guard=expr THEN thenExpr=expr ELSE elseExpr=expr #ifThenElseExpr
         | predicate #predicateExpr
         | (name=BVOP_DIRECT) LPAREN (args=arglist) RPAREN #funExpr
         | ident #idExpr
         | LPAREN expr RPAREN #parenExpr
         ;

QUOTE : '"';
QUOTESTRING : QUOTE (~( '"' | '\n' | '\r'))+ QUOTE;

BVOP_DIRECT: BV OPNAME DIGIT+;

MEMORY_LOAD_DIRECT: MEMORY_LOAD DIGIT+ ENDIAN;
MEMORY_STORE_DIRECT: MEMORY_STORE DIGIT+ ENDIAN;
GAMMA_LOAD_DIRECT: GAMMA_LOAD DIGIT+;
GAMMA_STORE_DIRECT: GAMMA_STORE DIGIT+;
ZERO_EXTEND_DIRECT: ZERO_EXTEND DIGIT+ UNDERSCORE DIGIT+;
SIGN_EXTEND_DIRECT: SIGN_EXTEND DIGIT+ UNDERSCORE DIGIT+;

fragment MEMORY_LOAD: 'memory_load';
fragment MEMORY_STORE: 'memory_store';
fragment GAMMA_LOAD: 'gamma_load';
fragment GAMMA_STORE: 'gamma_store';
fragment ZERO_EXTEND: 'zero_extend';
fragment SIGN_EXTEND: 'sign_extend';

ENDIAN: LE | BE;

fragment BV: 'bv';

LONG: 'long';
SHORT: 'short';
INT: 'int';
CHAR: 'char';
BOOL: 'bool';

TRUE : 'true';
FALSE : 'false';

OLD: 'old';
IF: 'if';
THEN: 'then';
ELSE: 'else';

DIV_OP : 'div';
MOD_OP : 'mod';

BVSIZE: BV DIGIT+;

HOLE: '_';
PIPE: '|' | 'case';
EXTERN : 'extern';
GHOST: 'ghost';
FORALL: 'forall';
EXISTS: 'exists';
BEGIN: 'begin';
END: 'end';
VAR : 'var';
ASSUME: 'assume';
ASSERT: 'assert';

ID : NON_DIGIT ( NON_DIGIT | DIGIT )* ;
NON_DIGIT : ( [A-Z] | [a-z] | '\'' | '~' | '#' | '$' | '^' | '_' | '?' | '`') ;
DIGIT : [0-9];

COMMA : ',';

LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
MAPSTO : '->';

EQUIV_OP : '<==>';
IMPLIES_OP : '==>';
OR_OP : '||';
AND_OP : '&&';
EQ_OP : '==';
NEQ_OP : '!=';
LT_OP : '<';
LE_OP : '<=';
GT_OP : '>';
GE_OP : '>=';
ADD_OP : '+';
SUB_OP : '-';
MUL_OP : '*';
NOT_OP : '!';

COLON: ':';
DCOLON: '::';
SCOLON: ';';
fragment UNDERSCORE: '_';
fragment LE: '_le';
fragment BE: '_be';

fragment OPNAME : AND
       | OR
       | ADD
       | MUL
       | UDIV
       | UREM
       | SHL
       | LSHR
       | ULT
       | NAND
       | NOR
       | XOR
       | XNOR
       | SUB
       | SREM
       | SDIV
       | SMOD
       | ASHR
       | ULE
       | UGT
       | UGE
       | SLT
       | SLE
       | SGT
       | SGE
       | COMP
       ;

fragment AND : 'and';
fragment OR : 'or';
fragment ADD : 'add';
fragment MUL : 'mul';
fragment UDIV : 'udiv';
fragment UREM : 'urem';
fragment SHL : 'shl';
fragment LSHR : 'lshr';
fragment ULT : 'ult';
fragment NAND : 'nand';
fragment NOR : 'nor';
fragment XOR : 'xor';
fragment XNOR : 'xnor';
fragment SUB : 'sub';
fragment SREM : 'srem';
fragment SDIV : 'sdiv';
fragment SMOD : 'smod';
fragment ASHR : 'ashr';
fragment ULE : 'ule';
fragment UGT : 'ugt';
fragment UGE : 'uge';
fragment SLT : 'slt';
fragment SLE : 'sle';
fragment SGT : 'sgt';
fragment SGE : 'sge';
fragment COMP : 'comp';



// Ignored
NEWLINE : '\r'? '\n' -> skip;
WHITESPACE : [ \t]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;
