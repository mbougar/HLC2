package com.mbougar

/*
8. Contador de vocales
Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
*/

fun main() {
    print("Introduzca una frase: ")
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    val frase = readln()

    var contador = 0

    for (char in frase.lowercase()) {
        if (char in vocales) {
            contador++
        }
    }

    println("Hay $contador vocales en la frase.")
}