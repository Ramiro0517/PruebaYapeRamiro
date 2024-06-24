package com.example.pruebayape.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pruebayape.domain.model.RecetaResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor() :ViewModel() {


    private val _receta = MutableLiveData<RecetaResponse>()
    val receta: LiveData<RecetaResponse> = _receta

    fun setReceta(receta: RecetaResponse) {
        _receta.value = receta
    }


}