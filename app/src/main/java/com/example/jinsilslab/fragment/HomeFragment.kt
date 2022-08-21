package com.example.jinsilslab.fragment

import android.annotation.SuppressLint
import android.os.Bundle

import android.view.View
import com.example.jinsilslab.adapter.ClothesAdapter
import com.example.jinsilslab.data.ClothesData
import com.example.jinsilslab.R
import com.example.jinsilslab.adapter.ClothesAdapter02
import com.example.jinsilslab.base.BaseFragment
import com.example.jinsilslab.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private lateinit var clothesAdapter: ClothesAdapter
    private var clothesList = mutableListOf<ClothesData>()

    private lateinit var clothesAdapter02 : ClothesAdapter02

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initAdapter() {
        //adapter 와 recyclerView 연동
        clothesAdapter = ClothesAdapter(clothesList)
        binding.rvClothes.adapter = clothesAdapter

        clothesAdapter02 = ClothesAdapter02(clothesList)
        binding.rvClothes02.adapter = clothesAdapter02

        clothesList.addAll(
            listOf(
                ClothesData("", "핫핑", "스퀘어 블라우스"),
                ClothesData("", "키키러브", "스퀘어 블라우스"),
                ClothesData("", "이지브라운", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스"),
                ClothesData("", "핫핑", "스퀘어 블라우스"),
                ClothesData("", "이지브라운", "스퀘어 블라우스"),
                ClothesData("", "이지브라운", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스"),
                ClothesData("", "이지브라운", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스"),
                ClothesData("", "이지브라운", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스"),
                ClothesData("", "메이드제이", "스퀘어 블라우스")

            )
        )

        clothesAdapter.notifyDataSetChanged()
        clothesAdapter02.notifyDataSetChanged()
    }




}

