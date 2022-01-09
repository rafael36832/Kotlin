import java.lang.Exception
import java.util.Collections.*
import kotlin.math.*

// Declaração de funções: parâmetros e retornos
// o que é void em outras linguagens no Kotlin é "Unit"
fun funcao(a: Int, b: Int): Int{
    return a*b
}

// Função de um só linha:
fun funcao1l(a:Int, b:Int) = a*b

// Funções com valores default (sem precisar de receber todos os argumentos
fun funcao2(rua: String, numero:Int, comp: String=""){
    // na hora de chamar, posso não passar o complemento
    // funcao2(rua = adao, numero=601)
    print ("Rua $rua, Num $numero $comp")
}

//lista de argumentos
//função que vai receber uma sequência de floats
fun funcao3(vararg notas: Float){

    // chamar a função:
    // funcao3(1, 2, 3, 4, 5, ...)

    var qtd = notas.size

    if (qtd == 0){
        println("Divisão por zero")
        return Unit
    }
    var soma: Float = 0f

    for(nota in notas) {
        soma += nota
    }

    println("Soma das notas: $soma")
    println("Média das notas: ${soma/qtd}")

}

// funcões Math

fun funcoesString(){

    var str = "Funções de Strings"

    // retorna um boolean / da pra ignorar ou não o case
    println(str.startsWith("fun", true))
    println(str.endsWith("ings", true))

    // pula a primeiro indice e pega a subtring até o ultimo indice incluso
    println(str.substring(5, 10))

    // função replace / da pra ignorar ou não o case
    println(str.replace("Funções", "Função", true))

    // upper and lowercase

    println(str.lowercase())
    println(str.uppercase())

    // função trim (retira espaços em branco)

    println(str.trim())

}

fun funcoesMath(){

    // maior e menor valores
    println(max(10, 5))
    println(min(-2, 3,))

    //(que podem também receber uma lista de valores)
    var lista = mutableListOf<Int>(1, 2, 3, 4)
    println(max(lista))
    println(min(lista))

    // funções padrão
    println(sqrt(45.8))
    println(PI)
    println(E)

    // arrendondar (pra baixo ou para cima)
    println(round(6.5))



}

// funcao com template ou com any (mesma significado)

fun <T> funcao3(vararg palavras: T){

    // chamar a função:
    // funcao3(1, 2, 3, 4, 5, ...)
    for(palavra in palavras)
        println(palavra)

}

fun funcao4(dados: Any){
    // chamar a função:
    // funcao3(1, 2, 3, 4, 5, ...)
    for(dado in dados.toString())
        println(dado)

}

fun retornaExcecao(): Nothing{
    var e: Exception
    e = Exception("Essa função só retorna exceções")
    return throw(e)

}