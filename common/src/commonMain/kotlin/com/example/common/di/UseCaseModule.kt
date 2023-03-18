package com.example.common.di

import com.example.common.domain.usecase.GetAllHockeyPlayerListUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val useCaseModule = module {

    factoryOf(::GetAllHockeyPlayerListUseCase)

}