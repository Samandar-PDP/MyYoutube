package com.sdk.domain.repository

import com.sdk.domain.model.Video
import kotlinx.coroutines.flow.Flow

interface RemoteRepository {
    suspend fun getVideos(query: String): Flow<List<Video>>
    suspend fun getPopularVideos(): Flow<List<Video>>
}