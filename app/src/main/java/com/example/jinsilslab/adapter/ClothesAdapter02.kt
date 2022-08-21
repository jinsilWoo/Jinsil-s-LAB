package com.example.jinsilslab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jinsilslab.data.ClothesData
import com.example.jinsilslab.databinding.ItemHomeRv01Binding

class ClothesAdapter02(private var data: List<ClothesData>) :
    RecyclerView.Adapter<ClothesAdapter02.ClothesViewHolder02>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClothesViewHolder02 {
        val binding =
            ItemHomeRv01Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClothesViewHolder02(binding)
    }

    override fun onBindViewHolder(holder: ClothesViewHolder02, position: Int) =
        holder.onBind(data[position])


    override fun getItemCount(): Int = data.size


    class ClothesViewHolder02(
        private val binding: ItemHomeRv01Binding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(clothesData: ClothesData) {
            binding.tvClothesItemTitle.text = clothesData.clothes_store
            binding.tvClothesItemContents.text = clothesData.clothes_contents

        }
    }


}