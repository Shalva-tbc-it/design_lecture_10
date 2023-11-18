package com.example.design.data_model

import java.util.UUID

data class Profile(
    val id: UUID = UUID.randomUUID(),
    val icon: Int,
    val title: String,
    val language: String? = null,
    val arrow: Int? = null,
    var isRed: Boolean = false
)
