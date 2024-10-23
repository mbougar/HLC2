package com.mbougar

/*
7. Reverso de una cadena
Pedir una cadena al usuario e imprimirla al revés.
*/

fun main() {
    print("Introduzca una cadena de caracteres: ")
    var nuevaCadena = ""
    val cadena = readln()

    for (i in cadena.length - 1 downTo 0) {
        nuevaCadena += cadena[i]
    }

    println(nuevaCadena)
}