package com.example.data.common.data

import com.example.domain.Database
import com.example.domain.common.domain.repository.HockeyPlayerRepository
import com.example.domain.common.sqldelight.database.HockeyPlayer

class HockeyPlayerRepositoryImpl(
    database: Database
) : HockeyPlayerRepository {

    private val queries = database.playerQueries

    override fun insert(hockeyPlayer: HockeyPlayer) {
        queries.insert(
            player_number = hockeyPlayer.player_number,
            full_name = hockeyPlayer.full_name
        )
    }

    override fun getAllHockeyPlayers(): List<HockeyPlayer> {
        return queries.selectAll().executeAsList()
    }

}