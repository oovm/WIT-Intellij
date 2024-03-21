package com.github.bytecodealliance.language.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.WitLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class WitFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, WitLanguage) {
    override fun getFileType(): FileType = WitFileType.INSTANCE
    override fun getParserDefinition(): ParserDefinition {
        // print file extension
        println("File extension: " + this.fileType.defaultExtension)
        return super.getParserDefinition()
    }
    override fun toString(): String = MessageBundle.message("action.create_file")
}

