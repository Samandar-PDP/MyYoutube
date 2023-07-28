package com.sdk.data.manager

import okhttp3.Interceptor
import okhttp3.Response

class NetworkInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        request.addHeader("Authorization", "563492ad6f91700001000001dc912faa4865445694b8ccc566067984")
        return chain.proceed(request.build())
    }
}