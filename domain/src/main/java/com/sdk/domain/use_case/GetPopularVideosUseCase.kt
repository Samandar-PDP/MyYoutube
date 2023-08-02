package com.sdk.domain.use_case

import com.sdk.domain.model.Video
import com.sdk.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import javax.inject.Inject

typealias GetPopularVideosBaseUseCase = BaseUseCase<Unit,Flow<List<Video>>>

class GetPopularVideosUseCase @Inject constructor(
    private val repository: RemoteRepository
): GetPopularVideosBaseUseCase {
    override suspend fun invoke(parameter: Unit): Flow<List<Video>> {
        val vid = repository.getPopularVideos()
        println("@@@use${vid.first().size}")
        return vid
    }
}