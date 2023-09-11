package com.example.loginapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {

    private lateinit var usrEditText: EditText
    private lateinit var pwsEditText: EditText
    private lateinit var ingresarButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usrEditText = findViewById(R.id.usr)
        pwsEditText = findViewById(R.id.pws)
        ingresarButton = findViewById(R.id.btnIngresar)

        val button = findViewById<Button>(R.id.btnSalir)

        ingresarButton.setOnClickListener {
            ingresar()
        }
        button.setOnClickListener{
            finishAffinity()
        }

    }

    private fun ingresar(){

        fun pantallaLogin(){
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        val usuario = usrEditText.text.toString()
        val pass = pwsEditText.text.toString()

        if (usuario == "alumno" && pass == "1234"){
            Toast.makeText(this, "Ingreso Correcto", Toast.LENGTH_SHORT).show()
            pantallaLogin()
            finish()
        }else{
            Toast.makeText(this, "Usuario o Contraseña incorrectas", Toast.LENGTH_SHORT).show()
        }
    }
}