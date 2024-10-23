package com.mbougar

/*
1. Saludo personalizado
Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
Juan!".
*/

fun main() {
    print("Introduzca su nombre: ")
    val nombre = readln().trim()

    println("¡Hola, $nombre!")
}