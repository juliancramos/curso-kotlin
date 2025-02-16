package com.cursoKotlin.androidfirst.ejercicios

//Link al ejercicio en:
//https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#2
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, false)}.")
    println("The movie ticket price for a person aged $adult on monday is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    //No se puede poner when (age) porque no se depende solo de age sino también de isMonday
    return when{
        age in 0..12 -> 15
        age in 13..60 && isMonday ->25
        age in 13..60 ->30
        age in 61..100 -> 20
        else ->-1
    }
}