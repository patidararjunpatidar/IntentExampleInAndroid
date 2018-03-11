package com.example.arjunpatidar.intentexampleinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.TextView



class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val result = findViewById<View>(R.id.resultView) as TextView
        val intent = intent
        val addition = intent.getSerializableExtra("SUM") as String
        result.text = addition
    }
}
