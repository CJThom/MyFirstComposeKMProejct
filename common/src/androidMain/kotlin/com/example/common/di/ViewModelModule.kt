package com.example.common.di

import com.example.common.MyFirstKMViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

actual fun viewModelModule() = module {
    viewModel { MyFirstKMViewModel(get(), get()) }
}