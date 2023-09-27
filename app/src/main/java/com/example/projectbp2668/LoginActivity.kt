package com.example.projectbp2668

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //intent explicit
        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextText3)
        val txtPassword:EditText = findViewById(R.id.editTextText4)

        //event btn Login click
        btnLogin.setOnClickListener {
            //volidate
            if (txtUsername.text.toString().equals("Andin") &&
                txtPassword.text.toString().equals("Amikom")
            ) {
                //cool home activity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            } else {
                Toast.makeText(this, "Username/Passwprd salah!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}