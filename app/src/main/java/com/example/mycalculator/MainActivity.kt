package com.example.mycalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import expression
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    @ExperimentalStdlibApi
    val simplify = expression()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var screen: String = " "

        button.setOnClickListener {
           if(screen.length < 15){
            screen = (screen + button.text)
            textView.text = screen
           }
        }
        button2.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button2.text)
                textView.text = (screen)
            }
        }
        button3.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button3.text)
                textView.text = screen
            }
        }
        button4.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button4.text)
                textView.text = screen
            }
        }
        button5.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button5.text)
                textView.text = screen
            }
        }
        button6.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button6.text)
                textView.text = screen
            }
        }
        button7.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button7.text)
                textView.text = screen
            }
        }
        button8.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button8.text)
                textView.text = screen
            }
        }
        button9.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button9.text)
                textView.text = screen
            }
        }
        button10.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button10.text)
                textView.text = screen
            }
        }
        button11.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button11.text)
                textView.text = screen
            }
        }
        button12.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + "*")
                textView.text = screen
            }
        }
        button13.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button13.text)
                textView.text = screen
            }
        }

        button14.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button14.text)
                textView.text = screen
            }
        }
        button16.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button16.text)
                textView.text = screen
            }
        }
        button18.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button18.text)
                textView.text = screen
            }
        }
        button19.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button19.text)
                textView.text = screen
            }
        }
        button17.setOnClickListener {
            screen = ""
            textView.text = screen
        }
        imageButton.setOnClickListener {
            if (screen.length >= 1) {
                screen = screen.substring(0, (screen.length - 1))
                textView.text = screen
            }
        }
        button15.setOnClickListener {
            try {
                val result = expression.eval(screen)
                textView2.text = result.toString()
                screen = ""
                textView.text = ""

            } catch (e: Exception) {
                textView2.text = "error"
                screen = ""
            }

        }
        button20.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button20.text)
                textView.text = screen
            }
        }
        button21.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button21.text)
                textView.text = screen
            }
        }
        button22.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button22.text)
                textView.text = screen
            }
        }
        button23.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button23.text)
                textView.text = screen
            }
        }
        button24.setOnClickListener {
            if (screen.length < 15) {
                screen = (screen + button24.text)
                textView.text = screen
            }
        }


    }
}