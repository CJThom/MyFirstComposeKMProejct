package com.example.core.domain.usecase

import com.example.core.domain.model.HockeyPlayer
import com.example.core.domain.repository.HockeyPlayerRepository

class GetAllHockeyPlayerListUseCase(
    private val hockeyPlayerRepository: HockeyPlayerRepository,
) {

    operator fun invoke(): List<HockeyPlayer> {
        return hockeyPlayerRepository.getAllHockeyPlayers()
    }

}