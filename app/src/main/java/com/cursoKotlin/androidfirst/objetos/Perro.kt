package com.cursoKotlin.androidfirst.objetos

class Perro (nombre: String, edad: Int, val raza: String) : Animal(nombre, edad){

    // Sobrescribe método de animal
    override fun hacerSonido() {
        println("$nombre dice: Guau guau")
    }

    fun moverCola() {
        println("$nombre está moviendo la cola")
    }

}