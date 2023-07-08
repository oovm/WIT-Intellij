package com.github.projectfluent.ide.matcher


import com.github.projectfluent.language.psi.*
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement

class WitFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : WitRecursiveVisitor() {

    override fun visitInlinePlaceable(o: FluentInlinePlaceable) {
        descriptors += FoldingDescriptor(o.node, TextRange(o.firstChild.endOffset, o.lastChild.startOffset))
        super.visitInlinePlaceable(o)
    }





    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
