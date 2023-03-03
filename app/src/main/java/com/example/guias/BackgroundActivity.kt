package com.example.guias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class BackgroundActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_background)
//    }
private val btnWhite: Button
    get() = findViewById(R.id.btnWhite)
    private val btnRed: Button
        get() = findViewById(R.id.btnRed)
    private val layoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)

        btnRed.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.RED)
        }

        btnWhite.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
}