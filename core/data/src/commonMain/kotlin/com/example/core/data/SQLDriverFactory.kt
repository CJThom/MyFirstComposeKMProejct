package com.example.core.data

import app.cash.sqldelight.db.SqlDriver

expect class SQLDriverFactory {
    fun createDriver(): SqlDriver
}