package com.example.meuquartoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("CicloDeVida", "OnCreate - MainActivity - Thaíssa")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val botaoTrocaTela: Button = findViewById(R.id.button)
        botaoTrocaTela.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida","onStart - MainActivity - Thaíssa")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida","onResume - MainActivity - Thaíssa")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida","onPause - MainActivity - Thaíssa")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida","onStop - MainActivity - Thaíssa")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida","onDestroy - MainActivity - Thaíssa")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloDeVida","onRestart - MainActivity - Thaíssa")
    }
}

