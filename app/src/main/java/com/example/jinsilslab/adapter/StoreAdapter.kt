package com.example.jinsilslab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jinsilslab.data.StoreData
import com.example.jinsilslab.databinding.ItemHomeRv02Binding
import com.example.jinsilslab.util.DiffUtil

class StoreAdapter() :
    ListAdapter<StoreData,StoreAdapter.StoreViewHolder>(DiffUtil<StoreData>()) {

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
        holder.onBind(getItem(position))
    }

}