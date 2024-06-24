package com.example.pruebayape.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class RecetaResponse (
    val id: Int,
    val nombre: String,
    val ingredientes: List<String>,
    val instrucciones: List<String>,
    val imagen: String
) :Parcelable