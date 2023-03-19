package com.example.core.data.di

import com.example.core.data.repository.HockeyPlayerRepositoryImpl
import com.example.core.domain.repository.HockeyPlayerRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.createdAtStart
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {

    singleOf(::HockeyPlayerRepositoryImpl) {
        bind<HockeyPlayerRepository>()
        createdAtStart()
    }

}



