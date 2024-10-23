package com.mbougar

import kotlin.math.PI

/*
3. Cálculo del área de un círculo
Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
*/

fun main() {
    val radio = pedirEntero("Introduzca el radio de un círculo: ", 1)
    val area = PI * (radio * radio)

    println("El área del círculo especificado es %.2f unidades".format(area))
}