package com.cursoKotlin.androidfirst.objetos

fun main() {
    val perro = Perro("Rex", 3, "Labrador")
    perro.mostrarInfo()
    perro.hacerSonido()
    perro.moverCola()

    println()

    val gato = Gato("Michi", 2, "Negro")
    gato.mostrarInfo()
    gato.hacerSonido()
    gato.ronronear()

    println()

    //Tambien se puede crear instancia de animal directamente
        //No se puede hacer si se marca como abstract. ej: abstract class Animal...
    val animal = Animal("Leonardo", 5)
    animal.hacerSonido()
    animal.mostrarInfo()
}