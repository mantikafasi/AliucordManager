/*
 * Copyright (c) 2021 Juby210
 * Licensed under the Open Software License version 3.0
 */

package com.aliucord.manager.preferences

import com.aliucord.manager.utils.aliucordDir

object Prefs {
    val theme = intPreference("theme")
    val useBlack = boolPreference("use_black")
    val replaceBg = boolPreference("replace_bg", true)
    val devMode = boolPreference("dev_mode", false)
    val debuggable = boolPreference("debuggable")
    val useDexFromStorage = boolPreference("use_dex_from_storage")
    val dexLocation = stringPreference("dex_location", "$aliucordDir/Injector.dex")
}