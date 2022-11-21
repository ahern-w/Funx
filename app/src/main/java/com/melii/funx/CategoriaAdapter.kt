package com.melii.funx

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoriaAdapter (private val categoriaList:ArrayList<Categorias>)
    : RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder>() {

    var onItemClick : ((Categorias) -> Unit)? = null

    class CategoriaViewHolder(itemView:View): RecyclerView.ViewHolder (itemView) {


        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent ,false)
        return  CategoriaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriaViewHolder, position: Int) {
        val categorias = categoriaList[position]
        holder.imageView.setImageResource(categorias.image)
        holder.textView.text = categorias.name

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(categorias)

        }
    }

    override fun getItemCount(): Int {
        return categoriaList.size
    }
}