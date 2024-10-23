package com.mbougar

import kotlin.random.Random

/*
4. Generador de números aleatorios
Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
El programa indicará si el número es mayor o menor al ingresado.
Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.
*/

fun main() {
    val random = Random.nextInt(1, 101)
    var numero: Int

    do {
        numero = pedirEntero("Introduce un número entre 1 y 100: ", 1, 100)
        when {
            numero > random -> println("El número introducido es mayor que el número oculto.")
            numero < random -> println("El número introducido es menor que el número oculto.")
        }
    } while (numero != random)

    println("¡Enhorabuena, has acertado!")
}