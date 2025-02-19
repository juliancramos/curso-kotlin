package com.cursoKotlin.androidfirst.objetos

fun main() {
    val perro = Perro("Rex", 3, "Labrador")
    perro.mostrarInfo()
    perro.hacerSonido()
    perro.moverCola()
    //Métodos de interfaces
    perro.entrenar()
    perro.jugar()
    //Forma por defecto desde la interfaz
    perro.bañar()
    //toString (directamente con los atributos de perro)
    println(perro)

    println()

    val gato = Gato("Michi", 2, "Negro")
    gato.mostrarInfo()
    gato.hacerSonido()
    gato.ronronear()
    //Metodo de la interfaz sobrescrito
    gato.bañar()
    //toString (con super para llamar al toString de animal)
    println(gato)

    println()

    //Tambien se puede crear instancia de animal directamente
        //No se puede hacer si se marca como abstract. ej: abstract class Animal...
    val animal = Animal("Leonardo", 5)
    animal.hacerSonido()
    animal.mostrarInfo()
    //toString
    println(animal)
}