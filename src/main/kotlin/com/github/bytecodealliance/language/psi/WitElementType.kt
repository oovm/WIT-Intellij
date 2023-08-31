package com.github.bytecodealliance.language.psi

import com.github.bytecodealliance.WitLanguage
import com.github.bytecodealliance.WitxLanguage
import com.intellij.psi.tree.IElementType

class WitElementType(debugName: String) : IElementType(debugName, WitLanguage)

class WitxElementType(debugName: String) : IElementType(debugName, WitxLanguage)