package com.github.bytecodealliance.ide.highlight


import com.github.bytecodealliance.language.psi.WitParserDefinition
import com.github.bytecodealliance.language.psi.WitTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class WitSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return WitParserDefinition.createLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): HighlightColor? {
        return when (tokenType) {
            KW_PACKAGE, KW_WORLD, KW_INTERFACE,
            KW_INCLUDE, KW_USE, KW_IMPORT, KW_EXPORT, KW_AS,
            KW_TYPE, KW_RESOURCE, KW_RECORD, KW_VARIANT, KW_FLAGS, KW_ENUM,
            KW_FUNCTION, KW_CONSTRUCTOR,
            -> HighlightColor.KEYWORD

            PARENTHESIS_L, PARENTHESIS_R -> HighlightColor.PARENTHESES
            BRACKET_L, BRACKET_R -> HighlightColor.BRACKETS
            BRACE_L, BRACE_R -> HighlightColor.BRACES
            COLON, EQ -> HighlightColor.OPERATION
            AT, STAR -> HighlightColor.OPERATION

            COMMA -> HighlightColor.COMMA
            // atom
            VERSION -> HighlightColor.NUMBER

            SELECTION_LINE -> HighlightColor.TEXT
            STRING_QUOTE, STRING_CHAR -> HighlightColor.STRING
            STRING_ESCAPE -> HighlightColor.STRING_ESCAPED
//            STRING -> AwslColor.STRING
            SYMBOL -> HighlightColor.IDENTIFIER
            // 注释
            COMMENT_LINE -> HighlightColor.LINE_COMMENT
            COMMENT_BLOCK -> HighlightColor.BLOCK_COMMENT
            COMMENT_DOCUMENT -> HighlightColor.DOC_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> HighlightColor.BAD_CHARACTER
            else -> null
        }
    }
}

