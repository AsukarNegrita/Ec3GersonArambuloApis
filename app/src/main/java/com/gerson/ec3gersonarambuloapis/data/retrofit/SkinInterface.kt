package com.gerson.ec3gersonarambuloapis.data.retrofit

import com.gerson.ec3gersonarambuloapis.data.response.SkinListResponse
import retrofit2.http.GET

interface SkinInterface {
    @GET("weapons/skins")
    suspend fun getAllSkins(): SkinListResponse
}