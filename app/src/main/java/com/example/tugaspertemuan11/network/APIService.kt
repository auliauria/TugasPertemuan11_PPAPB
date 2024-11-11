package com.example.tugaspertemuan11.network

import com.example.tugaspertemuan11.model.Profile
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("users?page=2")
    fun getAllUsers(): Call<Profile>
}