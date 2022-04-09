package com.example.coffee.activities.fragment

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffee.activities.Adapter.MyRecipeAdapter
import com.example.coffee.activities.base.BaseFragment
import com.example.coffee.data.Recipe
import com.example.coffee.databinding.FragmentMyRecipeBinding

class MyRecipeFragment:BaseFragment.BaseFragment<FragmentMyRecipeBinding>(FragmentMyRecipeBinding::inflate) {
    val datas = mutableListOf<Recipe>()
    var myRecipeAdapter: MyRecipeAdapter = MyRecipeAdapter(this.context!!)
    var mLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this.context!!)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding_rc()
    }

    override fun setUp() {
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
        binding.rcRecipe.adapter = myRecipeAdapter

        datas.apply {
            add(Recipe(1, "coffee_example", "커피 예제", ""))
        }


        binding.rcRecipe.setLayoutManager(mLayoutManager);

        myRecipeAdapter.datas = datas
        myRecipeAdapter.notifyDataSetChanged()
    }
}