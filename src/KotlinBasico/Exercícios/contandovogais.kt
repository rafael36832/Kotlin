fun count1(frase: String) {

    var contV = 0
    var contC = 0

    for (i in frase.uppercase()) {
        if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U')
            contV++
        else
            contC++
    }

    println("$contV vogais e $contC consoantes")
}

fun count2(frase: String, caracteres: String): Int{

    return frase.filter{it.lowercase() in caracteres.lowercase()}.length

}

fun main() {

    print(count2("Na primavera tem flores","aeiou", ))

}