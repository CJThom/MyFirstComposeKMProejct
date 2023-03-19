package com.example.android

import android.app.Application
import com.example.android.di.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MyKMMApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyKMMApp)
            androidLogger()
            modules(coreModule())
        }

    }
}