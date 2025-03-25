package com.cursoKotlin.androidfirst.sintaxis

fun main(){
    val resultado1 = suma(3, 4)
    println("Suma explícita: $resultado1")

    val resultado2 = resta(7, 4)
    println("Resta implícita: $resultado2")

    val resultado3 = restaExp(7, 4)
    println("Resta explícita: $resultado3")

    saludar("Julian")
    despedir("Julian")
    imprimirSuma(5, 6)
}

//Se puede hacer de manera explicita
fun suma(a: Int, b: Int): Int {  // Tipo de retorno explícito (Int)
    return a + b
}
//O con retorno implícito (inferido por Kotlin)
    //Si se hace de esta manera no se puede usar "return"
        //Mayormente para funciones de una sola expresión
fun resta(a: Int, b: Int) = a - b
    //Equivalete explícito (Puede aumentar las lineas sin necesidad):
fun restaExp (a:Int, b:Int): Int{
    return a-b;
}

//Sin retorno (Unit)
fun saludar(nombre: String): Unit {  //Explícito como Unit
    println("Hola, $nombre")
}
// Implicito
fun despedir(nombre: String) {
    println("Adiós, $nombre")
}
//Si no se escribe ningún tipo de retorno se asume que es Unit
fun imprimirSuma(a: Int, b: Int) {
    println("La suma es: ${a + b}")
}

