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

// funcao com template
fun <T> funcao3(vararg palavras: T){

    // chamar a função:
    // funcao3(1, 2, 3, 4, 5, ...)
    for(palavra in palavras)
        println(palavra)

}

