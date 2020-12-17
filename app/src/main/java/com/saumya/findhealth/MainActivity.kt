package com.saumya.findhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenWebFHT = findViewById<Button>(R.id.btnFHT)
        val btnOpenWebClinic = findViewById<Button>(R.id.btnClinic)
        val btnOpenWebDoctor = findViewById<Button>(R.id.btnDoctor)
        val btnOpenWebPatient = findViewById<Button>(R.id.btnPatient)

        btnOpenWebFHT.setOnClickListener{
            val intent = Intent(this, FindHealthWeb::class.java)
            intent.putExtra("view", "fht")
            startActivity(intent)
        }

        btnOpenWebClinic.setOnClickListener{
            val intent = Intent(this, FindHealthWeb::class.java)
            intent.putExtra("view", "fht_clinic")
            startActivity(intent)
        }

        btnOpenWebDoctor.setOnClickListener {
            val intent = Intent(this, FindHealthWeb::class.java)
            intent.putExtra("view","fht_doctor")
            startActivity(intent)
        }

        btnOpenWebPatient.setOnClickListener {
            val intent = Intent(this, FindHealthWeb::class.java)
            intent.putExtra("view", "fht_patient")
            startActivity(intent)
        }
    }
}