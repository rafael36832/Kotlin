    // Trabalhando com Classes / orientação a objetos com Kotlin

class Curso(private var nome: String) {

    public var id: Int = -1
        get() {
            println("GET")
            return field
        }
        set(value: Int) {
            println("SET")
            field = value
        }

    // construtores secundários obrigatoriamente chamam o construtor primario
    constructor(id: Int, nome: String) : this(nome) {
        this.nome = nome
        this.id = id
    }

}

    // Classes enum
    // Listas possibilidades de valor para meses
    // Evitar erro, por exemplo escrever ABRI ou invés de ABR

enum class Meses(var num: Int, var nome: String){
    JAN(1, "Janeiro"),
    FEV(2, "Fevereiro"),
    MAR(3, "Março"),
    ABR(4, "Abril"),
    MAI(5, "Maio"),
    JUN(6, "Junho"),
    JUL(7, "Julho"),
    AGO(8, "Agosto"),
    SET(9, "Setembro"),
    OUT(10, "Outubro"),
    NOV(11, "Novembro"),
    DEC(12, "Dezembro")

    // Para testar na main
    // var mes = Meses.JAN
    // print("${mes.num} ${mes.nome}")

}

class Pessoa(var nome: String?){

    // com lateinit é possível inicializar a variável depois, mesmo sem permitir null para ela
    lateinit var sobrenome: String
    // init roda sempre que instancia um objeto
    init{
        if(nome==null){
            nome = "Rafael"
        }
    }

    fun Sobrenome(sobrenome: String){
        this.sobrenome = sobrenome
    }

}

// Uso do Data Class (struct)

data class carro(val cor:String, val ano:Int)

