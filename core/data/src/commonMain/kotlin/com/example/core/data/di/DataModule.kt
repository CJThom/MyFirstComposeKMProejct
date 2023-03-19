package com.example.core.data.di

fun coreDataModule() = listOf(
    databaseModule(),
    repositoryModule
)