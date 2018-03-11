package com.example.arjunpatidar.intentexampleinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText



class AndroidExplicitIntentswithExamples : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_explicit_intentswith_examples)
        val firstNum = findViewById<View>(R.id.firstNum) as EditText
        val secNum = findViewById<View>(R.id.secondNum) as EditText
        val btnAdd = findViewById<View>(R.id.addBtn) as Button
        btnAdd.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val num1 = Integer.parseInt(firstNum.text.toString())
                val num2 = Integer.parseInt(secNum.text.toString())
                val intent = Intent(this@AndroidExplicitIntentswithExamples, Result::class.java)
                intent.putExtra("SUM", num1.toString() + " + " + num2 + " = " + (num1 + num2))
                startActivity(intent)
            }
        })
    }

}
