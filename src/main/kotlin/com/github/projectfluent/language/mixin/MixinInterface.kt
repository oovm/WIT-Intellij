package com.github.projectfluent.language.mixin

import com.github.projectfluent.ide.view.WitItemPresentation

import com.github.projectfluent.language.psi.WitElement
import com.github.projectfluent.language.psi.WitInterface
import com.github.projectfluent.language.psi.WitRecordField
import com.github.projectfluent.language.psi.WitResource
import com.github.projectfluent.language.psi.WitVariant
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

abstract class MixinInterface(node: ASTNode) : WitElement(node),
    PsiNameIdentifierOwner,
    WitInterface {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.interfaceName
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Interface, nameIdentifier?.text ?: "missing interface")
    }
}


abstract class MixinVariant(node: ASTNode) : WitElement(node),
    PsiNameIdentifierOwner,
    WitVariant {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifier
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Variable, nameIdentifier?.text ?: "missing interface")
    }
}


abstract class MixinResource(node: ASTNode) : WitElement(node),
    PsiNameIdentifierOwner,
    WitResource {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifier
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Record, nameIdentifier?.text ?: "missing interface")
    }
}

abstract class MixinField(node: ASTNode) : WitElement(node),
    PsiNameIdentifierOwner,
    WitRecordField {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifier
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Field, nameIdentifier?.text ?: "missing interface")
    }
}

