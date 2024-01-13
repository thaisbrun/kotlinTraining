package com.example.lib.bo

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import com.example.lib.repository.ArticleRepository
//Ici on gère les propriétés, les getters et setters et les constructeurs
open class Article(
    var id : Long,
    var titre : String,
    var description : String,
    var prix : Double,
    var urlImage : String,
    var dateSortie : Date
){
    //Méthode to string
override fun toString() : String{
    return " Informations de l'article : " + id + " " +
            titre + " " + description + " " + prix + " " + urlImage + " " + dateSortie + ". "

}
}
fun main(){
    var date=LocalDate.parse("14-02-2018", DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    println(ArticleRepository.getArticle(1))
    println(ArticleRepository.getArticle(2))

}
