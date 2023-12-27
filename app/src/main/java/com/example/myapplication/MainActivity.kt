package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    intarect with button with function
//    this is how we connect the objects

    private lateinit var myButton : Button
    private  lateinit var mytextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.myButton)
        mytextView = findViewById(R.id.myTextView)
        myButton.text = getString(R.string.button_text)
    }
    fun  showMessage(view: View){
        mytextView.visibility = View.VISIBLE

    }
}