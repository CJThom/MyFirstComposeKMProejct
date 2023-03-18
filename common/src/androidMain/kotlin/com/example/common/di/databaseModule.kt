package com.example.common.di

import app.cash.sqldelight.db.SqlDriver
import com.example.Database
import com.example.common.data.SQLDriverFactory
import org.koin.dsl.module


//actual val databaseModule = module {
//    single {
//
//    }
//}

actual fun databaseModule() = module {
    single {
        val SQLDriverFactory = SQLDriverFactory(get())
        val sqlDriver: SqlDriver = SQLDriverFactory.createDriver()

         Database(sqlDriver)
    }
}

