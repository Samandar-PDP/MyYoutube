package com.sdk.myyoutubeapp.ui.home

import com.sdk.domain.model.Video

data class HomeState(
    val isLoading: Boolean =false,
    val error: String = "",
    val success: List<Video> = emptyList()
)