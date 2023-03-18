package com.example.common

import com.example.common.domain.repository.HockeyPlayerRepository
import com.example.common.domain.usecase.GetAllHockeyPlayerListUseCase
import com.example.common.sqldelight.database.HockeyPlayer
import com.example.common.util.KMViewModel

class MyFirstKMViewModel(
    private val getAllHockeyPlayerListUseCase: GetAllHockeyPlayerListUseCase,
    private val platformThing: Platform
) : KMViewModel() {

    val platform: Platform
        get() = platformThing

    val hockeyPlayerList: List<HockeyPlayer>
        get() = getAllHockeyPlayerListUseCase()

}