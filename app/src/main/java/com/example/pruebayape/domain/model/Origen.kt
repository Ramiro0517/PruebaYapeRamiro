package com.example.pruebayape.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Origen(
    val latitud: Double,
    val longitud: Double,
) : Parcelable