package com.goonies.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe: Button = findViewById(R.id.my_button)
        val tvChangeText: TextView = findViewById(R.id.text_screen)
        var peopleCounter = 0

        tvChangeText.text = peopleCounter.toString()

        btnClickMe.setOnClickListener {
            peopleCounter += 1
            tvChangeText.text = peopleCounter.toString()

            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }

    }
}

