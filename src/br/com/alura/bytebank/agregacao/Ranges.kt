package br.com.alura.bytebank.agregacao

fun main() {
    main1()
}

fun main1() {

    val serie: IntRange = 1.rangeTo(10)
    //o s passado ele é imutavel independente de array ou range
    for (s in serie) {
        println("$s")
    }
    println()

    //until ele não vai imprimir o 100
    val numerosPares = 2.until(100) step 2
    //in no for ele pega cada valor de cada elemento do array e colocar pra variavel imutavel que é numeropar
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    //downTo mostra ao contrario do 100 até 0 e o step ele imprime de 2 em 2
    //ou seja 2 4 6 8 10...
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { println("$it") }
    mutableListOf<String>("Sessão", "Endereco")

    println("-----------------------")

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    //in no if ele verifica se o valor a esquerda(salario) tá dentro do intervalo
    //quando digo dentro do intervalo, me refiro aos dois pontos n
    if(salario in intervalo){
        println("Está dentro do intervalo")
    }else {
        println("Fora do intervalo")
    }
    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}