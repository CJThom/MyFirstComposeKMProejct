package com.example.data.common.di

import app.cash.sqldelight.db.SqlDriver
import com.example.data.common.data.SQLDriverFactory
import com.example.domain.Database
import org.koin.dsl.module

actual fun databaseModule() = module {
    single {
        val SQLDriverFactory = SQLDriverFactory(get())
        val sqlDriver: SqlDriver = SQLDriverFactory.createDriver()

         Database(sqlDriver)
    }
}

