package com.example.data.common.data

import app.cash.sqldelight.db.SqlDriver

expect class SQLDriverFactory {
    fun createDriver(): SqlDriver
}