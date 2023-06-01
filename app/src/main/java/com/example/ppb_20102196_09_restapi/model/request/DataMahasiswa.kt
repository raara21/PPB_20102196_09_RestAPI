package com.example.ppb_20102196_09_restapi.model.request


import com.google.gson.annotations.SerializedName

data class DataMahasiswa(
    @SerializedName("NIM")
    val nIM: String,
    @SerializedName("Nama")
    val nama: String,
    @SerializedName("Telepon")
    val telepon: String
)
