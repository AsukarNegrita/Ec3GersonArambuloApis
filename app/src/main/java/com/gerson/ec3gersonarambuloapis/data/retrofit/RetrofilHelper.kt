package com.gerson.ec3gersonarambuloapis.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofilHelper {
    private val retrofitinstance: Retrofit = Retrofit.Builder()
        .baseUrl("https://valorant-api.com/v1")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val skinInstance = retrofitinstance.create(SkinInterface::class.java)

}