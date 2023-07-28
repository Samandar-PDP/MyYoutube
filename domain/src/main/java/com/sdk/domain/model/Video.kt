package com.sdk.domain.model

data class Video(
    val duration: Int,
    val id: Int,
    val image: String,
    val user: User,
    val url: String
)
data class User(
    val id: Int,
    val name: String,
    val url: String
)
