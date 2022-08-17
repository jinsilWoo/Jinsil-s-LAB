package com.example.jinsilslab.activity

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.jinsilslab.R
import com.example.jinsilslab.adapter.ViewPagerAdapter
import com.example.jinsilslab.base.BaseActivity
import com.example.jinsilslab.databinding.ActivityMainBinding
import com.example.jinsilslab.fragment.HomeFragment
import com.example.jinsilslab.fragment.LikeFragment
import com.example.jinsilslab.fragment.ProfileFragment
import com.example.jinsilslab.fragment.StoreFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()
        initBottomNavigation()
    }

    private lateinit var viewPager: ViewPager2


    private fun initAdapter() {
        val fragmentList =
            listOf(HomeFragment(), StoreFragment(), LikeFragment(), ProfileFragment())

        val viewPagerAdapter = ViewPagerAdapter(this)
        viewPagerAdapter.fragments.addAll(fragmentList)

        viewPager = binding.vpMain
        viewPager.adapter = viewPagerAdapter
    }

    private fun initBottomNavigation() {
        // 슬라이드 해서 페이지가 변경되면 각각 맞는 페이지로 바텀네비게이션 아이콘 활성화
        binding.vpMain.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {

                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.bnMain.menu.getItem(position).isChecked = true
                }
            }
        )

        //바텀네비게이션 선택 시 뷰페이저의 currentItem 값도 같이 변경
        binding.bnMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    binding.vpMain.currentItem = 0
                    return@setOnItemSelectedListener true
                }
                R.id.menu_store -> {
                    binding.vpMain.currentItem = 1
                    return@setOnItemSelectedListener true
                }
                R.id.menu_like -> {
                    binding.vpMain.currentItem = 2
                    return@setOnItemSelectedListener true
                }
                else -> {
                    binding.vpMain.currentItem = 3
                    return@setOnItemSelectedListener true
                }

            }
        }

    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }
}