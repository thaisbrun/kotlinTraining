package com.example.TP302

import java.math.BigInteger
import java.util.Scanner

fun main(){
    //calculRiz()
    moyenneNotes()
}

fun calculRiz() {
    var riz : BigInteger
    riz = "1".toBigInteger()
    var multiplicateur : BigInteger
    multiplicateur = "2".toBigInteger()
    var i=0
    while(i<=63){
        riz = riz*multiplicateur
        i++
        println("Au tour n° $i le résultat est de $riz")
    }
}

fun moyenneNotes(){
    val s1 = Scanner(System.`in`)
    print("Entrez un nombre de valeurs : ")
    val n = s1.nextLine().toInt()
    var sum = 0.0
    var i = 0
    do {
        println("Valeur :")
        var value = readln()
        sum += value.toDouble()
        i++
    } while (i < n)

    println("La moyenne est de " + sum / n.toInt())
}