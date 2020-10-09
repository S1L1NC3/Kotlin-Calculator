package com.dmd.kotlincalculator.activities

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dmd.kotlincalculator.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickButton(v: View?) {
        if (responseTextView.length() == 16){
            Toast.makeText(applicationContext,R.string.maybe_enough,Toast.LENGTH_SHORT).show()
        }
        if(v != null){
            val textView = findViewById<Button>(v.id)
            //Toast.makeText(applicationContext,"${textView.text}",Toast.LENGTH_SHORT).show()
            responseTextView.text = "${responseTextView.text}${textView.text}"
            println("${textView.text}")
        }
    }
}