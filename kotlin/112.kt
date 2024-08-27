package com.example.ut0301

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.net.Uri
import android.provider.MediaStore
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }


    fun actividad2(view: View) {
        val intent= Intent (this,segundaactividad::class.java)
        intent.putExtra("nombre","Pablo Andreu")
        startActivity(intent)

    }

    fun ir_agoogle(view: View) {

        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("https://www.google.com")
        }
        startActivity(intent)

    }

    fun ir_acamara(view: View){
        val camara= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(camara)
    }





}