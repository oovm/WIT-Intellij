package com.github.projectfluent.language.mixin

import com.github.projectfluent.ide.view.WitItemPresentation
import com.github.projectfluent.language.psi.WitElement
import com.github.projectfluent.language.psi.WitFlags
import com.github.projectfluent.language.psi.WitVariant
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

abstract class MixinFlags(node: ASTNode) : WitElement(node),
    PsiNameIdentifierOwner,
    WitFlags {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifier
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.FieldPK, nameIdentifier?.text ?: "missing interface")
    }
}