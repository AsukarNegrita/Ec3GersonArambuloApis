package com.gerson.ec3gersonarambuloapis.data.repository

import com.gerson.ec3gersonarambuloapis.data.retrofit.RetrofilHelper
import com.gerson.ec3gersonarambuloapis.model.Skin

class SkinRepository {
    suspend fun getPerson(): List<Skin> {
        val response = RetrofilHelper.skinInstance.getAllSkins()
        return response.results
    }
}