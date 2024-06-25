package com.example.pruebayape.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coordenadas(
    val latitud: Double,
    val longitud: Double,
) : Parcelable