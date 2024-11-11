package com.example.tugaspertemuan11.model

import com.google.gson.annotations.SerializedName

data class Profile(
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val per_page: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_page")
    val total_page: Int,
    @SerializedName("data")
    val data: List<Data>,
)
