// EXTRACT FROM https://github.com/DevMasterTeam/UdemyKotlinIniciante/blob/master/Kotlin%20Basico/1.%20Linguagem%20Kotlin/src/XIIIColecoes/UsoColecoes.kt
// Feita modificações de exclusão de função antigas

package KotlinBasico

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)

fun farinha(recp: Receita): Boolean{

    var estado = false

    for (i in recp.ingredientes){

        if(i.nome == "Farinha")
            estado = true
    }

    return estado

}

fun main() {

    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome.contains("Lasanha") }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome.contains("Lasanha") }} receitas de Lasanha.")

    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")

    // Qual a soma de calorias?
    val sumCalories = data.sumOf { it.calorias }
    println("A soma de calorias é: $sumCalories")

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }

    // Sei como fazer panqueca? E sushi?
    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")

    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // Qual a média de calor de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")

    // Lista de dados simples
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.")

    // Eliminar receitas com mesmo nome
    println(data.distinctBy { it.nome })

    // Ordenar uma lista
    listaInteiros.sorted()
    listaInteiros.sortedDescending()

    // Inverter uma lista
    listaInteiros.reversed()


    // Faça uma lista com o nome dos pratos que tenham farinha
    data.filter { farinha(it) }.forEach{println(it.nome)}

}
