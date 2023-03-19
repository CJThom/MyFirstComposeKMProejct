//package com.example.common.domain.usecase
//
//import com.example.data.common.domain.repository.HockeyPlayerRepository
//import com.example.common.sqldelight.database.HockeyPlayer
//
//class GetAllHockeyPlayerListUseCase(
//    private val hockeyPlayerRepository: HockeyPlayerRepository,
//) {
//
//    operator fun invoke(): List<HockeyPlayer> {
//        return hockeyPlayerRepository.getAllHockeyPlayers()
//    }
//
//}