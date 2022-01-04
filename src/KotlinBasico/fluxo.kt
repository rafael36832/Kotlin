// controles de fluxos
// if else
fun ifelse(a: Int, b:Int): Int{

    if(a>b){
        println("Primeiro é maior")
    } else {
        println("Segundo é maior")
    }

    // Em Kotlin, if/else é considerado um expressão. Note:

    return if(a>b) { a } else { b }

}

// when
fun opwhen(a: Int, b:Int, op:Char){

    // Pode ser usado como switch
    when (op){
        '+' -> {
            println(a+b)
        }
        '-' -> {
            println(a-b)
        }
        '/' -> {
            println(a/b)
        }
        '*' -> {
            println(a*b)
        }
        else -> {
            println("Operação inválida!")
        }
    }

    // ou como if/else sem aninhamento

    when{
        a > b ->{
            println("A > B")
        }
        a < b ->{
            println("B > A")
        }
        a == b ->{
            println("A = B")
        }
    }

    // Comando Range

    when {
        a in 1..100 -> {
            println("A está entre 1 e 100, inclusos")
        }
        b in 1..100 -> {
            println("B está entre 1 e 100, inclusos")
        }

    }

}

// for
fun opfor(a: Int, b: Int){

    var passo = 3

    for (i in a..b step passo){
        println(i)
    }

    // downTo usado para imprimir de forma decrescente
    for (i in b downTo a step passo){
        println(i)
    }
}

// while
fun opwhile(a:Int, b:Int){

    var i = a
    while (i<b){
        print("$i ")
        i++
        if(i==10)
            break
    }

}

// do while
fun opdowhile(a: Int, b: Int){

    var i = a
    do{
        print("$i ")
        i++
        if(i==10)
            break
    } while (i<b)
}
