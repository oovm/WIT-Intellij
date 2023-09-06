package com.github.bytecodealliance.ide.highlight

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.language.file.WasmIconProvider
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class WitHighlightSetting : ColorSettingsPage {
    private val annotatorTags = HighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = HighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = MessageBundle.message("filetype.name")

    override fun getIcon() = WasmIconProvider.Wit

    override fun getHighlighter() = WitSyntaxHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText() = javaClass.getResource("/fileTemplates/colorDemo.ftl")!!.readText()

}
