package com.cursoKotlin.androidfirst.objetos

class Gato (nombre: String, edad: Int, val color: String) : Animal(nombre, edad) {

    // Sobrescribe el método
    override fun hacerSonido() {
        println("$nombre dice: Miau")
    }

    fun ronronear() {
        println("$nombre está ronroneando")
    }
}