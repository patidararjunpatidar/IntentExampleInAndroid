package com.example.arjunpatidar.intentexampleinandroid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

/**
 * Created by arjunpatidar on 11/03/18.
 */
class FirstClassClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<View>(R.id.urlText) as EditText
        val btn = findViewById<View>(R.id.btnNavigate) as Button
        btn.setOnClickListener {
            val url = editText.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}