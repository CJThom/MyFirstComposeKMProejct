package com.example.common.di

//import org.koin.ksp.generated.*
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class Helper : KoinComponent {
    fun initKoin() {
        startKoin {
            modules(commonModule())
        }.koin

    }
}


//@Module
//@ComponentScan("com.example.common")
//class CommonModule