package com.example.data.common.di

fun coreDataModule() = listOf(
    databaseModule(),
    repositoryModule
)