package com.example.pruebayape.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebayape.R
import com.example.pruebayape.domain.model.RecetaInfo

class HomeAdapter(private var recetaList: List<RecetaInfo> = emptyList()): RecyclerView.Adapter<HomeViewHolder>() {


    fun updateData(newData: List<RecetaInfo>){
        recetaList = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
       return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_receta, parent, false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
       holder.render(recetaList[position])
    }

    override fun getItemCount()= recetaList.size
}
