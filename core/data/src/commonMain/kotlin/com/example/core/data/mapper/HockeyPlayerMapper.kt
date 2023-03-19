package com.example.core.data.mapper

import com.example.core.data.sqldelight.database.HockeyPlayerEntity
import com.example.core.domain.model.HockeyPlayer

fun HockeyPlayerEntity.toDomain(): HockeyPlayer {
    return HockeyPlayer(
        playerNumber = this.player_number,
        fullName = this.full_name
    )
}

fun HockeyPlayer.toEntity(): HockeyPlayerEntity {
    return HockeyPlayerEntity(
        player_number = this.playerNumber,
        full_name = this.fullName
    )
}