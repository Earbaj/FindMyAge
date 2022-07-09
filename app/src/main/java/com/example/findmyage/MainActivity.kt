package com.example.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    //variable declare
    lateinit var getAge : EditText
    lateinit var showAge : TextView
    var age : Int = 0
    var year : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //bind with view
        getAge = findViewById(R.id.et_age_text)
        showAge = findViewById(R.id.txt_show_age)
        var button_find = findViewById<Button>(R.id.btn_get)
        button_find.setOnClickListener {
            // Calculate Age
            year = Calendar.getInstance().get(Calendar.YEAR)
            val getInputAge: Int  = Integer.parseInt(getAge.text.toString())
            age = year - getInputAge
            showAge.setText("Your age is: $age")

        }
    }
}