package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = findViewById<EditText>(R.id.first_no)
        var num2 = findViewById<EditText>(R.id.second_no)
        var button1= findViewById<Button>(R.id.add)
        var button2= findViewById<Button>(R.id.sub)
        var button3= findViewById<Button>(R.id.mul)
        var button4= findViewById<Button>(R.id.div)
        var button5= findViewById<Button>(R.id.clear)
        var button6= findViewById<Button>(R.id.sqrt)
        var button7= findViewById<Button>(R.id.power)
        var ans = findViewById<TextView>(R.id.answer)



        button1.setOnClickListener {
            var Intnum1= num1.text.toString().toInt()
            var Intnum2= num2.text.toString().toInt()
            var result= Intnum1+Intnum2
            ans.setText(result.toString())
        }
        button2.setOnClickListener {
            var Intnum1= num1.text.toString().toInt()
            var Intnum2= num2.text.toString().toInt()
            var result= Intnum1 - Intnum2
            ans.setText(result.toString())
        }
        button3.setOnClickListener {
            var Intnum1= num1.text.toString().toInt()
            var Intnum2= num2.text.toString().toInt()
            var result= Intnum1*Intnum2
            ans.setText(result.toString())
        }
        button4.setOnClickListener {
            var Intnum1= num1.text.toString().toFloat()
            var Intnum2= num2.text.toString().toFloat()
            var result= Intnum1/Intnum2
            ans.setText(result.toString())
        }
        button5.setOnClickListener {
            num1.setText("")
            num2.setText("")
            ans.setText("Answer")
        }
        button6.setOnClickListener {
            var Intnum1 = num1.text.toString().toFloat()
            var Intnum2 = num2.text.toString().toFloat()
            var result = sqrt(Intnum1)
            var result1= sqrt(Intnum2)
            ans.setText(result.toString())
        }
        button7.setOnClickListener {
            var Intnum1 = num1.text.toString().toFloat()
            var Intnum2 = num2.text.toString().toFloat()
            var result = Intnum1.pow(Intnum2)
            ans.setText(result.toString())
        }

    }
}