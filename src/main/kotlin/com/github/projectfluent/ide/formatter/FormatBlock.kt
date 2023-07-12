package com.github.projectfluent.ide.formatter

import com.github.projectfluent.language.ast.computeSpacing
import com.github.projectfluent.language.ast.isWhitespaceOrEmpty
import com.github.projectfluent.language.psi.WitEnum
import com.github.projectfluent.language.psi.WitFlags
import com.github.projectfluent.language.psi.WitInterface
import com.github.projectfluent.language.psi.WitRecord
import com.github.projectfluent.language.psi.WitResource
import com.github.projectfluent.language.psi.WitUseItems
import com.github.projectfluent.language.psi.WitVariant
import com.github.projectfluent.language.psi.WitWorld
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.formatter.FormatterUtil

class FormatBlock(
    private val node: ASTNode,
    private val alignment: Alignment?,
    private val indent: Indent?,
    private val wrap: Wrap?,
    private val space: WitFormatSpace,
) : ASTBlock {
    private val myIsIncomplete: Boolean by lazy {
        node.getChildren(null).any { it.elementType is PsiErrorElement } || FormatterUtil.isIncomplete(node)
    }

    private val mySubBlocks: List<Block> by lazy { buildChildren() }

    private fun buildChildren(): List<Block> {
        return node.getChildren(null)
            .filter { !it.isWhitespaceOrEmpty() }
            .map { childNode ->
                FormatBlock(
                    node = childNode,
                    alignment = null,
                    indent = computeIndent(childNode),
                    wrap = null,
                    space
                )
            }
    }

    override fun isLeaf(): Boolean = node.firstChildNode == null

    override fun getNode() = node

    override fun getTextRange(): TextRange = node.textRange

    override fun getWrap() = wrap

    override fun getIndent() = indent

    override fun getAlignment() = alignment

    override fun getSpacing(child1: Block?, child2: Block) = computeSpacing(child1, child2, space)

    override fun getSubBlocks(): List<Block> = mySubBlocks

    override fun isIncomplete(): Boolean = myIsIncomplete

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        val indent = when (node.psi) {
            // is FluentAttribute -> Indent.getNormalIndent()
            else -> Indent.getNoneIndent()
        }
        return ChildAttributes(indent, null)
    }

    private fun computeIndent(child: ASTNode): Indent? {
        return when (node.psi) {
            is WitWorld -> node.indentInRange(child, 1, 1)
            is WitInterface -> node.indentInRange(child, 3, 1)
            is WitUseItems -> node.indentInRange(child, 2, 1)
            is WitResource -> node.indentInRange(child, 1, 1)
            is WitRecord -> node.indentInRange(child, 1, 1)
            is WitFlags -> node.indentInRange(child, 1, 1)
            is WitEnum -> node.indentInRange(child, 1, 1)
            is WitVariant -> node.indentInRange(child, 1, 1)
            else -> Indent.getNoneIndent()
        }
    }
}

private fun ASTNode.indentInRange(child: ASTNode, head: Int, tail: Int): Indent {
    val children = this.getChildren(null);
    val index = children.indexOf(child)
    val last = children.size - tail
    return when {
        index <= head -> Indent.getNoneIndent()
        index >= last -> Indent.getNoneIndent()
        else -> Indent.getNormalIndent()
    }
}