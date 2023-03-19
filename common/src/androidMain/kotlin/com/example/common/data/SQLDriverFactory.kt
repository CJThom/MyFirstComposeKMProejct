//package com.example.common.data
//
//import android.content.Context
//import app.cash.sqldelight.db.SqlDriver
//import app.cash.sqldelight.driver.android.AndroidSqliteDriver
//import com.example.Database
//
//actual class SQLDriverFactory(private val context: Context) {
//    actual fun createDriver(): SqlDriver {
//        return AndroidSqliteDriver(Database.Schema, context, "database.db")
//    }
//}