package com.example.coffee.activities.adapter

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffee.data.Recipe
import com.example.coffee.R
import com.example.coffee.activities.popup.MyRecipePopup

class MyRecipeAdapter(private val context: Context): RecyclerView.Adapter<MyRecipeAdapter.ViewHolder>() {
    var datas = mutableListOf<Recipe>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecipeAdapter.ViewHolder {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.item_my_recipe, parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(
        holder: MyRecipeAdapter.ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        //item_my_recipe 바인딩 요소들
        private val title = itemView.findViewById<TextView>(R.id.txt_title)
        private val contents = itemView.findViewById<TextView>(R.id.txt_contents)
        private val pic = itemView.findViewById<ImageView>(R.id.img_pic)

        fun bind(item: Recipe){
            title.text = item.title
            contents.text = item.contents
            //사진은 비동기로 할 수 있도록 라이브러리 사용 필요

            itemView.setOnClickListener {
                var dialog = MyRecipePopup(context)
                dialog.showDialog(item)

//                var intent = Intent(context, MyRecipePopup::class.java)
//                intent.putExtra("recipe", item)
//                context.startActivity(intent)
            }
        }
    }
}