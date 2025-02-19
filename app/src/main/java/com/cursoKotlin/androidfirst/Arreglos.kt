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
    numeros[2]=2
    println(numeros[1]) //Imprime 25

    //METODOS UTILES

    //Tam del arreglo
    println("Tamaño del arreglo: ${numeros.size}")

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

    //FUNCIONES DE ORDEN SUPERIOR
    //Map: Transforma cada elemento del arreglo
    val duplicados = numeros.map { it * 2 }
    println(duplicados)


    //Filter: Filtra elementos segun condicion
    val mayoresQueDos = numeros.filter { it > 2 }
    println("Mayores que dos: $mayoresQueDos")

    //Sorted: Ordena
    val ordenados = numeros.sortedArray() // [1, 2, 3, 4]
    println(ordenados.joinToString(", "))


    //Hay arreglos específicos como IntArray o DoubleArray -> Son mas eficientes
    val intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubleArr: DoubleArray = doubleArrayOf(3.14, 2.71, 1.41)

    //CONVERTIR DE ARREGLO A LISTA
    val lista = numeros.toList()
    println("Al convertir a lista:")
    for (elemento in lista) {
        print("$elemento ")
    }
    println()
    //Convertir lista a arreglo
    val arreglo = lista.toTypedArray()
    println("Al convertir a arreglo:")
    for (elemento in arreglo) {
        print("$elemento ")
    }
    println()
}