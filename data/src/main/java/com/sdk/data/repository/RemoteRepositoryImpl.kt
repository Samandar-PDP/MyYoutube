package com.sdk.data.repository

import android.util.Log
import com.sdk.data.mapper.toVideo
import com.sdk.data.network.ApiService
import com.sdk.domain.model.Video
import com.sdk.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteRepository {
    override suspend fun getPopularVideos(): Flow<List<Video>> = flow {
        val response = apiService.getPopularVideos()
        response.body()?.let {
            println("@@@imp${response.body()?.videos?.size}")
            emit(response.body()?.videos?.map { it.toVideo() } ?: emptyList())
        }
    }

    override suspend fun getVideos(query: String): Flow<List<Video>> = flow {

    }
}