package com.github.bytecodealliance.language.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.WitxLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class WitFileTypeX private constructor() : LanguageFileType(WitxLanguage) {

    override fun getName(): String = WitxLanguage.id

    override fun getDescription(): String = MessageBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "witx;"

    override fun getIcon(): Icon = IconProvider.FILE

    companion object {
        @JvmStatic
        val INSTANCE = WitFileTypeX()
    }
}