package com.github.projectfluent.ide.doc

import com.github.projectfluent.language.psi.WitElement
import com.github.projectfluent.language.psi.WitFunction
import com.github.projectfluent.language.psi.WitRecord
import com.github.projectfluent.language.psi.WitResource
import com.intellij.lang.documentation.DocumentationProvider
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.siblings
import java.util.function.Consumer


class WitDocumentationProvider : DocumentationProvider {

    override fun findDocComment(file: PsiFile, range: TextRange): PsiDocCommentBase? {
        return super.findDocComment(file, range)
    }

    override fun collectDocComments(file: PsiFile, sink: Consumer<in PsiDocCommentBase>) {
//        file.accept(object : PsiRecursiveElementVisitor() {
//            override fun visitElement(element: PsiElement) {
//                if (element is PsiComment) {
//                    if (element.text.startsWith("///")) {
//                        println(element.text)
//                        sink.accept(DocumentWrapper(element))
//                    }
//                }
//                super.visitElement(element)
//            }
//        })
    }

    override fun generateRenderedDoc(comment: PsiDocCommentBase): String? {
        return comment.text.trimStart('/', ' ')
    }

    override fun getDocumentationParts(
        element: PsiElement,
        originalElement: PsiElement?,
    ): DocumentationProvider.DocumentationParts? {
        return super.getDocumentationParts(element, originalElement)
    }
}

private class DocumentWrapper(psi: PsiComment) : WitElement(psi.node), PsiDocCommentBase {
    override fun getTokenType(): IElementType {
        return node.elementType
    }

    override fun getOwner(): PsiElement? {
//        for (sibling in siblings(forward = true)) {
//            when (sibling) {
//                is WitRecord, is WitResource -> {
//                    return sibling
//                }
//
//                is WitFunction -> {
//                    return sibling
//                }
//            }
//        }
        return null
    }
}