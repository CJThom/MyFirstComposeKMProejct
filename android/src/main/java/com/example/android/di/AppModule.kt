package com.example.android.di

import com.example.core.data.di.coreDataModule
import com.example.core.domain.di.coreDomainModule
import com.example.core.presentation.di.corePresentationModule
import org.koin.core.module.Module

fun coreModule(): List<Module> = listOf(
    coreDataModule(),
    coreDomainModule(),
    corePresentationModule()
).flatten()