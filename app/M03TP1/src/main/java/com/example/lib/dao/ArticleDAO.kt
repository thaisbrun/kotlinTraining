package com.example.lib.dao

import com.example.lib.bo.Article

interface ArticleDAO {
    fun selectById(id:Long) : Article?
    fun addNewOne(article: Article) : Long
    fun all() : MutableList<Article>
}