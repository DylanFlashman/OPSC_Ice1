package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var helloText: TextView
    private lateinit var italianButton: Button
    private lateinit var spanishButton: Button
    private lateinit var frenchButton: Button
    private lateinit var portugueseButton: Button
    private lateinit var germanButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText = findViewById(R.id.textView)
        italianButton = findViewById(R.id.italianBtn)
        spanishButton = findViewById(R.id.spanishBtn)
        portugueseButton = findViewById(R.id.portugeuseBtn)
        germanButton = findViewById(R.id.germanBtn)
        frenchButton = findViewById(R.id.frenchBtn)

        italianButton.setOnClickListener{
            helloText.text = "Ciao Monde"
        }

        spanishButton.setOnClickListener{
            helloText.text = "Ola Mundo"
        }

        germanButton.setOnClickListener{
            helloText.text = "Hallo Walt"
        }

        portugueseButton.setOnClickListener{
            helloText.text = "Ola Monde"
        }

        frenchButton.setOnClickListener {
            helloText.text = "Bonjour mundo"
        }
    }
}