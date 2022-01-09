package KotlinBasico

fun colecoes(){

    // Coleções do Java
    // List, Array, Set e Map

    // List
    var lista = mutableListOf<Int>()
    var listaImutável = listOf<Int>()
    // Funções add, remove, removeAt, size, contains, acesso por índice...

    // Array (mutável)
    var vetor = arrayListOf<Int>()
    // Funções add, remove, removeAt, size, contains, acesso por índice...

    //Set
    var conjunto = mutableSetOf<Int>()
    var conjuntoImutavel = setOf<Int>()
    // Funções add, remove, size, contains

    //Map
    var hash = mutableMapOf<Int, Int>()
    var dictImutavel = mapOf<Int, Int>(Pair(2, 4), Pair(3, 9))
}

fun funcoes(){

}