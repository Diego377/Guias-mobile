package com.example.guias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menu_item1 -> {
                Log.d("TEST", "PRESS ICON MENU")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}