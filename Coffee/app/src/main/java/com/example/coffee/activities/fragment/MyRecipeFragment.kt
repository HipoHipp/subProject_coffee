package com.example.coffee.activities.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffee.activities.adapter.MyRecipeAdapter
import com.example.coffee.activities.base.BaseFragment
import com.example.coffee.data.Recipe
import com.example.coffee.databinding.FragmentMyRecipeBinding

class MyRecipeFragment:BaseFragment.BaseFragment<FragmentMyRecipeBinding>(FragmentMyRecipeBinding::inflate) {
    val datas = mutableListOf<Recipe>()
    lateinit var myRecipeAdapter: MyRecipeAdapter
    lateinit var mLayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        myRecipeAdapter = MyRecipeAdapter(this.context!!)
        mLayoutManager  = LinearLayoutManager(this.context!!)
    }

    override fun setUp() {
        binding_rc()
        //데이터 목록화

        //버튼 연결
        binding.txtFavorite.setOnClickListener {
            binding_rc()
        }

        binding.txtTodayCoffee.setOnClickListener {
            binding_rc()
        }
    }

    fun binding_rc(){
        binding.rcMyRecipe.setLayoutManager(mLayoutManager);
        binding.rcMyRecipe.adapter = myRecipeAdapter

        datas.apply {
            add(Recipe(1, "coffee_example", "커피 예제", ""))
        }

        myRecipeAdapter.datas = datas
        myRecipeAdapter.notifyDataSetChanged()
    }
}