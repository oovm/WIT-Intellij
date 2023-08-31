package com.github.bytecodealliance.ide.highlight

import com.github.bytecodealliance.language.psi.WitParserDefinition
import com.github.bytecodealliance.language.psi.WitParserDefinitionX
import com.github.bytecodealliance.language.psi.WitTypes
import com.github.bytecodealliance.language.psi.WitxTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class WitSyntaxHighlighterX : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return WitParserDefinitionX.createLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): HighlightColor? {
        return when (tokenType) {
            KW_TYPE, KW_ENUM, KW_RECORD
            -> HighlightColor.KEYWORD

            WitTypes.PARENTHESIS_L, WitTypes.PARENTHESIS_R -> HighlightColor.PARENTHESES
            WitTypes.BRACKET_L, WitTypes.BRACKET_R -> HighlightColor.BRACKETS
            WitTypes.BRACE_L, WitTypes.BRACE_R -> HighlightColor.BRACES
            WitTypes.COLON, WitTypes.EQ -> HighlightColor.OPERATION
            WitTypes.AT, WitTypes.STAR -> HighlightColor.OPERATION

            WitTypes.COMMA -> HighlightColor.COMMA
            // atom
            WitTypes.VERSION -> HighlightColor.NUMBER

            WitTypes.SELECTION_LINE -> HighlightColor.TEXT
            WitTypes.STRING_QUOTE, WitTypes.STRING_CHAR -> HighlightColor.STRING
            WitTypes.STRING_ESCAPE -> HighlightColor.STRING_ESCAPED
//            STRING -> AwslColor.STRING
            WitTypes.SYMBOL -> HighlightColor.IDENTIFIER
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