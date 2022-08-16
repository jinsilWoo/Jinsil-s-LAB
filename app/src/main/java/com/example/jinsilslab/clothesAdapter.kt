package com.example.jinsilslab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jinsilslab.databinding.ItemHomeRv01Binding


class ClothesAdapter : RecyclerView.Adapter<ClothesAdapter.ClothesViewHolder>() {
    private val clothesList = mutableListOf<clothesData>()

    class ClothesViewHolder(
        private val binding: ItemHomeRv01Binding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(clothesData: clothesData) {
            binding.tvClothesItemTitle.text = clothesData.clothes_store
            binding.tvClothesItemContents.text = clothesData.clothes_contents
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {
        val binding =
            ItemHomeRv01Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClothesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        holder.bind(clothesList[position])
    }

    override fun getItemCount(): Int {
        clothesList.size
    }
}