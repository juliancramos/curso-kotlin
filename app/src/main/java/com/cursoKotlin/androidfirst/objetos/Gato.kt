package com.cursoKotlin.androidfirst.objetos

class Gato (nombre: String, edad: Int, val color: String) : Animal(nombre, edad), Domesticable {

    // Sobrescribe el método
    override fun hacerSonido() {
        println("$nombre dice: Miau")
    }

    fun ronronear() {
        println("$nombre está ronroneando")
    }

    override fun entrenar() {
        println("$nombre está siendo entrenado.")
    }

    override fun bañar() {
        println("$nombre se está bañando")
    }

    //Método toString
    override fun toString(): String {
        return "${super.toString()}, color='$color'"
    }
}