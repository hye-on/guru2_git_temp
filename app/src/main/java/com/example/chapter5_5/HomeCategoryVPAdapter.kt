package com.example.chapter5_5

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeCategoryVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BirthdayFragment()  // 생일 카테고리
            1 -> CoupleFragment()  // 연인 카테고리
            2 -> ParentsFragment()  // 부모님 카테고리
            3 -> LightGiftFragment()  // 가벼운 선물 카테고리
            else -> LuxuryFragment()  // 럭셔리 카테고리
        }
    }
}