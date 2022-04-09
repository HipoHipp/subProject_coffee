package com.example.coffee.activities.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.coffee.activities.base.BaseFragment
import com.example.coffee.databinding.FragmentHomeBinding
import java.util.logging.Logger

class HomeFragment : BaseFragment.BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setUp() {
        binding.txtPercent.text = "25"
        Logger.getLogger("HomeFragment")
    }
}