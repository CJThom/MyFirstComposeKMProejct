package com.example.core.presentation

import com.example.core.presentation.util.KMViewModel
import com.example.domain.common.domain.usecase.GetAllHockeyPlayerListUseCase
import com.example.domain.common.sqldelight.database.HockeyPlayer

class MyFirstKMViewModel(
    private val getAllHockeyPlayerListUseCase: GetAllHockeyPlayerListUseCase,
    private val platformThing: Platform
) : KMViewModel() {

    val platform: Platform
        get() = platformThing

    val hockeyPlayerList: List<HockeyPlayer>
        get() = getAllHockeyPlayerListUseCase()

}