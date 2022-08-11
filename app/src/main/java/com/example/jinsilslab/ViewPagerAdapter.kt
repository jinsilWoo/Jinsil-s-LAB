package com.example.jinsilslab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    val fragments = mutableListOf<Fragment>()

    //어댑터에서 만들 Fragment 수를 반환
    override fun getItemCount(): Int = fragments.size
    //각 페이지에서 보여줄 Fragment 를 설정
    override fun createFragment(position: Int): Fragment = fragments[position]



//    companion object {
//        private const val NUM_FRAGMENT = 4
//    }


}