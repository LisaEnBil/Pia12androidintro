package com.example.pia12androidintro

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var minSiffra = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       var minText =  findViewById<TextView>(R.id.fancyText)
        minText.text = "Banan"

        var minKnapp = findViewById<Button>(R.id.button)
        minKnapp.setOnClickListener {
            minText.text = "Apelsin"
        }

        var mittNummer =  findViewById<TextView>(R.id.showNumber)



        var adderaSiffra = findViewById<Button>(R.id.addNumberButton)

        adderaSiffra.setOnClickListener {
            minSiffra = minSiffra + 1
            mittNummer.text = minSiffra.toString()
        }

    }
}