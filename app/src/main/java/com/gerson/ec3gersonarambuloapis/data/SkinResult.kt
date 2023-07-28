package com.gerson.ec3gersonarambuloapis.data

import com.gerson.ec3gersonarambuloapis.data.response.SkinListResponse
import java.lang.Exception
import java.lang.reflect.Executable
//DRY
sealed class SkinResult<T>(data:T?=null,error: Exception?=null){
    data class Success<T>(val data: T):SkinResult<T>(data,error = null)
    data class Error<T>(val error: Exception):SkinResult<T>(data = null,error)
}
