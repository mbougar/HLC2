package com.mbougar

/*
12. Inversión de un número
Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
*/

fun main() {
    val numero = pedirEntero("Introduzca un número entero positivo: ", 0)

    var nuevaCadena = ""
    val cadena = numero.toString()

    for (i in cadena.length - 1 downTo 0) {
        nuevaCadena += cadena[i]
    }

    println(nuevaCadena)
}