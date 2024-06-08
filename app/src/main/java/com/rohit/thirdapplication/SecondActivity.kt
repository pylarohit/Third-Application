package com.rohit.thirdapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    var check1 :Button? =null
    var tvName : TextView?= null
    var name = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        check1 = findViewById(R.id.check1)
       var intent =Intent(this, MainActivity::class.java)
        check1?.setOnClickListener {
            Toast.makeText(this,"Going Back",Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        intent?.extras?.let {
            name = it.getString("name")?:""
           // var dob = it.getInt("dob")
            println("name ${name}")

        }
        tvName = findViewById(R.id.name)
        tvName?.setText(name)
    }
}