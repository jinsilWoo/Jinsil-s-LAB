package com.example.jinsilslab.activity

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.jinsilslab.R
import com.example.jinsilslab.ViewPagerAdapter
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


    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }
}