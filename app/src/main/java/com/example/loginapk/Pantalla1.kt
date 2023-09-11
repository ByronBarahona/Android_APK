package com.example.loginapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loginapk.R.*


class Pantalla1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_pantalla1)

        val btn: Button = findViewById(R.id.btnVolverP1)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}