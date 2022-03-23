package com.example.gudang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val intentImageView : ImageView = findViewById(R.id.io)
        intentImageView.setOnClickListener { viewio() }
    }

    private fun viewio() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}