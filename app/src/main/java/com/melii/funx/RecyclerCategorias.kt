package com.melii.funx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerCategorias : AppCompatActivity(){


    private lateinit var recyclerView: RecyclerView
    private lateinit var categoriaList: ArrayList<Categorias>
    private lateinit var categoriaAdapter: CategoriaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.categorias)


        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        categoriaList = ArrayList()


        categoriaList.add(Categorias(R.drawable.animales, name = "ANIMALES"))
        categoriaList.add(Categorias(R.drawable.colores, name = "COLORES"))
        categoriaList.add(Categorias(R.drawable.alimentos, name = "ALIMENTOS"))
        categoriaList.add(Categorias(R.drawable.numeros, name = "NUMEROS"))
        categoriaList.add(Categorias(R.drawable.partesdelcuerpo, name = "PARTES DEL CUERPO"))
        categoriaList.add(Categorias(R.drawable.figurasgeometricas, name = "FIGURAS GEOMETRICAS"))

        categoriaAdapter = CategoriaAdapter(categoriaList)
        recyclerView.adapter = categoriaAdapter


        categoriaAdapter.onItemClick = {
            val intent = Intent(this, PreguntasActivity::class.java)
            intent.putExtra("categoria", it)
            startActivity(intent)

        }
    }
}

