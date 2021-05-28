  package com.example.pirple_course

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

  class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
    }

      fun pressButton(view:View){
          Log.d("MainActivity", "Button Clicked")
          val toast = Toast.makeText(applicationContext,"Hello World",Toast.LENGTH_SHORT)
          toast.show()



      }
}

