package com.example.pruebayape.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebayape.R
import com.example.pruebayape.domain.model.RecetaResponse

class HomeAdapter(
    private var recetaList: List<RecetaResponse> = emptyList(),
    private val onItemSelectedListener: (RecetaResponse) -> Unit
) : RecyclerView.Adapter<HomeViewHolder>() {

    private var originalRecetaList: List<RecetaResponse> = recetaList

    fun updateData(newData: List<RecetaResponse>) {
        recetaList = newData
        originalRecetaList = newData
        notifyDataSetChanged()
    }

    fun filter(query: String?) {
        recetaList = if (query.isNullOrBlank()) {
            originalRecetaList
        } else {
            originalRecetaList.filter {
                it.nombre.contains(query, ignoreCase = true) ||
                        it.ingredientes.any { ingrediente ->
                            ingrediente.contains(query, ignoreCase = true)
                        }
            }
        }
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_receta, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.render(recetaList[position], onItemSelectedListener)
    }

    override fun getItemCount() = recetaList.size
}
