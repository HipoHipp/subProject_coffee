package com.example.coffee.activities.Adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffee.data.Recipe
import com.example.coffee.R

class MyRecipeAdapter(private val context: Context): RecyclerView.Adapter<MyRecipeAdapter.ViewHolder>() {
    var datas = mutableListOf<Recipe>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecipeAdapter.ViewHolder {
        Log.d("data", "여기까지 옴")
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.item_my_recipe, parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        Log.d("data", "여기까지 옴")
        return datas.size
    }

    override fun onBindViewHolder(
        holder: MyRecipeAdapter.ViewHolder, position: Int) {
        Log.d("data", "여기까지 옴")
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        //item_my_recipe 바인딩 요소들
        private val title = itemView.findViewById<TextView>(R.id.txt_title)
        private val contents = itemView.findViewById<TextView>(R.id.txt_contents)
        private val pic = itemView.findViewById<ImageView>(R.id.img_pic)

        fun bind(item: Recipe){
            Log.d("data", "여기까지 옴")
            title.text = item.title
            contents.text = item.contents
            //사진은 비동기로 할 수 있도록 라이브러리 사용 필요
        }
    }
}