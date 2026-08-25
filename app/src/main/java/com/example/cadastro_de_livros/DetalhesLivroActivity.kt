package com.example.cadastro_de_livros

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class DetalhesLivroActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_livro)

        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        val tvAutor = findViewById<TextView>(R.id.tvAutor)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        tvTitulo.text = "Título: ${intent.getStringExtra("EXTRA_TITULO")}"
        tvAutor.text = "Autor: ${intent.getStringExtra("EXTRA_AUTOR")}"

        btnVoltar.setOnClickListener { finish() }
    }
}