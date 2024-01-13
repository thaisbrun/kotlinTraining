package com.example.lib.dao.memory

import com.example.lib.bo.Article
import com.example.lib.dao.ArticleDAO
import java.lang.Long.parseLong
import java.util.Date

class ArticleDaoMemoryImpl : ArticleDAO {
//ArticleDaoMemory implémente l'interface DAO
    companion object {
        private val articlesInMemory: MutableList<Article> = mutableListOf(
            Article(
                1,
                "Souris",
                "Souris sans fil",
                10.0, "",
                Date()
            ),
            Article(2, "Ecran", "Ecran sans fil", 1000.0, "", Date()),
            Article(3, "Clavier", "Clavier sans fil", 25.0, "", Date()),
        )
    }    override fun selectById(id: Long): Article? {

        return articlesInMemory.find { it.id == id };
    }

    override fun addNewOne(article: Article): Long {
        articlesInMemory.add(article)
        article.id = articlesInMemory.size.toLong()
        return article.id
    }
}