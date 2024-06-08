package com.rohit.thirdapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActvity3 : AppCompatActivity() {
    var name: EditText? = null
    var college: EditText? = null
    var check: Button? = null
    var move: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_actvity3)
        name = findViewById(R.id.name)
        college = findViewById(R.id.college)
        check = findViewById(R.id.check)
        move = findViewById(R.id.move)
        check?.setOnClickListener {
            var intent =Intent(this, SecondActivity::class.java)
            if (name?.text?.trim().isNullOrBlank()) {
                name?.error = "Enter name"
                Toast.makeText(this, "Data is Empty", Toast.LENGTH_LONG).show()
            } else if (college?.text.isNullOrBlank()) {
                college?.error = "Enter college name"
                Toast.makeText(this, "Fill Data", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Recorded", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }
        }
        move?.setOnClickListener {
            var intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

