package com.github.projectfluent.ide.view

import com.github.projectfluent.language.file.FluentFile
import com.github.projectfluent.language.psi.WitEnum
import com.github.projectfluent.language.psi.WitFlags
import com.github.projectfluent.language.psi.WitInterface
import com.github.projectfluent.language.psi.WitRecord
import com.github.projectfluent.language.psi.WitResource
import com.github.projectfluent.language.psi.WitVariant
import com.github.projectfluent.language.psi.WitWorld
import com.github.projectfluent.language.psi_node.WitEnumNode
import com.github.projectfluent.language.psi_node.WitExportNode
import com.github.projectfluent.language.psi_node.WitFlagsNode
import com.github.projectfluent.language.psi_node.WitFunctionNode
import com.github.projectfluent.language.psi_node.WitIncludeNode
import com.github.projectfluent.language.psi_node.WitInterfaceNode
import com.github.projectfluent.language.psi_node.WitMethodNode
import com.github.projectfluent.language.psi_node.WitRecordFieldNode
import com.github.projectfluent.language.psi_node.WitRecordNode
import com.github.projectfluent.language.psi_node.WitResourceNode
import com.github.projectfluent.language.psi_node.WitSemanticNumberNode
import com.github.projectfluent.language.psi_node.WitVariantItemNode
import com.github.projectfluent.language.psi_node.WitVariantNode
import com.github.projectfluent.language.psi_node.WitWorldNode
import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.util.PsiTreeUtil

class WitStructureViewElement(private val node: NavigatablePsiElement) :
    StructureViewTreeElement,
    SortableTreeElement {
    override fun getValue(): Any {
        return node
    }

    override fun navigate(requestFocus: Boolean) {
        node.navigate(requestFocus)
    }

    override fun canNavigate(): Boolean {
        return node.canNavigate()
    }

    override fun canNavigateToSource(): Boolean {
        return node.canNavigateToSource()
    }

    override fun getAlphaSortKey(): String {
        val name = node.name
        return name ?: ""
    }

    override fun getPresentation(): ItemPresentation {
        val presentation = node.presentation
        return presentation ?: PresentationData()
    }

    override fun getChildren(): Array<out TreeElement> = when (node) {
        is FluentFile -> getChildOfType(
            WitWorldNode::class.java,
            WitInterfaceNode::class.java,
        )
        is WitWorld -> getChildOfType(
            WitExportNode::class.java,
        )
        is WitInterface -> getChildOfType(
            WitResourceNode::class.java,
            WitRecordNode::class.java,
            WitVariantNode::class.java,
            WitEnumNode::class.java,
            WitFlagsNode::class.java,
            WitFunctionNode::class.java,
        )
        is WitResource -> getChildOfType(
            WitMethodNode::class.java
        )
        is WitRecord -> getChildOfType(
            WitRecordFieldNode::class.java
        )
        is WitEnum, is WitFlags -> getChildOfType(
            WitSemanticNumberNode::class.java
        )
        is WitVariant -> getChildOfType(
            WitVariantItemNode::class.java
        )

        else -> getChildOfType(
//            NavigatablePsiElement::class.java,
        )
    }

    private fun getChildOfType(vararg classes: Class<out NavigatablePsiElement>): Array<WitStructureViewElement> {
        return PsiTreeUtil.getChildrenOfAnyType(node, *classes)
            .map { WitStructureViewElement(it) }
            .toTypedArray()
    }
}

