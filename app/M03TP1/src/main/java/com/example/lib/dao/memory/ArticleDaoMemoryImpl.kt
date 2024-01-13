package com.example.lib.dao.memory

import com.example.lib.bo.Article
import com.example.lib.dao.ArticleDAO
import java.lang.Long.parseLong

class ArticleDaoMemoryImpl : ArticleDAO {

    val articlesInMemory : MutableList<Article> = mutableListOf()
    override fun selectById(id: Long): Article {
        for(article in articlesInMemory){
            if(article.id == id)
                return article;
        }
        return articlesInMemory.get(1);
    }

    override fun addNewOne(article: Article): Long {
        articlesInMemory.add(article)
        return parseLong(articlesInMemory.toString())
    }
}