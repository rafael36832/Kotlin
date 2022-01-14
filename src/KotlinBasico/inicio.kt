// Variáveis e tipos
fun tipos(){

    // Modelo completo, informando o tipo:
    // var = variáveis mutáveis ao longo do código
    // val - variáveis imutáveis ao longo do código

    var nome: String = "Rafael"
    var idade: Int = 24

    // É possível omitir explicitamente o tipo, na declaração:

    var cidade = "Viçosa - MG"
    val nasc = 1997

    println("Nome: " + nome)
    println("Idade: $idade")
    println("Cidade: " + cidade)
    println("Ano de nasc: $nasc")

    // Tipos de dados:
    // Double (64b), Float(32b)
    // Long (64b), Int(32b), Short(16)
    // Byte(8b)
    // Boolean, String e Char (Tamanho depende da JVM)
    //
    println()
    println("Double: " + "Valor minimo: " + Double.MIN_VALUE + " Valor máximo: " + Double.MAX_VALUE)
    println("Float: "  + "Valor minimo: " + Float.MIN_VALUE + " Valor máximo: " + Float.MAX_VALUE)
    println("Long: " + "Valor minimo: " + Long.MIN_VALUE + " Valor máximo: " + Long.MAX_VALUE)
    println("Int: " + "Valor minimo: " + Int.MIN_VALUE + " Valor máximo: " + Int.MAX_VALUE)
    println("Short: " + "Valor minimo: " + Short.MIN_VALUE + " Valor máximo: " + Short.MAX_VALUE)
    println("Byte: " + "Valor minimo: " + Byte.MIN_VALUE + " Valor máximo: " + Byte.MAX_VALUE)

    // Os valores abaixo aceita o modificação Unsigned (se sinais)

    println("ULong: " + "Valor minimo: " + ULong.MIN_VALUE + " Valor máximo: " + Long.MAX_VALUE)
    println("UInt: " + "Valor minimo: " + UInt.MIN_VALUE + " Valor máximo: " + Int.MAX_VALUE)
    println("UShort: " + "Valor minimo: " + UShort.MIN_VALUE + " Valor máximo: " + Short.MAX_VALUE)
    println("UByte: " + "Valor minimo: " + UByte.MIN_VALUE + " Valor máximo: " + Byte.MAX_VALUE)

}

// Operadores
fun operadores(){

    println(""" Aritméticos
                Adição + 
                Subtração -
                Multiplicação * 
                Divisão /
                Resto %
    """.trimIndent())

    println()

    println(""" Relacionais
                Maior / Maior ou igual > >=
                Menor / Menor ou igual  < <=
                Igual / diferente == !=
    """.trimIndent())

    println()

    println(""" Lógicos
                E &&
                OU ||
                NÃO ! 
    """.trimMargin())
    println()
    println(""" Elvis ?:
                PodeSerNull: Int? = null     
                Valor: Int = PodeSerNull ?: 10 
                Significado: Se for nula, usa o valor 10, se não, usa o próprio valor       
    """.trimMargin())

}

fun conversao(){

    var valor : Int = 10

    println(valor.toLong())
    println(valor.toFloat())
    println(valor.toDouble())
    println(valor.toByte())

}

fun leitura(): String? {

    return readLine() // Lê uma linha / retorna sempre um string

}