package com.example.calculatearea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class circle_Btn : AppCompatActivity() {

    private lateinit var short_edit_main:EditText
    private lateinit var result_main:Button
    private lateinit var result_edit_main : EditText
    private val p = 3.14


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_btn)

        short_edit_main = findViewById(R.id.short_edit)
        result_main = findViewById(R.id.result)
        result_edit_main = findViewById(R.id.result_edit)

        result_main.setOnClickListener{

            calculate()

        }



    }

    fun calculate ()
    {
        val value1 = short_edit_main.text.toString().toInt()
        val result2 = value1*value1*p
        result_edit_main.setText(Integer.toString(result2.toInt()))

    }

}