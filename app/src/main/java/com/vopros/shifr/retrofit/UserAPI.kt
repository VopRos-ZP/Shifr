package com.vopros.shifr.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface UserAPI {

    @GET("/?=5000")
    suspend fun getAll(@Query("results") limit: Int)

}