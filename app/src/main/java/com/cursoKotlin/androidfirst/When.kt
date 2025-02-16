package com.cursoKotlin.androidfirst

fun main(){
    //When funciona como combinación de switch y if-else -> Switch mejorado
    //Sintaxis basica
    val x = 3

    when (x) {
        1 -> println("x es 1")
        2 -> println("x es 2")
        3 -> println("x es 3")
        else -> println("x no es 1, 2 o 3")
    }
    //Se pueden combinar valores en un solo caso usando ,
    val y = 2

    when (y) {
        1, 2, 3 -> println("y es 1, 2 o 3")
        4 -> println("y es 4")
        else -> println("y es otro número")
    }

    //Sirve para rangos y colecciones con in
    val z = 5

    when (z) {
        in 1..5 -> println("z está entre 1 y 5")
        in 6..10 -> println("z está entre 6 y 10")
        //En este caso, aunque tambien es verdadera, no se ejecuta ya que solo toma el primer true
        !in 10..20 -> println("z no está entre 10 y 20")
        else -> println("z es algo más")
    }
    //Si se quiere que se tome también la segunda debería ser algo como esto:
    println("Para que tome más de uno: ")
    when {
        z in 1..5 -> {
            println("z está entre 1 y 5")
            if (z !in 10..20) println("z no está entre 10 y 20")
        }
        else -> println("z es algo más")
    }

    //Se puede usar para condiciones personalizadas:
    val num = 10

    when {
        num % 2 == 0 -> println("Es par")
        num % 2 != 0 -> println("Es impar")
        else -> println("No sé qué es")
    }
    //También se podría:
    when (num % 2) {
        0 -> println("Es par")
        1 -> println("Es impar")
        else -> println("No sé qué es")
    }


    //Se le puede asignar el resultado a una variable
    val resultado = when (x) {
        1 -> "Uno"
        2 -> "Dos"
        3 -> "Tres"
        else -> "Desconocido"
    }

    println("El resultado es: $resultado")

    //Se puede usar sin evaluar una expresion inicial -> Sin ()
    val a = 10
    val b = 20

    when {
        a > b -> println("a es mayor que b")
        a < b -> println("a es menor que b")
        else -> println("a es igual a b")
    }
}