package com.example.calculadorapro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var historialOperaciones: TextView
    lateinit var numeroActual: TextView
    var basePotencia: Double? = null
    var valor1: Double? = null
    var operacionActual: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        historialOperaciones = findViewById(R.id.textView1)
        numeroActual = findViewById(R.id.textView2)

        // Inicializar botones numéricos
        val botonesNumericos = listOf(R.id.button1, R.id.button2, R.id.button3, R.id.button5, R.id.button6, R.id.button7, R.id.button9, R.id.button10, R.id.button11, R.id.button15)
        botonesNumericos.forEach { id ->
            findViewById<Button>(id).setOnClickListener { view -> numeroOperacionClick(view) }
        }

        // Inicializar botones de operaciones
        findViewById<Button>(R.id.button4).setOnClickListener { operacionClick("/") }
        findViewById<Button>(R.id.button8).setOnClickListener { operacionClick("*") }
        findViewById<Button>(R.id.button12).setOnClickListener { operacionClick("-") }
        findViewById<Button>(R.id.button17).setOnClickListener { operacionClick("+") }

        // Botón igual
        findViewById<Button>(R.id.button14).setOnClickListener { igualClick() }

        // Eventos de borrar CE y C
        findViewById<Button>(R.id.button20).setOnClickListener { onCclick() }
        findViewById<Button>(R.id.button21).setOnClickListener { onCEclick() }

        // Evento de botones potencia y raíz
        findViewById<Button>(R.id.button18).setOnClickListener { establecerBasePotencia() }
        findViewById<Button>(R.id.button19).setOnClickListener { calcularRaiz() }
    }

    private fun numeroOperacionClick(view: View) {
        val button = view as Button
        val buttonText = button.text.toString()
        if (esNumero(buttonText)) {
            numeroActual.append(buttonText)
        } else {
            historialOperaciones.append("${numeroActual.text} $buttonText")
            numeroActual.text = ""
        }
    }

    private fun operacionClick(operacion: String) {
        valor1 = numeroActual.text.toString().toDoubleOrNull()
        operacionActual = operacion
        historialOperaciones.append("${numeroActual.text} $operacion")
        numeroActual.text = ""
    }

    private fun igualClick() {
        val valor2 = numeroActual.text.toString().toDoubleOrNull()
        if (valor1 != null && valor2 != null) {
            val resultado = when (operacionActual) {
                "+" -> valor1!! + valor2
                "-" -> valor1!! - valor2
                "*" -> valor1!! * valor2
                "/" -> if (valor2 == 0.0) Double.NaN else valor1!! / valor2
                else -> 0.0
            }
            historialOperaciones.append(" = $resultado\n")
            numeroActual.text = resultado.toString()
            operacionActual = null
            valor1 = null
        } else {
            numeroActual.text = "ERROR"
        }
    }

    private fun esNumero(texto: String): Boolean {
        return try {
            texto.toDouble()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    private fun onCEclick() {
        numeroActual.text = ""
    }

    private fun onCclick() {
        numeroActual.text = ""
        historialOperaciones.text = ""
    }

    private fun calcularRaiz() {
        val numero = numeroActual.text.toString().toDoubleOrNull()
        if (numero != null && numero >= 0) {
            val resultado = kotlin.math.sqrt(numero)
            historialOperaciones.append("√$numero = $resultado\n")
            numeroActual.text = resultado.toString()
        } else {
            numeroActual.text = "ERROR"
        }
    }

    private fun establecerBasePotencia() {
        basePotencia = numeroActual.text.toString().toDoubleOrNull()
        if (basePotencia != null) {
            historialOperaciones.append("$basePotencia ^ ")
            numeroActual.text = ""
        } else {
            numeroActual.text = "ERROR"
        }
    }

    private fun calcularPotencia() {
        val exponente = numeroActual.text.toString().toDoubleOrNull()
        if (basePotencia != null && exponente != null) {
            val resultado = basePotencia!!.pow(exponente)
            historialOperaciones.append("$exponente = $resultado\n")
            numeroActual.text = resultado.toString()
            basePotencia = null
        } else {
            numeroActual.text = "ERROR"
        }
    }
}
