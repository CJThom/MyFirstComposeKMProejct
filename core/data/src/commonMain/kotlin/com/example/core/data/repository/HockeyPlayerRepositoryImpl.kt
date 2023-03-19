package com.example.core.data.repository

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.example.core.data.Database
import com.example.core.data.mapper.toDomain
import com.example.core.domain.model.HockeyPlayer
import com.example.core.domain.repository.HockeyPlayerRepository
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.mapLatest

@OptIn(ExperimentalCoroutinesApi::class)
class HockeyPlayerRepositoryImpl(
    database: Database
) : HockeyPlayerRepository {

    private val queries = database.hockeyPlayerQueries

    init {
        GlobalScope.launch(Dispatchers.IO) {
            deleteAll()
            repeat(10) {
                insert(HockeyPlayer(it.toLong(), "Player"))
                delay(2000)
            }
        }

    }

    override suspend fun insert(hockeyPlayer: HockeyPlayer) {
        withContext(Dispatchers.IO) {
            queries.insert(
                player_number = hockeyPlayer.playerNumber,
                full_name = hockeyPlayer.fullName
            )
        }
    }

    override suspend fun deleteAll() {
        withContext(Dispatchers.IO) {
            queries.deleteAll()
        }
    }

    override fun getAllHockeyPlayers(): Flow<List<HockeyPlayer>> {
        return queries.selectAll().asFlow().mapToList(Dispatchers.IO).mapLatest { hockeyPlayerEntityList ->
            hockeyPlayerEntityList.map { hockeyPlayerEntity ->
                hockeyPlayerEntity.toDomain()
            }
        }
    }

}