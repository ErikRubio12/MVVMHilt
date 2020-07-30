package com.example.mvvmhiltplayground.retrofit

import retrofit2.http.GET

interface BlogApi {
    @GET("blogs")
    suspend fun get(): List<BlogNetworkEntity>
}