package com.ST10449152.imadcalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import kotlin.math.*
class MainActivity : AppCompatActivity() {

    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisp : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
            btnAdd.setOnClickListener{ add() }

        val btnSub = findViewById<Button>(R.id.btnSub)
            btnSub.setOnClickListener{ sub() }

        val btnMul = findViewById<Button>(R.id.btnMul)
            btnMul.setOnClickListener{ mul() }

        val btnDiv = findViewById<Button>(R.id.btnDiv)
            btnDiv.setOnClickListener{ div() }

        val btnSqr = findViewById<Button>(R.id.btnSqrt)
            btnSqr.setOnClickListener{ sqrt() }

        val btnPow = findViewById<Button>(R.id.btnPow)
            btnPow.setOnClickListener{ pow() }

        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)


    }
    private fun add(){
        val input1 = etNum1?.text.toString()
        val input2 = etNum2?.text.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers"
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        val intAnswer = 0

        intAnswer = intNum1 + intNum2

        tvDisp?.text = intAnswer.toString()

    }
    private fun sub(){
        val input1 = etNum1?.text.toString()
        val input2 = etNum2?.text.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        val intAnswer = 0

        intAnswer = intNum1 - intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun mul(){
        val input1 = etNum1?.text.toString()
        val input2 = etNum2?.text.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        val intAnswer = 0

        intAnswer = intNum1 * intNum2

        tvDisp?.text = intAnswer.toString()

    }
}
    private fun div(){
        val input1 = etNum1?.text.toString
        val input2 = etNum2?.text.toString

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDisp?.text = "please enter valid numbers"
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var fltAnswer = 0.0

        if (intNum2 ==0){
            tvDisp?.text = "Division by zero is not allowed"
        }else {
            fltAnswer = intNum1 / intNum2
        }

        tvDisp?.text = fltAnswer.toString()
    }
    private fun sqrt(){
        val input1 = etNum1?.text.toString()
        val input2 = etNum2?.text.toString()

        if (input1.isNullorEmpty() || input2.isNullorEmpty()) {
            tvDisp?.text = "Please enter valid number."
            return

            val intNum1 = input1.toInt()
            val intNum2 = input2.toInt()
            val fltAnswer = 0

            fltAnswer = sqrt(intNum1)

            tvDisp?.text = fltAnswer.toString()
        }
    }
    private fun pow(){
        var intNum1 = etNum1?.toString()!!.toInt()
        var intNum2 = etNum2?.toString()!!.toInt()
        var intAnswer : Int = 1

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        val intAnswer = 1

        //Handle empty inputs (optional)

        for (i in 1 ..intNum2!!){
            intAnswer =
        }

        //intAnswer = intNum1.pow(intNum2)

        tvDisp?.text = intAnswer.toString()
    }
}