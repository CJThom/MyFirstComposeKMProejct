package com.example.data.common.di

fun dataModule() = listOf(
    databaseModule(),
    repositoryModule
)