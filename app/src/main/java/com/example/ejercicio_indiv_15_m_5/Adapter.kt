package com.example.ejercicio_indiv_15_m_5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejercicio_indiv_15_m_5.databinding.ItemRvBinding

class Adapter (private val datosLista : List<DataRv>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val datos = datosLista[position]
        holder.bind(datos)
    }

    override fun getItemCount(): Int {
       return datosLista.size
    }
    inner class ViewHolder(private val binding: ItemRvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(datos: DataRv) {
            Glide.with(binding.root)
                .load(datos.img)
                .into(binding.imgItem)

            binding.textName.text = datos.name
            binding.textDato.text = datos.dato1
        }
    }
}