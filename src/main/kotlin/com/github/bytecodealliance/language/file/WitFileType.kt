package com.github.bytecodealliance.language.file

import com.github.bytecodealliance.WitBundle
import com.github.bytecodealliance.WitLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class WitFileType private constructor() : LanguageFileType(WitLanguage) {

    override fun getName(): String = WitLanguage.id

    override fun getDescription(): String = WitBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "wit;"

    override fun getIcon(): Icon = WitIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = WitFileType()
    }
}