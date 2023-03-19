package com.example.core.domain.repository

import com.example.core.domain.model.HockeyPlayer

interface HockeyPlayerRepository {

    fun insert(hockeyPlayer: HockeyPlayer)

    fun getAllHockeyPlayers(): List<HockeyPlayer>

}