package com.example.core.presentation

import com.example.core.domain.model.HockeyPlayer
import com.example.core.domain.usecase.GetAllHockeyPlayerListUseCase
import com.example.core.presentation.util.KMViewModel
import kotlinx.coroutines.flow.Flow

class MyFirstKMViewModel(
    private val getAllHockeyPlayerListUseCase: GetAllHockeyPlayerListUseCase,
    private val platformThing: Platform
) : KMViewModel() {

    val platform: Platform
        get() = platformThing

    val hockeyPlayerListFlow: Flow<List<HockeyPlayer>>
        get() = getAllHockeyPlayerListUseCase()

}