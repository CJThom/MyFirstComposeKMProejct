package com.example.data.common.di

import app.cash.sqldelight.db.SqlDriver
import com.example.data.Database
import com.example.data.common.data.SQLDriverFactory
import org.koin.dsl.module


actual fun databaseModule() = module {
    single {
        val SQLDriverFactory = SQLDriverFactory()
        val sqlDriver: SqlDriver = SQLDriverFactory.createDriver()

        Database(sqlDriver)
    }
}
