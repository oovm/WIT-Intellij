package com.github.projectfluent.language.mixin

import com.github.projectfluent.ide.view.FluentItemPresentation
import com.github.projectfluent.language.psi.WitElement
import com.github.projectfluent.language.psi.FluentTerm
import com.github.projectfluent.language.psi.FluentWorld
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

abstract class MixinWorld(node: ASTNode) : WitElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    FluentWorld {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifier
    }

    override fun getPresentation(): ItemPresentation? {
        return FluentItemPresentation(AllIcons.Nodes.Enum, nameIdentifier?.text ?: "missing world")
    }
}
