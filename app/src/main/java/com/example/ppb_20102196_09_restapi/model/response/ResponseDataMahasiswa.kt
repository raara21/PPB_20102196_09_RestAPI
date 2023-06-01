package com.example.ppb_20102196_09_restapi.model.response


import com.example.ppb_20102196_09_restapi.model.request.DataMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa(
    @SerializedName("data")
    val data: List<DataMahasiswa>,
    @SerializedName("status")
    val status: String
)
