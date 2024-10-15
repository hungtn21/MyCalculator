package com.example.mycalculator

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textResult: TextView

    var state: Int = 1
    var op: Int = 0
    var op1: Int = 0
    var op2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResult = findViewById(R.id.text_result)

        findViewById<Button>(R.id.btn0).setOnClickListener(this)
        findViewById<Button>(R.id.btn1).setOnClickListener(this)
        findViewById<Button>(R.id.btn2).setOnClickListener(this)
        findViewById<Button>(R.id.btn3).setOnClickListener(this)
        findViewById<Button>(R.id.btn4).setOnClickListener(this)
        findViewById<Button>(R.id.btn5).setOnClickListener(this)
        findViewById<Button>(R.id.btn6).setOnClickListener(this)
        findViewById<Button>(R.id.btn7).setOnClickListener(this)
        findViewById<Button>(R.id.btn8).setOnClickListener(this)
        findViewById<Button>(R.id.btn9).setOnClickListener(this)
        findViewById<Button>(R.id.tru).setOnClickListener(this)
        findViewById<Button>(R.id.chia).setOnClickListener(this)
        findViewById<Button>(R.id.CE).setOnClickListener(this)
        findViewById<Button>(R.id.C).setOnClickListener(this)
        findViewById<Button>(R.id.BS).setOnClickListener(this)
        findViewById<Button>(R.id.cham).setOnClickListener(this)
        findViewById<Button>(R.id.cong).setOnClickListener(this)
        findViewById<Button>(R.id.bang).setOnClickListener(this)
        findViewById<Button>(R.id.nhan).setOnClickListener(this)
        findViewById<Button>(R.id.dau).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var id = p0?.id
        if (id == R.id.btn0) {
            addDigit(0)
        } else if (id == R.id.btn1) {
            addDigit(1)
        } else if (id == R.id.btn2) {
            addDigit(2)
        } else if (id == R.id.btn3) {
            addDigit(3)
        } else if (id == R.id.btn4) {
            addDigit(4)
        } else if (id == R.id.btn5) {
            addDigit(5)
        } else if (id == R.id.btn6) {
            addDigit(6)
        } else if (id == R.id.btn7) {
            addDigit(7)
        } else if (id == R.id.btn8) {
            addDigit(8)
        } else if (id == R.id.btn9) {
            addDigit(9)
        }
        else if (id == R.id.CE)
        {
            state=1
            op1=0
            op2=0
            op=0
            textResult.text="0"
        }
        else if (id == R.id.C)
        {
            if (state==1) op1=0
            else if (state==2) op2=0
            textResult.text="0"
        }
        else if (id == R.id.cong) {
            if (state==2)
            {
                var result = 0
                if (op == 1) {
                    result = op1 + op2
                }
                else if (op == 2)
                {
                    result = op1 - op2
                }
                else if (op == 3)
                {
                    result = op1 * op2
                }
                else if (op == 4)
                {
                    result = op1 / op2
                }
                textResult.text = "$result"
                state = 2
                op1 = result
                op2 = 0
                op=1
            }
            else
            {
                op = 1
                state = 2
            }

        }
        else if (id == R.id.tru) {
            if (state==2)
            {
                var result = 0
                if (op == 1) {
                    result = op1 + op2
                }
                else if (op == 2)
                {
                    result = op1 - op2
                }
                else if (op == 3)
                {
                    result = op1 * op2
                }
                else if (op == 4)
                {
                    result = op1 / op2
                }
                textResult.text = "$result"
                state = 2
                op1 = result
                op2 = 0
                op=2
            }
            else
            {
                op = 2
                state = 2
            }

        }
        else if (id == R.id.nhan) {
            if (state==2)
            {
                var result = 0
                if (op == 1) {
                    result = op1 + op2
                }
                else if (op == 2)
                {
                    result = op1 - op2
                }
                else if (op == 3)
                {
                    result = op1 * op2
                }
                else if (op == 4)
                {
                    result = op1 / op2
                }
                textResult.text = "$result"
                state = 2
                op1 = result
                op2 = 0
                op=3
            }
            else
            {
                op = 3
                state = 2
            }

        }
        else if (id == R.id.chia) {
            if (state==2)
            {
                var result = 0
                if (op == 1) {
                    result = op1 + op2
                }
                else if (op == 2)
                {
                    result = op1 - op2
                }
                else if (op == 3)
                {
                    result = op1 * op2
                }
                else if (op == 4)
                {
                    result = op1 / op2
                }
                textResult.text = "$result"
                state = 2
                op1 = result
                op2 = 0
                op=4
            }
            else
            {
                op = 4
                state = 2
            }

        }
        else if (id == R.id.bang) {
            var result = 0
            if (op == 1) {
                result = op1 + op2
            }
            else if (op == 2)
            {
                result = op1 - op2
            }
            else if (op == 3)
            {
                result = op1 * op2
            }
            else if (op == 4)
            {
                result = op1 / op2
            }
            textResult.text = "$result"
            state = 1
            op1 = 0
            op2 = 0
            op = 0
        }

    }

    fun addDigit(c: Int) {
        if (state == 1) {
            op1 = op1 * 10 + c
            textResult.text = "$op1"
        } else {
            op2 = op2 * 10 + c
            textResult.text = "$op2"
        }
    }
}