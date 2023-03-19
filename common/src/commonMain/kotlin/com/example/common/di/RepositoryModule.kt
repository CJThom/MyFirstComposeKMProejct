//package com.example.common.di
//
//import com.example.data.common.data.HockeyPlayerRepositoryImpl
//import com.example.data.common.domain.repository.HockeyPlayerRepository
//import org.koin.core.module.dsl.bind
//import org.koin.core.module.dsl.createdAtStart
//import org.koin.core.module.dsl.singleOf
//import org.koin.dsl.module
//
//
//val repositoryModule = module {
//
//    singleOf(::HockeyPlayerRepositoryImpl) {
//        bind<HockeyPlayerRepository>()
//        createdAtStart()
//    }
//
//}
//
//
//
