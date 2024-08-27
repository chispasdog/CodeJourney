package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesyconstantes()
        tiposdedatos()
    }
    /*

    vamos a hablar de variables

    */
    private fun variablesyconstantes(){
        //parte de variables
        var myVarible = "hello world"
        println(myVarible)
        myVarible= " vienvenidos "
        println(myVarible)

        var segundavariabe = "dale"
        println(segundavariabe)
        segundavariabe = myVarible
        println(segundavariabe)

        //no se puede cambier es la primera constante
        val miprimeraconstante = "te agustado el tuto?"
        println(miprimeraconstante)
        val segundaconstante =  myVarible


    }

    private  fun tiposdedatos(){
        //string
        val myString: String = "Hola Hackermen!"
        val myString2 = "Bienvenidos a MoureDev"
        val myString3: String = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //bokenao
        val mibolena: Boolean =true
        val bolenao = false







    }
}