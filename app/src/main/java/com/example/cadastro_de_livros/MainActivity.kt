package com.example.cadastro_de_livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTitulo = findViewById<EditText>(R.id.etTitulo)
        val etAutor = findViewById<EditText>(R.id.etAutor)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = etTitulo.text.toString().trim()
            val autor = etAutor.text.toString().trim()

            if (titulo.isEmpty() || autor.isEmpty()) {
                Toast.makeText(this@MainActivity, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this@MainActivity, DetalhesLivroActivity::class.java)
            intent.putExtra("EXTRA_TITULO", titulo)
            intent.putExtra("EXTRA_AUTOR", autor)
            startActivity(intent)
        }
    }
    }
