package com.example.core.data.di

import app.cash.sqldelight.db.SqlDriver
import com.example.core.data.Database
import com.example.core.data.SQLDriverFactory
import org.koin.dsl.module


actual fun databaseModule() = module {
    single {
        val SQLDriverFactory = SQLDriverFactory()
        val sqlDriver: SqlDriver = SQLDriverFactory.createDriver()

        Database(sqlDriver)
    }
}
