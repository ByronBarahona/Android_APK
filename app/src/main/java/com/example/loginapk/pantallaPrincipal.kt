package com.example.loginapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantallaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        val btn: Button = findViewById(R.id.btnPag1)
        btn.setOnClickListener{
            val intent: Intent = Intent(this,Pantalla1::class.java)
            startActivity(intent)
        }
        val btn2: Button = findViewById(R.id.btnPag2)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this,Pantalla2::class.java)
            startActivity(intent)
        }
        val btn3: Button = findViewById(R.id.btnPag3)
        btn3.setOnClickListener{
            val intent: Intent = Intent(this,Pantalla3::class.java)
            startActivity(intent)
        }
        val btn4: Button = findViewById(R.id.btnPag4)
        btn4.setOnClickListener{
            val intent: Intent = Intent(this,Pantalla4::class.java)
            startActivity(intent)
        }

        val btn5: Button = findViewById(R.id.btnSalirPrincipal)
        btn5.setOnClickListener{
            val intent: Intent = Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}