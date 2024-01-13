package com.example.lib

import java.util.Date

open class Article(
    val id : Long,
    val titre : String,
    val description : String,
    val prix : Double,
    val urlImage : String,
    val dateSortie : Date
)