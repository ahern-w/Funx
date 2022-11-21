package com.melii.funx



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val incActbutton = this.findViewById<Button>(R.id.imageButton)
        incActbutton.setOnClickListener {
            val Intent = Intent(this, incActbutton::class.java)
            startActivity(Intent)


        }

        val inc2Actbutton = this.findViewById<Button>(R.id.imageButton2)
        inc2Actbutton.setOnClickListener {
            val Intent = Intent(this, inc2Actbutton::class.java)
            startActivity(Intent)

        }
    }
}

