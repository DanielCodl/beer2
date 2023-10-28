package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val neco = findViewById<TextView>(R.id.tvHlavniLabel)
        val rozmrdat = findViewById<EditText>(R.id.edKamZadatText)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            neco.text=rozmrdat.text.toString()
        }


    }
}