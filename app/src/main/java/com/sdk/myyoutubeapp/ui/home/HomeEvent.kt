package com.sdk.myyoutubeapp.ui.home

sealed interface HomeEvent {
    data class OnSearch(val query: String): HomeEvent
}