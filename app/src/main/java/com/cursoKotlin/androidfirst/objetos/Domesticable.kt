package com.cursoKotlin.androidfirst.objetos

interface Domesticable {
    fun entrenar()
    //Puede tener implementación por defecto en la interfaz, pero se puede sobrescribir en las clases
    fun bañar(){
        println("La mascota se está bañando")
    }
}