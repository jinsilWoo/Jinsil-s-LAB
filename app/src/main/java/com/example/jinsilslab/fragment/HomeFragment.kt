package com.example.jinsilslab.fragment

import android.annotation.SuppressLint
import android.os.Bundle

import android.view.View
import com.example.jinsilslab.adapter.ClothesAdapter
import com.example.jinsilslab.data.ClothesData
import com.example.jinsilslab.R
import com.example.jinsilslab.adapter.ClothesAdapter02
import com.example.jinsilslab.adapter.StoreAdapter
import com.example.jinsilslab.base.BaseFragment
import com.example.jinsilslab.data.StoreData
import com.example.jinsilslab.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private lateinit var clothesAdapter: ClothesAdapter
    private var clothesList = mutableListOf<ClothesData>()

    private lateinit var clothesAdapter02 : ClothesAdapter02

    private lateinit var storeAdapter: StoreAdapter
    private var storeList = mutableListOf<StoreData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initAdapter() {
        //adapter 와 recyclerView 연동
        clothesAdapter = ClothesAdapter()
        binding.rvClothes.adapter = clothesAdapter

        clothesAdapter02 = ClothesAdapter02()
        binding.rvClothes02.adapter = clothesAdapter02

        clothesList.addAll(
            listOf(
                ClothesData("", "스토어1", "스퀘어 블라우스"),
                ClothesData("", "스토어2", "스퀘어 블라우스"),
                ClothesData("", "스토어3", "스퀘어 블라우스"),
                ClothesData("", "스토어4", "스퀘어 블라우스"),
                ClothesData("", "스토어5", "스퀘어 블라우스"),
                ClothesData("", "스토어6", "스퀘어 블라우스"),
                ClothesData("", "스토어7", "스퀘어 블라우스"),
                ClothesData("", "스토어8", "스퀘어 블라우스"),
                ClothesData("", "스토어9", "스퀘어 블라우스"),
                ClothesData("", "스토어10", "스퀘어 블라우스"),
                ClothesData("", "스토어11", "스퀘어 블라우스"),
                ClothesData("", "스토어12", "스퀘어 블라우스"),
                ClothesData("", "스토어13", "스퀘어 블라우스"),
                ClothesData("", "스토어14", "스퀘어 블라우스"),
                ClothesData("", "스토어15", "스퀘어 블라우스")

            )
        )

        storeAdapter = StoreAdapter()
        binding.rvStore.adapter = storeAdapter

        storeList.addAll(
            listOf(StoreData("봄에 잘 어울리는 옷"),
                StoreData("여름에 잘 어울리는 옷"),
                StoreData("가을에 잘 어울리는 옷"),
                StoreData("겨울에 잘 어울리는 옷"),
                StoreData("나랑 잘 어울리는 옷"))
        )


        clothesAdapter.submitList(clothesList)
        clothesAdapter02.submitList(clothesList)

        storeAdapter.submitList(storeList)
    }






}

