package com.github.bytecodealliance

import com.intellij.lang.Language
import com.intellij.lang.xml.XMLLanguage

object WitxLanguage : Language("witx") {
    private fun readResolve(): Any = WitxLanguage
    override fun getDisplayName(): String {
        return "WIT X"
    }
}
