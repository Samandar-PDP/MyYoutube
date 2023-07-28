package com.sdk.domain.use_case

import com.sdk.domain.model.Video
import com.sdk.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

typealias GetVideosBaseUseCase = BaseUseCase<String,Flow<List<Video>>>

class GetVideosUseCase @Inject constructor(
    private val remoteRepository: RemoteRepository
): GetVideosBaseUseCase {
    override suspend fun invoke(parameter: String): Flow<List<Video>> {
        return remoteRepository.getVideos(parameter)
    }
}