package com.example.coffee.activities.popup

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.coffee.R
import com.example.coffee.activities.base.BaseActivity
import com.example.coffee.data.Recipe
import com.example.coffee.databinding.ActivityMainBinding
import com.example.coffee.databinding.PopupMyRecipeBinding

//class MyRecipePopup:BaseActivity<PopupMyRecipeBinding>(PopupMyRecipeBinding::inflate){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun setUp() {
//        var recipe = this.intent.getSerializableExtra("recipe") as Recipe
//
//        binding.txtTitle.text = recipe.title
//        binding.txtContents.text = recipe.contents
//        //사진 추가
//
//        binding.imgMore.setOnClickListener{
//
//        }
//    }
//}

class MyRecipePopup(var context: Context):AppCompatActivity() {
    val dialog = Dialog(context)
    lateinit var binding: ActivityMainBinding

    fun showDialog(recipe: Recipe){
        dialog.setContentView(R.layout.popup_my_recipe)
        dialog.setCancelable(true)

        //레이아웃 배경을 투명하게 해주는 코드
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog.findViewById<TextView>(R.id.txt_title).text = recipe.title
        dialog.findViewById<TextView>(R.id.txt_contents).text = recipe.contents
        dialog.show()
    }
}