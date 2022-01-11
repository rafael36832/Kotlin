package KotlinBasico

class funcoes2 (nomePai: String, nomeFilho: String){

    lateinit var nomePai: String
    lateinit var nomeFilho: String

    init {

        this.nomePai = nomePai
        this.nomeFilho = nomeFilho

    }

    fun pai(){

        // funções internas. Só a função pai pode chamá-la
        fun filho(mensagem: String){

            println(mensagem)

        }

        filho("Eu sou seu pai")

    }

    override fun toString(): String {
        return "Pai $nomePai e Filho $nomeFilho"
    }

    // o modificar infix permite que funções de um só parâmetro sejam chamadas sem os parênteses
    // exemplo: infixFunction 20 ou invés de infixFunction(20)
    infix fun infixDobro(valor: Int) = 2*valor

    // overloading de operadores em classes

    operator fun plus(add :funcoes2): funcoes2{

        return funcoes2(this.nomePai + add.nomePai, this.nomeFilho + add.nomeFilho)

    }



}

