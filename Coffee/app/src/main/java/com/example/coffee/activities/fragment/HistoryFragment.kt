package com.example.coffee.activities.fragment

import android.os.Bundle
import com.example.coffee.activities.base.BaseFragment
import com.example.coffee.databinding.FragmentHistoryBinding

class HistoryFragment: BaseFragment.BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setUp() {
        binding.txtAverage.text = "180mg\n10% increased than last week"
        binding.txtMax.text = "280mg\n30% increased than last week"
    }
}