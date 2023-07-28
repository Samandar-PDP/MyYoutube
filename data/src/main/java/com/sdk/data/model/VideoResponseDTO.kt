package com.sdk.data.model

data class VideoResponseDTO(
    val page: Int,
    val per_page: Int,
    val total_results: Int,
    val url: String,
    val videos: List<VideoData>
)