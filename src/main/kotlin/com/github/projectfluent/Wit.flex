package com.github.projectfluent.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import com.intellij.util.containers.IntStack;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.projectfluent.language.psi.FluentTypes.*;

%%

%{
public _FluentLexer() {
	this((java.io.Reader)null);
}
%}

%public
%class _FluentLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

//%state TextContextIndent

WHITE_SPACE=[\s\t]
COMMENT_DOCUMENT=("///")[^\r\n]*
COMMENT_LINE = "//"[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
//SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
SYMBOL = [a-zA-Z][a-zA-Z0-9_-]*
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
	";" { return SEMICOLON; }
	"$" { return DOLLAR; }
	"." { return DOT; }
	"-" { return HYPHEN; }
}
<YYINITIAL> {
	{SYMBOL} { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
