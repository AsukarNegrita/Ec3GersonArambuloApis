package com.gerson.ec3gersonarambuloapis.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gerson.ec3gersonarambuloapis.data.SkinResult
import com.gerson.ec3gersonarambuloapis.data.repository.SkinRepository
import com.gerson.ec3gersonarambuloapis.model.Skin
import com.gerson.ec3gersonarambuloapis.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel:ViewModel() {
    val skin: MutableLiveData<List<Skin>> = MutableLiveData<List<Skin>>()
    val repository= SkinRepository()
    fun getskin(){
    val allSkin= getData()
        skin.value= allSkin
    }
    fun getSkinFromService(){
        viewModelScope.launch(Dispatchers.IO) {
            val response= repository.getSkin()
            when(response){
                is SkinResult.Success->{
                    skin.postValue(response.data.results)
                }
                is SkinResult.Error->{

                }
            }

        }
    }
}