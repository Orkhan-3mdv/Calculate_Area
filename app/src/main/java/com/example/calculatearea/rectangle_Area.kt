package com.example.calculatearea


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class rectangle_Area : AppCompatActivity() {

    private lateinit var long_edit_main:EditText
    private lateinit var short_edit_main:EditText
    private lateinit var result_main:Button
    private lateinit var result_edit_main:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle_area)

        long_edit_main = findViewById(R.id.long_edit)
        short_edit_main = findViewById(R.id.short_edit)
        result_main = findViewById(R.id.result)
        result_edit_main = findViewById(R.id.result_edit)

        result_main.setOnClickListener{
            calculate()

        }




    }
        fun calculate() {
           val value1 = long_edit_main.text.toString().toInt()
           val value2 = short_edit_main.text.toString().toInt()
           val result = value1*value2
           result_edit_main.setText(Integer.toString(result))


    }




}