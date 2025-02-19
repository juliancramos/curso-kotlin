package com.cursoKotlin.androidfirst.objetos

//Open quiere decir que pueden heredar de ella
open class Animal (val nombre: String, var edad: Int) {

    //En este caso, open quiere decir que puede sobrescribirse
    open fun hacerSonido() {
        println("$nombre hace un sonido")
    }
    //Al no ser open, no se puede sobrescribir.
        //Esto ocurre porque todas las funciones son final por defecto
    fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad años")
    }

}