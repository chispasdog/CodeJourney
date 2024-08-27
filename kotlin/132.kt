package com.example.ut0301

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class segundaactividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val nombre= intent.getStringExtra("nombre")
        findViewById<TextView>(R.id.minombre).text=nombre;
        }


    fun volver(){
        finish()


    }










}