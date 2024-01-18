package com.example.tolnwza007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//เครื่องหมายทั้งหมด
        val text: TextView = findViewById(R.id.textView)
        val clear: Button = findViewById(R.id.clear)
        val equal: Button = findViewById(R.id.equal)
        val del: Button = findViewById(R.id.del)
        val mod: Button = findViewById(R.id.mod)
        val plus: Button = findViewById(R.id.plush)
        val multi: Button = findViewById(R.id.multi)
        val min: Button = findViewById(R.id.min)
        val div: Button = findViewById(R.id.div)
        val dot: Button = findViewById(R.id.dot)


        //ตัวเลข

        val zero: Button = findViewById(R.id.zero)
        val num1: Button = findViewById(R.id.num1)
        val num2: Button = findViewById(R.id.num2)
        val num3: Button = findViewById(R.id.num3)
        val num4: Button = findViewById(R.id.num4)
        val num5: Button = findViewById(R.id.num5)
        val num6: Button = findViewById(R.id.num6)
        val num7: Button = findViewById(R.id.num7)
        val num8: Button = findViewById(R.id.num8)
        val num9: Button = findViewById(R.id.num9)


        var currentNumber = "0"
        var number1 =""
        var number2 =""
        var otext = ""
        var doot:Boolean= false


        clear.setOnClickListener {
            currentNumber = "0"
            text.setText("0")
            doot = false
        }
        dot.setOnClickListener {
            if(doot == false)
                currentNumber += "."
            text.setText(currentNumber)
            doot = true

        }

        zero.setOnClickListener {
            //currentNumber = Tans.text.toString()
            if (currentNumber == "0") {
                currentNumber = "0"
                text.setText("0")
            } else {
                currentNumber += "0"
                text.text = currentNumber
            }
        }
        del.setOnClickListener {
            if(currentNumber.length >1){
                currentNumber=currentNumber.substring(0,currentNumber.length-1)
                text.setText(currentNumber)

            }else{
                text.setText("0")
                currentNumber = ""
            }
        }

        plus.setOnClickListener {
            otext = "+"
            number1 = currentNumber
            currentNumber = ""
            text.text = "0"
            doot = false
        }

        min.setOnClickListener {
            otext = "-"
            number1 = currentNumber
            currentNumber = ""
            text.text = "0"
            doot = false
        }

        multi.setOnClickListener {
            otext = "*"
            number1 = currentNumber
            currentNumber = ""
            text.text = "0"
            doot = false
        }

        div.setOnClickListener {
            otext = "/"
            number1 = currentNumber
            currentNumber = ""
            text.text = "0"
            doot = false
        }

        mod.setOnClickListener {
            otext = "%"
            number1 = currentNumber
            currentNumber = ""
            text.text = "0"
            doot = false
        }

        equal.setOnClickListener {
            number2 = currentNumber
            var result = 0.0
            try {
                when (otext) {

                    "+" -> result = number1.toDouble() + number2.toDouble()
                    "-" -> result = number1.toDouble() - number2.toDouble()
                    "*" -> result = number1.toDouble() * number2.toDouble()
                    "/" -> {
                        if (number2.toDouble() == 0.0) {
                            text.text = "Error: Division by zero"
                        } else {
                            result = number1.toDouble() / number2.toDouble()
                        }
                    }
                    "%" -> result = number1.toDouble() % number2.toDouble()
                }

                text.text = result.toString() // Display the result
            } catch (e: NumberFormatException) {
                text.text = "Error: Invalid input"
            }

            number1 = result.toString()
            currentNumber = result.toString()

        }

        num1.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "1"
                text.setText("1")
            } else {
                currentNumber += "1"
                text.text = currentNumber
            }
        }
        num2.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "2"
                text.setText("2")
            } else {
                currentNumber += "2"
                text.text = currentNumber
            }
        }
        num3.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "3"
                text.setText("3")
            } else {
                currentNumber += "3"
                text.text = currentNumber
            }
        }
        num4.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "4"
                text.setText("4")
            } else {
                currentNumber += "4"
                text.text = currentNumber
            }
        }
        num5.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "5"
                text.setText("5")
            } else {
                currentNumber += "5"
                text.text = currentNumber
            }
        }
        num6.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "6"
                text.setText("6")
            } else {
                currentNumber += "6"
                text.text = currentNumber
            }
        }
        num7.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "7"
                text.setText("7")
            } else {
                currentNumber += "7"
                text.text = currentNumber
            }
        }
        num8.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "8"
                text.setText("8")
            } else {
                currentNumber += "8"
                text.text = currentNumber
            }
        }
        num9.setOnClickListener {
            if(currentNumber == "0") {
                currentNumber = "9"
                text.setText("9")
            } else {
                currentNumber += "9"
                text.text = currentNumber
            }


        }

     }
}

