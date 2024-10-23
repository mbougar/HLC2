package com.mbougar

/*
6. Sumar números del 1 al 100
Crear un programa que sume todos los números del 1 al 100.
*/

fun main() {
    var contador = 0
    for (numero in 1..100) {
        contador += numero
    }

    println("La suma de todos los números del 1 al 100 es: $contador")
}