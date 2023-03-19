package com.example.core.domain.di

import com.example.core.domain.usecase.GetAllHockeyPlayerListUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val useCaseModule = module {

    factoryOf(::GetAllHockeyPlayerListUseCase)

}