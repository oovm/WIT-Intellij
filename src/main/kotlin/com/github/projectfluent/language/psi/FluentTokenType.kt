package com.github.projectfluent.language.psi

import com.github.projectfluent.WitLanguage
import com.intellij.psi.tree.IElementType

class FluentTokenType(debugName: String) : IElementType(debugName, WitLanguage) {
    override fun toString(): String = "FluentToken.${super.toString()}"
}

