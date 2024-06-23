package com.example.pruebayape.repository

import com.example.pruebayape.api.ApiService
import javax.inject.Inject

class RecetaRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getRecetas() = apiService.getRecetas()

}