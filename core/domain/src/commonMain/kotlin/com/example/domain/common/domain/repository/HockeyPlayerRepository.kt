package com.example.domain.common.domain.repository

import com.example.domain.common.sqldelight.database.HockeyPlayer

interface HockeyPlayerRepository {

    fun insert(hockeyPlayer: HockeyPlayer)

    fun getAllHockeyPlayers(): List<HockeyPlayer>

}