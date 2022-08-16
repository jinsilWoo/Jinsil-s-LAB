package com.example.jinsilslab.fragment

import android.os.Bundle

import android.view.View
import com.example.jinsilslab.ClothesAdapter
import com.example.jinsilslab.ClothesData
import com.example.jinsilslab.R
import com.example.jinsilslab.base.BaseFragment
import com.example.jinsilslab.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private lateinit var clothesAdapter: ClothesAdapter
    private var clothesList = mutableListOf<ClothesData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        //adapter 와 recyclerView 연동
        clothesAdapter = ClothesAdapter(clothesList)
        binding.rvClothes.adapter = clothesAdapter

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
    }

}

