package com.example.jinsilslab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jinsilslab.data.StoreData
import com.example.jinsilslab.databinding.ItemHomeRv02Binding

class StoreAdapter(private var data: List<StoreData>) :
    RecyclerView.Adapter<StoreAdapter.StoreViewHolder>() {

    class StoreViewHolder(private val binding: ItemHomeRv02Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(storeData: StoreData) {
            binding.tvStore.text = storeData.storeTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val binding =
            ItemHomeRv02Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int =
        data.size

}