package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var screen:String  = " "
      button.setOnClickListener{
          screen = (screen + button.text)
          textView.text = screen
      }
        button2.setOnClickListener{
            if(screen.length < 15){
            screen = (screen + button2.text)
            textView.text = (screen)}
        }
        button3.setOnClickListener{
            screen = (screen + button3.text)
            textView.text = screen
        }
        button4.setOnClickListener{
            screen = (screen + button4.text)
            textView.text = screen
        }
        button5.setOnClickListener{
            screen = (screen + button5.text)
            textView.text = screen
        }
        button6.setOnClickListener{
            screen = (screen + button6.text)
            textView.text = screen
        }
        button7.setOnClickListener{
            screen = (screen + button7.text)
            textView.text = screen
        }
        button8.setOnClickListener{
            screen = (screen + button8.text)
            textView.text = screen
        }
        button9.setOnClickListener{
            screen = (screen + button9.text)
            textView.text = screen
        }
        button10.setOnClickListener{
            screen = (screen + button10.text)
            textView.text = screen
        }
        button11.setOnClickListener{
            screen = (screen + button11.text)
            textView.text = screen
        }
        button12.setOnClickListener{
            screen = (screen + button12.text)
            textView.text = screen
        }
        button13.setOnClickListener{
            screen = (screen + button13.text)
            textView.text = screen
        }
        button14.setOnClickListener{
            screen = (screen + button14.text)
            textView.text = screen
        }
        button16.setOnClickListener{
            screen = (screen + button16.text)
            textView.text = screen
        }
        button18.setOnClickListener{
            screen = (screen + button18.text)
            textView.text = screen
        }
        button19.setOnClickListener{
            screen = (screen + button19.text)
            textView.text = screen
        }
        button17.setOnClickListener{
            screen = ""
            textView.text = screen
        }
        imageButton.setOnClickListener{
            screen = screen.substring(0,(screen.length-1))
            textView.text = screen

        }



    }
}
