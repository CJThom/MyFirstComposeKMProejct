package com.example.core.presentation.di

import com.example.core.presentation.MyFirstKMViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

actual fun viewModelModule() = module {
    viewModel { MyFirstKMViewModel(get(), get()) }
}