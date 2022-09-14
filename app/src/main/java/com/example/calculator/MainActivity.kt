package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Number listeners
        btn00.setOnClickListener{ appendOnClick(true, "00") }
        btn0.setOnClickListener{ appendOnClick(true, "0") }
        btn1.setOnClickListener{ appendOnClick(true, "1") }
        btn2.setOnClickListener{ appendOnClick(true, "2") }
        btn3.setOnClickListener{ appendOnClick(true, "3") }
        btn4.setOnClickListener{ appendOnClick(true, "4") }
        btn5.setOnClickListener{ appendOnClick(true, "5") }
        btn6.setOnClickListener{ appendOnClick(true, "6") }
        btn7.setOnClickListener{ appendOnClick(true, "7") }
        btn8.setOnClickListener{ appendOnClick(true, "8") }
        btn9.setOnClickListener{ appendOnClick(true, "9") }
        btnDot.setOnClickListener{ appendOnClick(true, ".") }

        // Operator listeners
        btnPlus.setOnClickListener{ appendOnClick(false, "+") }
        btnMinus.setOnClickListener{ appendOnClick(false, "-") }
        btnMultiply.setOnClickListener{ appendOnClick(false, "*") }
        btnDivide.setOnClickListener{ appendOnClick(false, "/") }
        btnLeftBrace.setOnClickListener{ appendOnClick(false, "(") }
        btnRightBrace.setOnClickListener{ appendOnClick(false, ")") }

        // Functional listeners
        btnClear.setOnClickListener{ clearOnClick() }
        btnEqual.setOnClickListener{ calculate() }
    }

    private fun calculate() {
        try
        {

        }
        catch(e: Exception)
        {
            Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
        }
    }

    private fun clearOnClick() {
        tvInput.text = null
        tvOutput.text = null
    }

    private fun appendOnClick(clear: Boolean, string: String) {
        if (!clear)
        {
            tvInput.append(tvOutput.text)
        }

        tvOutput.text = null
        tvInput.append(string)
    }
}