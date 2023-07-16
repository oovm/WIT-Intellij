package com.github.bytecodealliance.language.psi


import com.github.bytecodealliance.language._WitLexer
import com.intellij.lexer.FlexAdapter

class FluentLexerAdapter : FlexAdapter(_WitLexer(null))
