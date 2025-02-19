package com.cursoKotlin.androidfirst.objetos

class Perro (nombre: String, edad: Int, val raza: String) : Animal(nombre, edad), Domesticable, Mascota{

    // Sobrescribe método de animal
    override fun hacerSonido() {
        println("$nombre dice: Guau guau")
    }

    fun moverCola() {
        println("$nombre está moviendo la cola")
    }

    //Métodos de las interfaces
    override fun entrenar() {
        println("$nombre está siendo entrenado.")
    }

    override fun jugar() {
        println("$nombre está jugando.")
    }

    override fun toString(): String {
        return "Perro(nombre='$nombre', edad=$edad, raza='$raza')"
    }


}