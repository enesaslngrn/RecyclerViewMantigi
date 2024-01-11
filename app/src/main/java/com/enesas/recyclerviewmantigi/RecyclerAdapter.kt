package com.enesas.recyclerviewmantigi

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enesas.recyclerviewmantigi.databinding.RecyclerRowBinding

class RecyclerAdapter (val kahramanIsimListesi: ArrayList<String>, val kahramanGorselListesi: ArrayList<Int>): RecyclerView.Adapter<RecyclerAdapter.SuperKahramanViewHolder>() {

    class SuperKahramanViewHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanViewHolder {

        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SuperKahramanViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return kahramanIsimListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanViewHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = kahramanIsimListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi",kahramanIsimListesi.get(position))
            intent.putExtra("superKahramanGorseli",kahramanGorselListesi.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}

