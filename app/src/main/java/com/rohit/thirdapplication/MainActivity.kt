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

class MainActivity : AppCompatActivity() {
    var name: EditText? = null
    var number: EditText? = null
    var dob: EditText? = null
    var radioButton2: RadioButton? = null
    var radioButton3: RadioButton? = null
    var check: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        number = findViewById(R.id.number)
        dob = findViewById(R.id.dob)
        radioButton2 = findViewById(R.id.radioButton2)
        radioButton3 = findViewById(R.id.radioButton3)
        check = findViewById(R.id.check)
        check?.setOnClickListener {
            val check1 = "${name?.text} ${number?.text} ${dob?.text}"
            var intent =Intent(this, MainActivity2::class.java)
            if (name?.text?.trim().isNullOrBlank()) {
                name?.error = "Enter name"
                Toast.makeText(this, "Data is Empty", Toast.LENGTH_LONG).show()
            } else if (number?.text?.trim().isNullOrBlank()) {
                number?.error = "Enter number"
                Toast.makeText(this, "Fill Data", Toast.LENGTH_LONG).show()
            } else if (dob?.text?.trim().isNullOrBlank()) {
                dob?.error = "Enter Date of Birth"
                Toast.makeText(this, "Fill Data", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Recorded", Toast.LENGTH_LONG).show()
                startActivity(intent)

            }
        }
    }
}