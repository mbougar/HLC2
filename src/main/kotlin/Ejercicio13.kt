package com.mbougar

/*
13. Clase Anime sencilla
Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
*/

data class Anime(
    val nombre: String,
    val episodios: Int,
    val genero: String
)

fun main() {
    print("Introduce el nombre de un Anime: ")
    val nombre = readln()

    val episodios = pedirEntero("Introduce el número de episodios: ", 0)

    print("Introduzca el género del anime: ")
    val genero = readln()

    val anime = Anime(nombre, episodios, genero)

    println(anime)
}