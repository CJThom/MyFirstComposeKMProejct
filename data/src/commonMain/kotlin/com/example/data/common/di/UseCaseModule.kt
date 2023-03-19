package com.example.data.common.di

import com.example.data.common.domain.usecase.GetAllHockeyPlayerListUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val useCaseModule = module {

    factoryOf(::GetAllHockeyPlayerListUseCase)

}