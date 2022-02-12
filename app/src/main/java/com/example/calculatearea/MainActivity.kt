package com.example.calculatearea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var rectangle_btn:Button
    private lateinit var circle_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rectangle_btn = findViewById(R.id.rectangle_btn)
        circle_btn = findViewById(R.id.circle_btn)

        rectangle_btn.setOnClickListener{

            val new_Page = Intent(this,rectangle_Area ::class.java)
            startActivity(new_Page)


        circle_btn.setOnClickListener{

            val new_Page2 = Intent(this,circle_Btn ::class.java)
            startActivity(new_Page2)
        }

        }
    }


}