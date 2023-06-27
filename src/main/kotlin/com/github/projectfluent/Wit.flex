package com.github.projectfluent.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import com.intellij.util.containers.IntStack;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.projectfluent.language.psi.FluentTypes.*;

%%

//%{
//public WitLexer() {
//	this((java.io.Reader)null);
//}
//%}

%public
%class _WitLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

//%state TextContextIndent

WHITE_SPACE      = [\s\t]
COMMENT_DOCUMENT = [/]{3}[^\r\n]*
COMMENT_LINE     = [/]{2}[^\r\n]*
COMMENT_BLOCK    = [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
//SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
WORD = [a-zA-Z][a-zA-Z0-9]*
SYMBOL = {WORD}([-]{WORD})*
VERSION = ([0-9]+)(\.[0-9]+)(\.[0-9]+)(-[a-zA-Z0-9\-.]+)?
//STRING=\"([^\"\\]|\\.)*\"
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([Ee][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)

TEXT_LINE_HEAD = [^\r\n\s\t{}][^\r\n{}]*
TEXT_LINE = [^\r\n{}]+
CRLF      = \r\n | \n | \r


ESCAPE_SPECIAL= \\[^]
ESCAPE_UNICODE= \\(u{HEX}{4}|U{HEX}{6})
HEX = [0-9a-fA-F]

KW_PACKAGE    = "package"
KW_WORLD      = "world"
KW_INTERFACE  = "interface"
KW_INCLUDE    = "include"
KW_IMPORT     = "import"
KW_USE        = "use"
KW_RECORD     = "record"

%%

<YYINITIAL> {
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_DOCUMENT} { return COMMENT_DOCUMENT; }
	{COMMENT_LINE}     { return COMMENT_LINE; }
	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
}

<YYINITIAL> {
	"{" { return BRACE_L; }
	"}" { return BRACE_R; }
	"<" { return ANGLE_L; }
	">" { return ANGLE_R; }
	"^" { return ACCENT; }
	":" { return COLON; }
	";" { return SEMICOLON; }
	"$" { return DOLLAR; }
	"@" { return AT; }
	"/" { return SLASH; }
	"." { return DOT; }
	"-" { return HYPHEN; }
}
<YYINITIAL> {
	{KW_PACKAGE}   { return KW_PACKAGE; }
	{KW_WORLD}     { return KW_WORLD; }
	{KW_INTERFACE} { return KW_INTERFACE; }
	{KW_USE}       { return KW_USE; }
      	{KW_INCLUDE}   { return KW_INCLUDE; }
      {KW_IMPORT}   { return KW_IMPORT; }
	{VERSION}      { return VERSION; }
	{SYMBOL}       { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }