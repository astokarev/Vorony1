package com.example.vorony

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counterP1: Int = 0
    private var counterP2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img1: ImageView = findViewById(R.id.starP1)
        val img2: ImageView = findViewById(R.id.starP2)
        val textP1: TextView = findViewById(R.id.voronyP1)
        val textP2: TextView = findViewById(R.id.voronyP2)
        val buttonP1: Button = findViewById(R.id.countP1)
        val buttonP2: Button = findViewById(R.id.countP2)
        buttonP1.setOnClickListener{
            textP1.text = "Я насчитал ${++counterP1} ворон"
            if (counterP1 == 100) img1.visibility = View.VISIBLE;
        }
        buttonP2.setOnClickListener{
            textP2.text = "Я насчитал ${++counterP2} ворон"
            if (counterP2 == 100) img2.visibility = View.VISIBLE;
        }
    }
}