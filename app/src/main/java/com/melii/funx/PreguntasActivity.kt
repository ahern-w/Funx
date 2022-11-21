package com.melii.funx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class PreguntasActivity : AppCompatActivity() {

    lateinit var imaglist:ArrayList<QuestionModel>
    private var index : Int = 0
    lateinit var questionModel : QuestionModel

    private var correctAnswerCount : Int = 0
    private var wrongAnswerCount : Int = 0


    lateinit var imageView: ImageView
    lateinit var option1 : Button
    lateinit var option2 : Button
    lateinit var option3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)
        supportActionBar?.hide()

        imageView = findViewById(R.id.imageView2)
        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)

       imaglist = ArrayList()

        imaglist.add ( QuestionModel ( "vaca","Caballo",  "Vaca", "Elefante","Vaca"))
        imaglist.add ( QuestionModel ("perro",  "Perro", "Cebra","Conejo","Perro"))
        imaglist.add ( QuestionModel ("Pinguino","Gallina","Pescado","Pinguino","Pinguino"))
        imaglist.add ( QuestionModel ("conejo","Conejo","Caballo","Elefante","Conejo"))
        imaglist.add ( QuestionModel ("caballo","Caballo","Camello","Perro","Caballo"))



        questionModel = imaglist [index]




        val categorias = intent.getParcelableExtra<Categorias>("categorias")
        if (categorias != null) {
            val textView: TextView = findViewById(R.id.preguntasActivityTv)
            val imageView: ImageView = findViewById(R.id.preguntasActivityTv)

            textView.text = categorias.name
            imageView.setImageResource(categorias.image)
        }
    }



}
























