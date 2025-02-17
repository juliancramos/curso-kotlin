package com.cursoKotlin.androidfirst

fun main(){
    //Se usa arrayOf
        //Val: No puede cambiar referencia pero si el contenido del arreglo
        //Var: Puede cambiar tanto la referencia como el contenido
    val num = arrayOf(1, 2, 3, 4, 5) // Arreglo de enteros
    val nombres = arrayOf("Julia", "Carlos", "Ana") // Arreglo de Strings

    // Arreglo de 5 elementos inicializados en 0
    val arregloConValoresPredeterminados = Array(5) {0}

    //Acceso
    val numeros = arrayOf(10, 20, 30, 40)
    println(numeros[1]) // Imprime 20

    numeros[1] = 25
    println(numeros[1]) //Imprime 25

    //METODOS UTILES
    //Verifica si tiene elemento
    println(30 in numeros) // true (porque 30 está en numeros)
    println(numeros.contains(50)) // false

    //Recorrer arreglo
    print("Arreglo impreso: ")
    for (elemento in numeros) {
        print("$elemento ")
    }
    println()
    //tambien se puede recorrer con indices
    for (i in numeros.indices) {
        println("Elemento en la posición $i: ${numeros[i]}")
    }


}