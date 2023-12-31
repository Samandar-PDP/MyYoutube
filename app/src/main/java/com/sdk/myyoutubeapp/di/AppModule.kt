package com.sdk.myyoutubeapp.di

import com.sdk.data.manager.NetworkInterceptor
import com.sdk.data.network.ApiService
import com.sdk.data.repository.RemoteRepositoryImpl
import com.sdk.domain.repository.RemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApiService(okHttpClient: OkHttpClient): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://api.pexels.com")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(ApiService::class.java)
    }
    @[Provides Singleton]
    fun provideOkhttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .connectTimeout(30,TimeUnit.SECONDS)
            .writeTimeout(30,TimeUnit.SECONDS)
            .readTimeout(30,TimeUnit.SECONDS)
            .addInterceptor(NetworkInterceptor())
            .build()
    }

    @[Provides Singleton]
    fun provideRemoteRepository(apiService: ApiService): RemoteRepository {
        return RemoteRepositoryImpl(apiService)
    }
}