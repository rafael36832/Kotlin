fun excecoes(){

    var nome : String = "Rafael"

    try {

        var inteiro : Int = nome.toInt()

    } catch (e: Exception){

        println(e)

    } finally {
        // Aqui sempre vai executar

        println("Executou o finally")

    }

    println("Fim do Try Catch")

}

fun nulos(senha: Int, Nome: String){

    // declarando que uma variável pode ser nulo
    // "?" após o tipo

    var nome : String? = null
    if(senha == 1234){
        nome = Nome
    }
    // operador Elvis
    // exemplos null safe
    println(nome ?: "Não definido")
    println(nome?.length)

}