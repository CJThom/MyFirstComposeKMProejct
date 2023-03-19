package com.example.core.domain.usecase

import com.example.core.domain.model.HockeyPlayer
import com.example.core.domain.repository.HockeyPlayerRepository
import kotlinx.coroutines.flow.Flow

class GetAllHockeyPlayerListUseCase(
    private val hockeyPlayerRepository: HockeyPlayerRepository,
) {

    operator fun invoke(): Flow<List<HockeyPlayer>> {
        return hockeyPlayerRepository.getAllHockeyPlayers()
    }

}