package com.example.newcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

 private lateinit var calculatorResult:TextView
 private var operand = 0.0
    private var operation = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatorResult = findViewById(R.id.resultCalc)



    }

    fun result (view : View) {
        if (view is TextView) {
            var result = calculatorResult.text.toString()
            var addNumber = view.text.toString()


            if (result == "0") {
                result = ""
            }

            calculatorResult.text = result + addNumber
        }
    }

        fun clearResult(view: View){

            if (view is TextView) {

                calculatorResult.text = ""

            }
        }

    fun add(view:View){
        if (view is TextView){
            if(!TextUtils.isEmpty(calculatorResult.text)){
                operand = calculatorResult.text.toString().toDouble()
            }
            operation = view.text.toString()
            calculatorResult.text = ""

        }
    }

    fun sum(view:View){
        if (view is TextView){
            val secOperandText = calculatorResult.text.toString()
            var secOperand  = 0.0

            if(!TextUtils.isEmpty(secOperandText)){
                secOperand = secOperandText.toDouble()
            }

            when (operation){
                "+" -> calculatorResult.text = (operand + secOperand).toString()
                "-" -> calculatorResult.text = (operand - secOperand).toString()
                "*" -> calculatorResult.text = (operand * secOperand).toString()
                "/" -> calculatorResult.text = (operand / secOperand).toString()
            }
        }
    }

    fun delete(view :View){
        if (view is TextView){

            calculatorResult.text = ""
            operand = 0.0
            operation = ""


        }
    }




    }













