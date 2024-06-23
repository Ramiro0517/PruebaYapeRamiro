package com.example.pruebayape.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebayape.domain.model.RecetaResponse
import com.example.pruebayape.repository.RecetaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: RecetaRepository) : ViewModel() {


    private var _recetas = MutableLiveData<List<RecetaResponse>>(emptyList())
    val recetas: LiveData<List<RecetaResponse>> = _recetas

    init {
        getAllRecetas()
    }

    private fun getAllRecetas() {
        viewModelScope.launch {
            repository.getRecetas().let {
                if (it.isSuccessful) {
                    _recetas.postValue(it.body())
                } else {
                    Log.d("HomeViewModel", "Error: ${it.errorBody()}")
                }

            }
        }
    }


}