package com.example.pruebayape.ui.home.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebayape.databinding.ItemRecetaBinding
import com.example.pruebayape.domain.model.RecetaResponse
import com.squareup.picasso.Picasso

class HomeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemRecetaBinding.bind(view)

    fun render(recetaResponse: RecetaResponse, onItemSelectedListener:(RecetaResponse)-> Unit){
        binding.nombreReceta.text = recetaResponse.nombre
        Picasso.get().load(recetaResponse.imagen).into(binding.imagenReceta)
        //Picasso.get().load(recetaInfo.imagen).error(R.drawable.ic_launcher_foreground)// reemplaza esto con tu imagen de error
          //  .into(binding.imagenReceta)
        binding.itemReceta.setOnClickListener {
            onItemSelectedListener(recetaResponse)
        }
    }

}