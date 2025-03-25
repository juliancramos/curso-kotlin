package com.cursoKotlin.androidfirst.sintaxis

fun main(){
    //List: Inmutable por defecto (no se puede modificar después de creación)
    //MutableList: Se puede modificar (agregar, eliminar o cambiar elementos)
    //val o var solo afecta la referencia, pero no el contenido
    val immutableList = listOf(1, 2, 3) // Lista inmutable
    val mutableList = mutableListOf(1, 2, 3) // Lista mutable

    println("Recien creada (con for): ")
    for (element in mutableList) {
        print("$element ")
    }
    println()
    println("Con forEach:")
    mutableList.forEach { print("$it ") }
    println()

    //Se accede y se modifica igual que un arreglo
    val element = immutableList[0]
    mutableList[0] = 10 // Cambia el primer elemento

    println("Al cambiar el valor: ")
    mutableList.forEach { print("$it ") }
    println()
    //Para agregar elementos (solo en mutable)
    mutableList.add(4)

    //Eliminar
    mutableList.remove(10)

    println("Al añadir y eliminar: ")
    mutableList.forEach { print("$it ") }
    println()

    //Tambien tiene función de transformacion
    //Map:Aplica cambio a cada elemento y devuelve lista de resultados
    val doubledList = immutableList.map { it * 2 }
    println(doubledList) // [2, 4, 6]
    //No necesariamente tiene que haber un cambio
    val list = immutableList.map { it }
    println(list) // [1, 2, 3]

    //Filter: Filtra según condición
    val filteredList = immutableList.filter { it > 1 }
    println(filteredList) // [2, 3]

    //Sorted: Ordena
    val sortedList = listOf(3, 1, 2).sorted()
    println(sortedList) // [1, 2, 3]






}