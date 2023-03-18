package com.example.common

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


//expect fun getPlatformName(): String

////platform Module
val platformModule = module {
    singleOf(::Platform)
}

// KMP Class Definition

expect class Platform() {
    val name: String
}

// Common App Definitions
//fun appModule() = listOf(platformModule)