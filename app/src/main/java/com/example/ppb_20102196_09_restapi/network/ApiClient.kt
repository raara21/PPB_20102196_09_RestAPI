package com.example.ppb_20102196_09_restapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    const val BASE_URL = "https://apitani.burunghantu.id/"
    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        retrofit.create(ApiService::class.java)
    }
}
