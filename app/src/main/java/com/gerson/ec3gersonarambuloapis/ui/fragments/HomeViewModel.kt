package com.gerson.ec3gersonarambuloapis.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gerson.ec3gersonarambuloapis.data.repository.SkinRepository
import com.gerson.ec3gersonarambuloapis.model.Skin
import com.gerson.ec3gersonarambuloapis.model.getData

class HomeViewModel:ViewModel() {
    val skin: MutableLiveData<List<Skin>> = MutableLiveData<List<Skin>>()
    val repository= SkinRepository()
    fun getskin(){
    val allSkin= getData()
        skin.value= allSkin
    }
}