package com.github.projectfluent

import com.github.projectfluent.WitLanguage.BUNDLE
import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey
import java.util.function.Supplier


object WitBundle : DynamicBundle(BUNDLE) {

    @Suppress("SpreadOperator")
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any):String {
        return getMessage(key, *params)
    }

    @Suppress("SpreadOperator", "unused")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any): Supplier<String> {
        return getLazyMessage(key, *params)
    }
}
