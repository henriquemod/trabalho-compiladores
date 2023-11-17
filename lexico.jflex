package placaDeCarro;

import java_cup.runtime.*;

%%
%cup 
%class Lexer
digito  = [0-9] 
letra   = [A-Z]
ident   = {letra} ({letra}|{digito})* 
inteiro = {digito} ({digito})* 

placa   = {letra}{letra}{letra}-{digito}{digito}{digito}{digito}
placaalt   = ({letra}|{digito})({letra}|{digito})({letra}|{digito})({letra}|{digito})({letra}|{digito})({letra}|{digito})({letra}|{digito})({letra}|{digito})

novaLinha    = \r | \n | \r\n
brancos      = [ \t\f] | {novaLinha}

%%
{inteiro}       { int aux = Integer.parseInt(yytext());
                  return new Symbol(sym.INTEIRO, yyline, yycolumn, new Integer(aux));}	
"+"             { return new Symbol(sym.MAIS);}
"-"             { return new Symbol(sym.MENOS);}
";"             { return new Symbol(sym.PTVIRG);}
({placa} | {placaalt})         { return new Symbol(sym.PLACA, yyline, yycolumn, yytext()); }
{brancos}       {}

. { return new Symbol(sym.EOF, yyline, yycolumn, yytext()); }