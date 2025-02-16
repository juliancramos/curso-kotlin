package com.cursoKotlin.androidfirst.ejercicios


//Link al ejercicio en:
//https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#1
fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary (notification: Int){
    when (notification){
        in 0..99 -> println("You have $notification notifications")
        else -> println("Your phone is blowing up! You have 99+ notifications.")
    }
}