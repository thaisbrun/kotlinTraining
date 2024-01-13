package com.example.lib.repository

import com.example.lib.DAOFactory
import com.example.lib.bo.Article
import com.example.lib.dao.ArticleDAO
import com.example.lib.dao.DaoType

object ArticleRepository {
    private val articleDAO: ArticleDAO? = DAOFactory.createArticleDAO(DaoType.MEMORY)
    fun getArticle(id:Long) : Article? {
        return articleDAO?.selectById(id)
    }
    fun addArticle(article: Article) : Long? {
        return articleDAO?.addNewOne(article)
    }
}