package com.example.core.presentation.di

import com.example.core.presentation.platformModule

fun corePresentationModule() = listOf(
    viewModelModule(),
    platformModule,
)