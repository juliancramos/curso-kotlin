package com.cursoKotlin.androidfirst

fun main(){
    //Los condicionales funcionan igual a lenguajes como C++, pero con algunas mejoras

    //If clásico
    val a = 10
    val b = 20

    if (a > b) {
        println("a es mayor que b")
    } else {
        println("b es mayor o igual que a")
    }
    //If-else if-else clásico
    val x = 15

    val resultado = if (x < 10) {
        "Menor que 10"
    } else if (x in 10..20) {
        "Entre 10 y 20"
    } else {
        "Mayor que 20"
    }
    println(resultado)

    //SE PUEDE USAR IF COMO EXPRESIÓN
    val max = if (a > b) a else b
    println("El número mayor es: $max")


    //Se puede usar in
    val numero = 5

    if (numero in 1..10) {   // Verifica si está entre 1 y 10
        println("El número está en el rango")
    }

    val lista = listOf(1, 2, 3, 4, 5)
    if (numero in lista) {
        println("El número está en la lista")
    }

}