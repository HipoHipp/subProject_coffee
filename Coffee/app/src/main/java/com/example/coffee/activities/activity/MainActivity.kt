package com.example.coffee.activities.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import com.example.coffee.R
import com.example.coffee.activities.base.BaseActivity
import com.example.coffee.activities.fragment.HistoryFragment
import com.example.coffee.activities.fragment.HomeFragment
import com.example.coffee.activities.fragment.MyRecipeFragment
import com.example.coffee.activities.fragment.SettingFragment
import com.example.coffee.databinding.ActivityMainBinding

private val fragmentHome by lazy { HomeFragment() }
private val fragmentHistory by lazy { HistoryFragment() }
private val fragmentMyRecipe by lazy { MyRecipeFragment() }
private val fragmentSetting by lazy { SettingFragment() }


class MainActivity:BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }

    override fun setUp() {
        binding.bottomNavigation.run {
            setOnNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.home -> {
                        changeFragment(fragmentHome) }
                    R.id.history -> {
                        changeFragment(fragmentHistory) }
                    R.id.myRecipe -> {
                        changeFragment(fragmentMyRecipe) }
                    R.id.setting -> {
                        changeFragment(fragmentSetting) }
                }
                true
            }
            selectedItemId = R.id.home
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment, fragment)
            .commit()
    }
}


