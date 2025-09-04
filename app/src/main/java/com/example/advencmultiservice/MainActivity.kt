package com.example.advencmultiservice

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.IdQuestion)
        val flashcardAnswer = findViewById<TextView>(R.id.IdReponse)
        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE

        }

        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE

        }

        flashcardAnswer.setOnClickListener {
            flashcardAnswer.visibility=View.INVISIBLE
            flashcardQuestion.visibility=View.VISIBLE

        }
    }
}
