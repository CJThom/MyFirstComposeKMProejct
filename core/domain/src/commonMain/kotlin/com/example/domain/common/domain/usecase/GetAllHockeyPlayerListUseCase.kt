package com.example.domain.common.domain.usecase

import com.example.domain.common.domain.repository.HockeyPlayerRepository
import com.example.domain.common.sqldelight.database.HockeyPlayer

class GetAllHockeyPlayerListUseCase(
    private val hockeyPlayerRepository: HockeyPlayerRepository,
) {

    operator fun invoke(): List<HockeyPlayer> {
        return hockeyPlayerRepository.getAllHockeyPlayers()
    }

}