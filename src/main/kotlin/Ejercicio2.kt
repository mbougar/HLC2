package com.mbougar

/*
2. Número par o impar
Pedir un número al usuario e indicar si es par o impar.
*/

fun main() {

    val numero = pedirEntero()

    if (numero % 2 == 0) {
        println("El número es entero.")
    } else {
        println("El número no es entero")
    }

}

fun pedirEntero(message: String = "Introduzca un número entero: ", min: Int = Int.MIN_VALUE, max: Int = Int.MAX_VALUE): Int {
    var numero: Int?
    print(message)

    do {
        try {
            numero = readln().toInt()
            if (numero !in min..max) {
                throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            numero = null
            print("Error, el número introducido no es válido. $message")
        } catch (e: Exception) {
            println("Error inesperado.")
            numero = null
        }
    } while (numero == null)

    return numero
}