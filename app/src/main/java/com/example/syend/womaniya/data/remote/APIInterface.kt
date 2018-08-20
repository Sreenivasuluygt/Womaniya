package com.example.syend.womaniya.data.remote

import com.example.syend.womaniya.data.remote.models.MainModel
import retrofit2.Call
import retrofit2.http.GET


interface APIInterface {
    @GET("/r/aww.json")
    fun getData(): Call<MainModel>
}