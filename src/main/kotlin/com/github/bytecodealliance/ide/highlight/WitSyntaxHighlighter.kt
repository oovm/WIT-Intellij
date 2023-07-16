package com.github.bytecodealliance.ide.highlight


import com.github.bytecodealliance.language.psi.FluentLexerAdapter
import com.github.bytecodealliance.language.psi.WitTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class WitSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return FluentLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): WitHighlightColor? {
        return when (tokenType) {
            KW_PACKAGE, KW_WORLD, KW_INTERFACE,
            KW_INCLUDE, KW_USE, KW_IMPORT, KW_EXPORT,
            KW_TYPE, KW_RESOURCE, KW_RECORD, KW_VARIANT, KW_FLAGS, KW_ENUM,
            KW_FUNCTION,
            -> WitHighlightColor.KEYWORD

            PARENTHESIS_L, PARENTHESIS_R -> WitHighlightColor.PARENTHESES
            BRACKET_L, BRACKET_R -> WitHighlightColor.BRACKETS
            BRACE_L, BRACE_R -> WitHighlightColor.BRACES
            COLON, EQ -> WitHighlightColor.OPERATION
            AT, STAR -> WitHighlightColor.OPERATION

            COMMA -> WitHighlightColor.COMMA
            // atom
            VERSION -> WitHighlightColor.NUMBER

            SELECTION_LINE -> WitHighlightColor.TEXT
            STRING_QUOTE, STRING_CHAR -> WitHighlightColor.STRING
            STRING_ESCAPE -> WitHighlightColor.STRING_ESCAPED
//            STRING -> AwslColor.STRING
            SYMBOL -> WitHighlightColor.IDENTIFIER
            // 注释
            COMMENT_LINE -> WitHighlightColor.LINE_COMMENT
            COMMENT_BLOCK -> WitHighlightColor.BLOCK_COMMENT
            COMMENT_DOCUMENT -> WitHighlightColor.DOC_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> WitHighlightColor.BAD_CHARACTER
            else -> null
        }
    }
}
