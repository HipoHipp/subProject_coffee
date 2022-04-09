package com.example.coffee.activities.fragment

import android.os.Bundle
import android.widget.Toast
import com.example.coffee.activities.base.BaseFragment
import com.example.coffee.databinding.FragmentSettingsBinding

class SettingFragment:BaseFragment.BaseFragment<FragmentSettingsBinding>(FragmentSettingsBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setUp() {
        binding.txtCreatePeople.setOnClickListener {
            Toast.makeText(activity, "name : 노희원 / git : HipoHIpp\nname : 정영재 / git : Jungyoungjae", Toast.LENGTH_LONG).show()
        }
    }
}