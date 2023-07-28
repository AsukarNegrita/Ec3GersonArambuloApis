package com.gerson.ec3gersonarambuloapis.data.repository

import com.gerson.ec3gersonarambuloapis.data.SkinResult
import com.gerson.ec3gersonarambuloapis.data.response.SkinListResponse
import com.gerson.ec3gersonarambuloapis.data.retrofit.RetrofilHelper
import com.gerson.ec3gersonarambuloapis.model.Skin

class SkinRepository {
    suspend fun getSkin():SkinResult<SkinListResponse> {
        return try {
            val response = RetrofilHelper.skinInstance.getAllSkins()
            SkinResult.Success(response)
        } catch (e: Exception) {
            SkinResult.Error(e)
        }


    }
}