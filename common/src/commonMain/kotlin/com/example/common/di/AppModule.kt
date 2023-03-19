package com.example.common.di

import com.example.common.platformModule
import com.example.data.common.di.databaseModule
import com.example.data.common.di.repositoryModule
import com.example.data.common.di.useCaseModule

fun commonModule() = listOf(
    databaseModule(),
    repositoryModule,
    viewModelModule(),
    platformModule,
    useCaseModule
)