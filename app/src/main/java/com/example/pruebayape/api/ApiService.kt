package com.example.pruebayape.api

import com.example.pruebayape.domain.model.RecetaResponse
import com.example.pruebayape.helper.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getRecetas(): Response<List<RecetaResponse>>
}