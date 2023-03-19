package com.example.domain.common.di

import com.example.domain.common.domain.usecase.GetAllHockeyPlayerListUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val useCaseModule = module {

    factoryOf(::GetAllHockeyPlayerListUseCase)

}