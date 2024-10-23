package com.mbougar

/*
10. Conversión de temperaturas
Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
viceversa. (C = (F - 32) * 5/9, F = C * 9/5 + 32).
*/

fun main() {
    val temperatura = pedirEntero("Introduzca una temperatura: ")

    val celsius = (temperatura - 32) * 5 / 9
    val fahrenheit = (temperatura * 5 / 9) + 32

    println("$temperatura grados Fahrenheit equivalen a $celsius grados Celsius.")
    println("$temperatura grados Celsius equivalen a $fahrenheit grados Fahrenheit.")
}