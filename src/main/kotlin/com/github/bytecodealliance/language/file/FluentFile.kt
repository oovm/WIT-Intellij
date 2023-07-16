package com.github.bytecodealliance.language.file

import com.github.bytecodealliance.WitBundle
import com.github.bytecodealliance.WitLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class FluentFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, WitLanguage) {
    override fun getFileType(): FileType = WitFileType.INSTANCE

    override fun toString(): String = WitBundle.message("action.create_file")
}