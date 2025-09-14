package com.example.meuquartoapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        Log.d("CicloDeVida", "OnCreate - MainActivity - Thaíssa")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val botaoVoltar: Button = findViewById(R.id.button2)
        botaoVoltar.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "onStart - MainActivity - Thaíssa")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida", "onResume - MainActivity - Thaíssa")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida", "onPause - MainActivity - Thaíssa")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "onStop - MainActivity - Thaíssa")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "onDestroy - MainActivity - Thaíssa")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloDeVida", "onRestart - MainActivity - Thaíssa")
    }
}