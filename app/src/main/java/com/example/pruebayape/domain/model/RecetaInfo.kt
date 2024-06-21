package com.example.pruebayape.domain.model

data class RecetaInfo (
    val id: Int,
    val nombre: String,
    val ingredientes: List<String>,
    val instrucciones: List<String>,
    val imagen: String
)