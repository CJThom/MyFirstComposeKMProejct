package com.example.common

import com.example.common.util.KMViewModel
import com.example.data.common.domain.usecase.GetAllHockeyPlayerListUseCase
import com.example.data.common.sqldelight.database.HockeyPlayer

class MyFirstKMViewModel(
    private val getAllHockeyPlayerListUseCase: GetAllHockeyPlayerListUseCase,
    private val platformThing: Platform
) : KMViewModel() {

    val platform: Platform
        get() = platformThing

    val hockeyPlayerList: List<HockeyPlayer>
        get() = getAllHockeyPlayerListUseCase()

}