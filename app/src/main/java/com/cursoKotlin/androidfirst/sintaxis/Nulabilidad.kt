package com.cursoKotlin.androidfirst.sintaxis

fun main(){
    //    var name:String = null; //Esto no lo permite hacer ya que se indica que es de tipo String
    //Se hace de la siguiente manera para indicar que podría ser nulo:
    var name:String? = null;

    //println(name.get(3)) //Eso no lo puede hacer porque podría ser un valor nulo
    //Entonces se hace así:
        //Primero mira y dice, si name no es nulo, entonces ...
        //Lego mira y si es nulo se ejecuta la siguiente
    println(name?.get(3) ?:"Es nulo")

    //Si la variable no es nula:
    var word:String? = "hola";
    println(word?.get(3) ?:"Es nulo")
}