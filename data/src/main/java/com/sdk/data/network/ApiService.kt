package com.sdk.data.network

import com.sdk.data.model.VideoResponseDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/videos/search")
    suspend fun getVideos(
        @Query("query") query: String = "popular",
        @Query("per_page") page: Int = 1
    ): Response<VideoResponseDTO>
}