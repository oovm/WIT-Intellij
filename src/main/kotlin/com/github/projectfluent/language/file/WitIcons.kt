package com.github.projectfluent.language.file

import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class WitIcons : IconProvider() {
    override fun getIcon(psiElement: PsiElement, flags: Int): Icon? {
        val fileName = psiElement.containingFile.name

        return when {
            fileName.endsWith(".wit") -> FILE
            else -> null
        }
    }

    companion object {
        val FILE = IconLoader.getIcon("/icons/wit.svg", WitIcons::class.java)
    }
}