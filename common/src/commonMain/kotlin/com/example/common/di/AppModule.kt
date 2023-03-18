package com.example.common.di

import com.example.common.platformModule

fun commonModule() = listOf(
    databaseModule(),
    repositoryModule,
    viewModelModule(),
    platformModule,
    useCaseModule
)