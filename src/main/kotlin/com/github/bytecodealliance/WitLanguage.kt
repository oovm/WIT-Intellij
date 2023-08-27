package com.github.bytecodealliance

import com.intellij.lang.Language

object WitLanguage : Language("wit") {
    private fun readResolve(): Any = WitLanguage

}


