package com.example.calculadora229311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input: String = ""
        var resultado: String =""
        var operacion: String = ""


        val btnSiete: Button = findViewById(R.id.siete)
        val btnOcho: Button = findViewById(R.id.ocho)
        val btnNueve: Button = findViewById(R.id.nueve)
        val btnCuatro: Button = findViewById(R.id.cuatro)
        val btnCinco: Button = findViewById(R.id.cinco)
        val btnSeis: Button = findViewById(R.id.seis)
        val btnUno: Button = findViewById(R.id.uno)
        val btnDos: Button = findViewById(R.id.dos)
        val btnTres: Button = findViewById(R.id.tres)
        val btnCero: Button = findViewById(R.id.cero)

        val btnSuma: Button = findViewById(R.id.suma)
        val btnResta: Button = findViewById(R.id.resta)
        val btnMultiplicacion: Button = findViewById(R.id.multiplicacion)
        val btnDivision: Button = findViewById(R.id.division)

        val btnResult: Button = findViewById(R.id.igual)
        val btnBorrar: Button = findViewById(R.id.borrar)

        val textResultado: TextView = findViewById(R.id.textResultado)
        val textInput: TextView = findViewById(R.id.textInput)

        var num1: Double = 0.0
        var num2: Double = 0.0
        var resultadoNum: Double = 0.0

        btnSiete.setOnClickListener {
            input += "7"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnOcho.setOnClickListener {
            input += "8"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }
        btnNueve.setOnClickListener {
            input += "9"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }
        btnCuatro.setOnClickListener {
            input += "4"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnCinco.setOnClickListener {
            input += "5"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnSeis.setOnClickListener {
            input += "6"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnUno.setOnClickListener {
            input += "1"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnDos.setOnClickListener {
            input += "2"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnTres.setOnClickListener {
            input += "3"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnCero.setOnClickListener {
            input += "0"
            var texto: String = textInput.text.toString()
            textInput.setText(input)
        }

        btnSuma.setOnClickListener {
            operacion = "+"
            var texto: String = textInput.text.toString()
            num1 = texto.toDouble()
            textResultado.setText(texto + operacion)
            textInput.setText("0")
            input = ""
        }

        btnResta.setOnClickListener {
            operacion = "-"
            var texto: String = textInput.text.toString()
            num1 = texto.toDouble()
            textResultado.setText(texto + operacion)
            textInput.setText("0")
            input = ""
        }

        btnMultiplicacion.setOnClickListener {
            operacion = "*"
            var texto: String = textInput.text.toString()
            num1 = texto.toDouble()
            textResultado.setText(texto + operacion)
            textInput.setText("0")
            input = ""
        }

        btnDivision.setOnClickListener {
            operacion = "/"
            var texto: String = textInput.text.toString()
            num1 = texto.toDouble()
            textResultado.setText(texto + operacion)
            textInput.setText("0")
            input = ""
        }

        btnResult.setOnClickListener {
            num2 = textInput.text.toString().toDouble()
            var resultadoDouble: Double = 0.0
            when(operacion){
                "+" -> resultadoDouble = num1 + num2
                "-" -> resultadoDouble = num1 - num2
                "*" -> resultadoDouble = num1 * num2
                "/" -> resultadoDouble = num1 / num2
            }
            resultado = resultadoDouble.toString()
            textResultado.setText(resultado)
        }

        btnBorrar.setOnClickListener {
            input = "0"
            resultado ="0"
            operacion = "0"
            textInput.setText("0")
            textResultado.setText("0")
        }
    }

//    fun botonOperacion(){
//        var texto: String = textInput.text.toString()
//        num1 = texto.toDouble()
//        textResultado.setText(texto + operacion)
//        textInput.setText(0)
//    }

}