package com.example.ppb_20102196_09_restapi.network

import com.example.ppb_20102196_09_restapi.model.response.ResponseDataMahasiswa
import com.example.ppb_20102196_09_restapi.model.response.ResponseDetailMahasiswa
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("sub/restapi-slim/public/datamahasiswa/")
    fun getDataMahasiswa(): Call<ResponseDataMahasiswa>

    @GET("sub/restapi-slim/public/datamahasiswa/{nim}")
    fun getDetailMahasiswa(@Path("nim") nim: String): Call<ResponseDetailMahasiswa>
}