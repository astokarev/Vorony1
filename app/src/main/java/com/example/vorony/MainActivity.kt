package com.example.vorony

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var counterP1: Int = 0
    private var counterP2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout: ConstraintLayout = findViewById(R.id.layout_root)
        val img1: ImageView = findViewById(R.id.starP1)
        val img2: ImageView = findViewById(R.id.starP2)
        val buttonP1: Button = findViewById(R.id.countP1)
        val buttonP2: Button = findViewById(R.id.countP2)
        val buttonRestart: Button = findViewById(R.id.restartBtn)

        buttonP1.setOnClickListener {
            buttonP1.text = "Я насчитал ${++counterP1} ворон"
            if (counterP1 == 100) {
                buttonRestart.visibility = View.VISIBLE
                img1.visibility = View.VISIBLE;
                rootLayout.setBackgroundColor(resources.getColor(R.color.purple_500))
            }
        }

        buttonRestart.setOnClickListener {
            buttonP1.text = "Я насчитал 0 ворон"
            buttonP2.text = "Я насчитал 0 ворон"
            counterP1 = 0
            counterP2 = 0
            img1.visibility = View.INVISIBLE;
            img2.visibility = View.INVISIBLE;
        }
        buttonP2.setOnClickListener {
            buttonP2.text = "Я насчитал ${++counterP2} ворон"
            if (counterP2 == 100) {
                buttonRestart.visibility = View.VISIBLE
                img2.visibility = View.VISIBLE
                rootLayout.setBackgroundColor(resources.getColor(R.color.teal_200))
            }
        };
    }
}