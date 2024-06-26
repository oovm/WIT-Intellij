package com.github.bytecodealliance.ide.view

import com.intellij.navigation.ItemPresentation
import javax.swing.Icon

class WitItemPresentation(private val icon: Icon, val text: String, private val detail: String? = null) :
    ItemPresentation {
    override fun getPresentableText(): String = text
    override fun getIcon(unused: Boolean): Icon = icon
    override fun getLocationString(): String? = detail
}