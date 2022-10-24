package com.example.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //obsluga klikniecia
        findViewById<Button>(R.id.przycisk).setOnClickListener {
            findViewById<Button>(R.id.przycisk).text="dziala"
        }
        findViewById<Button>(R.id.cecha).setOnClickListener {
            findViewById<Button>(R.id.cecha).text="inne"
        }

    }
}