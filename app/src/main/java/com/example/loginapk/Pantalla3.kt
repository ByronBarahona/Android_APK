package com.example.loginapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pantalla3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla3)

        val btn: Button = findViewById(R.id.btnVolverP3)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}