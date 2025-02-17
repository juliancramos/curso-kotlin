package com.cursoKotlin.androidfirst.ejercicios

//Link al ejercicio en:
//https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#3

fun main(){
    val celsius = 27.0
    val kelvin = 350.0
    val fahrenheit = 10.0

    //println("$celsius degrees Celsius is ${celsiusToFahrenheit(celsius)} degrees Fahrenheit")
    //println("$kelvin degrees Kelvin is ${kelvinToCelsius(kelvin)} degrees Celsius")
    //println("$fahrenheit degrees Fahrenheit is ${fahrenheitToKelvin(fahrenheit)} degrees Kelvin")

    //Usando la otra funcion:
    printFinalTemperature(celsius, "Celsius", "Fahrenheit", ::celsiusToFahrenheit)
    printFinalTemperature(kelvin, "Kelvin", "Celsius", ::kelvinToCelsius)
    printFinalTemperature(fahrenheit, "Fahrenheit", "Kelvin", ::fahrenheitToKelvin)
}

fun printFinalTemperature(initialMeasurement: Double, initialUnit: String, finalUnit: String,
    conversionFormula: (Double) -> Double) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) //Dos decimales
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun celsiusToFahrenheit(celsius:Double):Double{
    return (9.0/5.0) * (celsius) +32
}
fun kelvinToCelsius(kelvin:Double) = kelvin - 273.15

fun fahrenheitToKelvin (fahrenheit:Double) : Double{
    return (5.0/9.0) * (fahrenheit - 32) +273.15
}