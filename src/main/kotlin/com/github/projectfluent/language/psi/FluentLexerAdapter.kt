package com.github.projectfluent.language.psi


import com.github.projectfluent.language._WitLexer
import com.intellij.lexer.FlexAdapter

class FluentLexerAdapter : FlexAdapter(_WitLexer(null))
