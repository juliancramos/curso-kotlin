package com.cursoKotlin.androidfirst

fun main(){
    //No hay necesidad de hacer el tipo de variable explícito
    val numero1 =42
    val numero: Int = 42
    println("Numero no explicito:  $numero1" )
    println("Numero explicito:  $numero" )

    val texto: String = "Hola mundo"
    val decimal: Double = 3.14
    val caracter: Char = 'K'
    val esValido: Boolean = true
    println(texto)
    println(decimal)
    println(caracter)
    println(esValido)

    //Insertar variables en cadenas:
    val nombre = "Julian"
    val saludo = "Hola, $nombre"
    println(saludo)
    //Tambien se puede con expresiones complejas:
    val edad = 25
    val mensaje = "En 5 años tendrás ${edad + 5} años"
    println(mensaje)

    //Hay que realizar conversión explícita entre tipos de variables:
    val num: Int = 10
    val numLong: Long = num.toLong()  // Conversión explícita
    println(numLong)
    /*Tambien hay:
    toInt(): Convierte a Int.
    toLong(): Convierte a Long.
    toDouble(): Convierte a Double.
    toFloat(): Convierte a Float.
    toShort(): Convierte a Short.
    toByte(): Convierte a Byte.
     */

    //Para texto con multiples lineas se puede poner comilla triple (""")
    val textoLargo = """
        Kotlin es genial.
        Se pueden poner varias lineas.
    """
    println(textoLargo)
    println("Fin de las variables")

}