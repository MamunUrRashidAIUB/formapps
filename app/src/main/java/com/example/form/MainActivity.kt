package com.example.form

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // reference all the ui elements
        val nameText=findViewById<EditText>(R.id.editTextText)
        val idText=findViewById<EditText>(R.id.editTextText2)
        val cgpaText=findViewById<EditText>(R.id.editTextText3)
        val departmentSpinners=findViewById<Spinner>(R.id.spinner)
        val submitButton=findViewById<Button>(R.id.button)
        val resultText=findViewById<TextView>(R.id.resultText)
    }
}