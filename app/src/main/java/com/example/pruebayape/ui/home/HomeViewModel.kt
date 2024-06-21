package com.example.pruebayape.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pruebayape.domain.model.RecetaInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() :ViewModel() {


    private var _recetas = MutableLiveData<List<RecetaInfo>>(emptyList())
    val recetas : LiveData<List<RecetaInfo>> = _recetas

    init {
        _recetas.value =  listOf(
            RecetaInfo(
                1,
                "Arroz con pollo",
                listOf("Arroz", "Pollo", "Cebolla", "Ajo", "Pimiento", "Cilantro", "Comino", "Sal", "Pimienta", "Aceite"),
                listOf("Cocinar el arroz", "Cocinar el pollo", "Mezclar todo"),
                "https://cdn0.recetasgratis.net/es/posts/3/6/4/arroz_con_chancho_75463_600.webp"
            ),
            RecetaInfo(
                2,
                "Lomo saltado",
                listOf("Lomo", "Cebolla", "Tomate", "Ajo", "Pimiento", "Cilantro", "Comino", "Sal", "Pimienta", "Aceite"),
                listOf("Cocinar el lomo", "Cocinar las verduras", "Mezclar todo"),
                "https://cdn0.recetasgratis.net/es/posts/2/4/6/bunuelos_de_arroz_y_queso_74642_600.webp"
            ),
            RecetaInfo(
                3,
                "Ceviche",
                listOf("Pescado", "Cebolla", "Aji", "Limón", "Cilantro", "Sal", "Pimienta"),
                listOf("Cocinar el pescado", "Cocinar las verduras", "Mezclar todo"),
                "https://www.recetasgratis.net/medio/2017/04/04/arroz-con-pollo-y-verduras-al-estilo-chino-7802_600.jpg"
            ),
            RecetaInfo(
                4,
                "Ceviche",
                listOf("Pescado", "Cebolla", "Aji", "Limón", "Cilantro", "Sal", "Pimienta"),
                listOf("Cocinar el pescado", "Cocinar las verduras", "Mezclar todo"),
                "https://www.recetasgratis.net/medio/2017/04/04/arroz-con-pollo-y-verduras-al-estilo-chino-7802_600.jpg"
            ),
            RecetaInfo(
                5,
                "Ceviche",
                listOf("Pescado", "Cebolla", "Aji", "Limón", "Cilantro", "Sal", "Pimienta"),
                listOf("Cocinar el pescado", "Cocinar las verduras", "Mezclar todo"),
                "https://www.recetasgratis.net/medio/2017/04/04/arroz-con-pollo-y-verduras-al-estilo-chino-7802_600.jpg"
            )

        )
    }


}