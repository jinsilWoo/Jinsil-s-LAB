package com.example.jinsilslab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jinsilslab.data.ClothesData
import com.example.jinsilslab.databinding.ItemHomeRv01Binding
import com.example.jinsilslab.util.DiffUtil


//RecyclerView.Adapter()를 상속받음, <> 안에 adapter 가 전달할 ViewHolder 클래스 작성
// 생성자로 데이터 넘겨줌
class ClothesAdapter() :
    ListAdapter<ClothesData,ClothesAdapter.ClothesViewHolder>(DiffUtil<ClothesData>()) {


    //view 와 data 연결
    class ClothesViewHolder(
        private val binding: ItemHomeRv01Binding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(clothesData: ClothesData) {
            binding.tvClothesItemTitle.text = clothesData.clothes_store
            binding.tvClothesItemContents.text = clothesData.clothes_contents
        }
    }

    //만들어진 뷰홀더가 없을 때 여분 뷰 홀더를 만드는 함수
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {
        val binding =
            ItemHomeRv01Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClothesViewHolder(binding)
    }

    //데이터를 넣어주기
    override fun onBindViewHolder(viewholder: ClothesViewHolder, position: Int) {
        viewholder.bind(getItem(position))
    }

}