package com.example.tpeni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.lib.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickValider(view: View) {

        //Ici j'utilise les data binding qui récupèrent le contenu des edit text et l'affiche dans un toast

        val titre = findViewById<EditText>(R.id.etTitre).text
        val description = findViewById<EditText>(R.id.etDescription).text
        val sortieInitiale = findViewById<EditText>(R.id.etSortieInitiale).text
        val prix = findViewById<EditText>(R.id.etPrix).text
        Toast.makeText(this, "Vous venez de créer $titre vendu pour un montant de $prix. euros", Toast.LENGTH_SHORT).show()

        //Ici j'appelle la méthode de mon repository pour chercher dans la liste des articles et afficher les infos dans une Snackbar

        val article = ArticleRepository.getArticle(1)
        Snackbar.make(view, "Vous venez de créer ${article?.titre} vendu pour un montant de ${article?.prix} euros", Snackbar.LENGTH_SHORT).show()
    }
}