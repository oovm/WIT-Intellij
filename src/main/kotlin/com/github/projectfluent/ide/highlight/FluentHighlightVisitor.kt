package com.github.projectfluent.ide.highlight


import com.github.projectfluent.ide.highlight.FluentHighlightColor.*
import com.github.projectfluent.language.file.FluentFile
import com.github.projectfluent.language.psi.*
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class FluentHighlightVisitor : FluentVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null


    override fun visitImport(o: FluentImport) {
        super.visitImport(o)
    }

    override fun visitResource(o: FluentResource) {
        o.identifier?.let { highlight(it, SYM_RESOURCE) }
    }

    override fun visitRecord(o: FluentRecord) {
        o.identifier?.let { highlight(it, SYM_RECORD) }
    }

    override fun visitRecordField(o: FluentRecordField) {
        highlight(o.identifier, SYM_FIELD)
    }

    override fun visitInterfaceName(o: FluentInterfaceName) {
        highlight(o, SYM_INTERFACE)
    }

//    override fun visitSchemaStatement(o: JssSchemaStatement) {
//        //
//        val head = o.firstChild;
//        highlight(head, FluentColor.KEYWORD)
//        //
//        val prop = head.nextLeaf { it.elementType == JssTypes.SYMBOL }!!
//        highlight(prop, FluentColor.SYM_SCHEMA)
//
//        super.visitSchemaStatement(o)
//    }


    private fun highlight(element: PsiElement, color: FluentHighlightColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable,
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = FluentHighlightVisitor()

    override fun suitableForFile(file: PsiFile): Boolean = file is FluentFile

    override fun visit(element: PsiElement) = element.accept(this)
}