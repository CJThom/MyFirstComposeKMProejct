package com.example.common.di


import com.example.common.MyFirstKMViewModel
import org.koin.dsl.module

actual fun viewModelModule() = module {
    factory { MyFirstKMViewModel(get(), get()) }
}

//class Helper {
//    fun initKoin() {
//        // start Koin
//        val koinApp = startKoin {
//            modules(CommonModule().module)
//        }.koin
//
//        // load default users
//        //  koinApp.get<UserRepository>().addUsers(DefaultData.DEFAULT_USERS)
//    }
//}
