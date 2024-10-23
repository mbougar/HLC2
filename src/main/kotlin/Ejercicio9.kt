package com.mbougar

/*
9. Números primos
Pedir un número al usuario y verificar si es un número primo.
*/

fun main() {
    val numero = pedirEntero("Introduzca un número entero positivo: ", 0)
    val primo = comprobarPrimo(numero)
    when(primo) {
        true -> println("El número es primo")
        false -> println("El número no es primo")
    }
}

fun comprobarPrimo(numero: Int): Boolean {
    if (numero < 2) return true

    for (i in 2..(numero / 2)) {
        if (numero % i == 0) {
            return false
        }
    }

    return true
}