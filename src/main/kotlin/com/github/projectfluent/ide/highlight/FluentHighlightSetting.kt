package com.github.projectfluent.ide.highlight

import com.github.projectfluent.WitBundle
import com.github.projectfluent.language.file.WitIcons
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class FluentHighlightSetting : ColorSettingsPage {
    private val annotatorTags = FluentHighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = FluentHighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = WitBundle.message("filetype.name")

    override fun getIcon() = WitIcons.FILE

    override fun getHighlighter() = FluentSyntaxHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText() = javaClass.getResource("/fileTemplates/colorDemo.ftl")!!.readText()

}
