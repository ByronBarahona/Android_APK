package com.example.loginapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        val btn: Button = findViewById(R.id.btnVolverP2)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, pantallaPrincipal::class.java)
            startActivity(intent)
        }
    }
}