package com.github.projectfluent.ide.codeStyle

import com.github.projectfluent.WitLanguage
import com.intellij.application.options.GenerationCodeStylePanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleSettings

class FluentCodeStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings) :
    TabbedLanguageCodeStylePanel(
        WitLanguage,
        currentSettings,
        settings
    ) {
    override fun initTabs(settings: CodeStyleSettings) {
        addIndentOptionsTab(settings)
        addWrappingAndBracesTab(settings)
        addTab(GenerationCodeStylePanel(settings, WitLanguage))
    }
}
