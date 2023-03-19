package com.example.core.domain.repository

import com.example.core.domain.model.HockeyPlayer
import kotlinx.coroutines.flow.Flow

interface HockeyPlayerRepository {

    suspend fun insert(hockeyPlayer: HockeyPlayer)

    suspend fun deleteAll()

    fun getAllHockeyPlayers(): Flow<List<HockeyPlayer>>

}