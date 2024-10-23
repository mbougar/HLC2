package com.mbougar

/*
14. Inventario de videojuegos
Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
eliminar y mostrar los videojuegos del inventario.
*/

data class Videojuego(
    val titulo: String,
    val plataforma: String,
    val horasJugadas: Int
)

class Inventario() {
    private val inventario: MutableList<Videojuego> = mutableListOf()

    fun agregarVideojuego() {
        print("Introduzca el titulo del videojuego: ")
        val titulo = readln()

        print("Introduzca la plataforma: ")
        val plataforma = readln()

        val horasJugadas = pedirEntero("Introduce las horas jugadas: ", 0)

        inventario.add(Videojuego(titulo, plataforma, horasJugadas))
    }

    fun eliminarVideojuego() {
        println("Introduca el titulo del videojuego: ")
        val tituloVideo = readln()
        val videojuego = inventario.find { it.titulo == tituloVideo }
        if (videojuego != null) {
            inventario.remove(videojuego)
        } else {
            println("No hay un videojuego con ese nombre")
        }
    }

    fun mostrarVideojuegos() {
        println("Videojuegos:")
        for (videojuego in inventario) {
            println(" - $videojuego")
        }
    }
}

fun main() {
    val inventario = Inventario()
    var opcion = 0

    while (opcion != 4) {
        println("1. Agregar")
        println("2. Eiminar")
        println("3. Mostrar")
        println("4. Cerrar programa")
        opcion = pedirEntero("Introduzca una opcion: ", 1, 4)

        when(opcion) {
            1 -> inventario.agregarVideojuego()
            2 -> inventario.eliminarVideojuego()
            3 -> inventario.mostrarVideojuegos()
        }
    }
}