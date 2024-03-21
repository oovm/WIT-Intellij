package com.github.bytecodealliance.ide.highlight

import com.github.bytecodealliance.language.psi.WitParserDefinition
import com.github.bytecodealliance.language.psi.WitParserDefinitionX
import com.github.bytecodealliance.language.psi.WitTypes
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
            WitTypes.KW_PACKAGE, WitTypes.KW_WORLD, WitTypes.KW_INTERFACE,
            WitTypes.KW_INCLUDE, WitTypes.KW_USE, WitTypes.KW_IMPORT, WitTypes.KW_EXPORT, WitTypes.KW_AS,
            WitTypes.KW_TYPE, WitTypes.KW_RESOURCE, WitTypes.KW_RECORD, WitTypes.KW_VARIANT, WitTypes.KW_FLAGS, WitTypes.KW_ENUM,
            WitTypes.KW_FUNCTION, WitTypes.KW_CONSTRUCTOR,
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
            WitTypes.COMMENT_LINE -> HighlightColor.LINE_COMMENT
            WitTypes.COMMENT_BLOCK -> HighlightColor.BLOCK_COMMENT
            WitTypes.COMMENT_DOCUMENT -> HighlightColor.DOC_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> HighlightColor.BAD_CHARACTER
            else -> null
        }
    }
}