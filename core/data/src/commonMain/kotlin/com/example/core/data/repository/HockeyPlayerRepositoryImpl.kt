package com.example.core.data.repository

import com.example.core.data.Database
import com.example.core.data.mapper.toDomain
import com.example.core.domain.model.HockeyPlayer
import com.example.core.domain.repository.HockeyPlayerRepository

class HockeyPlayerRepositoryImpl(
    database: Database
) : HockeyPlayerRepository {

    private val queries = database.hockeyPlayerQueries

    override fun insert(hockeyPlayer: HockeyPlayer) {
        queries.insert(
            player_number = hockeyPlayer.playerNumber,
            full_name = hockeyPlayer.fullName
        )
    }

    override fun getAllHockeyPlayers(): List<HockeyPlayer> {
        return queries.selectAll().executeAsList().map { hockeyPlayerEntity ->
            hockeyPlayerEntity.toDomain()
        }
    }

}