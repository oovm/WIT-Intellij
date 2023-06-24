package com.github.projectfluent

import com.intellij.lang.Language

object WitLanguage : Language("wit") {
    private fun readResolve(): Any = WitLanguage
    const val BUNDLE = "messages.WitBundle"
}


