package com.mbougar

/*
11. Fibonacci
Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
número N lo ingresa el usuario).
*/

fun main() {
    val numero = pedirEntero("Introduzca un número entero: ", 0)

    println("Secuencia Fibonacci hasta el número $numero:")
    printFibonacci(numero)
}

fun printFibonacci(n: Int) {
    var num1 = 0
    var num2 = 1

    print("$num1, $num2")

    while (num2 <= n) {
        val nextNum = num1 + num2
        if (nextNum <= n)
        {
            print(", $nextNum")
        }
        num1 = num2
        num2 = nextNum
    }
}