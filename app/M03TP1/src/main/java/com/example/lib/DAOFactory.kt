package com.example.lib

import com.example.lib.dao.ArticleDAO
import com.example.lib.dao.DaoType
import com.example.lib.dao.memory.ArticleDaoMemoryImpl
import com.example.lib.dao.network.ArticleDaoNetworkImpl
import java.lang.reflect.Type

abstract class DAOFactory {
    companion object {

        fun createArticleDAO(type: DaoType): ArticleDAO? {
            val dao: ArticleDAO?

            when (type) {
                DaoType.MEMORY -> dao = ArticleDaoMemoryImpl()
                DaoType.NETWORK -> dao = ArticleDaoNetworkImpl()
                else -> dao = null
            }

            return dao
        }
    }
}