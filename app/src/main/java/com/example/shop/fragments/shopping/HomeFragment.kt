package com.example.shop.fragments.shopping

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shop.R
import com.example.shop.fragments.categories.HatsFragment
import com.example.shop.fragments.categories.JacketsFragment
import com.example.shop.fragments.categories.MainCategoryFragment
import com.example.shop.fragments.categories.ShirtsFragment
import com.example.shop.fragments.categories.PantsFragment
import com.example.shop.fragments.categories.SneakersFragment
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf(
            MainCategoryFragment(),
            ShirtsFragment(),
            JacketsFragment(),
            PantsFragment(),
            SneakersFragment(),
            HatsFragment()
        )

        binding.viewpagerHome.isUserInputEnabled = false

        val viewPager2Adapter =
            HomeViewpagerAdapter(categoriesFragments, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome) { tab, position ->
            when (position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "T-Shirts"
                2 -> tab.text = "Jackets"
                3 -> tab.text = "Pants"
                4 -> tab.text = "Sneakers"
                5 -> tab.text = "Hats"
            }
        }.attach()
    }
}