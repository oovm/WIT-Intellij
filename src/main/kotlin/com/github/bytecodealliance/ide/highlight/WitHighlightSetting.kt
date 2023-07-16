package com.github.bytecodealliance.ide.highlight

import com.github.bytecodealliance.WitBundle
import com.github.bytecodealliance.language.file.WitIcons
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class WitHighlightSetting : ColorSettingsPage {
    private val annotatorTags = WitHighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = WitHighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = WitBundle.message("filetype.name")

    override fun getIcon() = WitIcons.FILE

    override fun getHighlighter() = WitSyntaxHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText() = javaClass.getResource("/fileTemplates/colorDemo.ftl")!!.readText()

}
