package com.mbougar

/*
5. Tabla de multiplicar
Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
*/

fun main() {
    val numero = pedirEntero()

    repeat(10) {
        index -> println("$numero x ${index + 1} = ${numero * (index + 1)}")
    }
}