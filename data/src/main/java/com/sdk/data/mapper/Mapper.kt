package com.sdk.data.mapper

import com.sdk.data.model.VideoData
import com.sdk.domain.model.User
import com.sdk.domain.model.Video

fun VideoData.toVideo(): Video {
    return Video(
        id = id,
        duration = duration,
        image = image,
        user = User(user.id, user.name, user.url),
        url = url
    )
}
