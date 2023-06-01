package com.example.ppb_20102196_09_restapi.model.response


import com.example.ppb_20102196_09_restapi.model.request.DataDetailMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDetailMahasiswa(
    @SerializedName("data")
    val data: DataDetailMahasiswa,
    @SerializedName("status")
    val status: String
)
