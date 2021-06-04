package com.example.giphyapp.retrofit

import com.example.giphyapp.models.Json4Kotlin_Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetContent {
    @GET("v1/gifs/search")
    fun getContent(
        @Query("limit") limit: Int = 25,
        @Query("api_key") api_key: String = "5PqUpVUIFD2OwKoADDXgL4rTC4i7lgJh"
    ): Call<Json4Kotlin_Base>
}