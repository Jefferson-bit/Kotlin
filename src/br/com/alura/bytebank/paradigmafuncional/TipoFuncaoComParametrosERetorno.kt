package br.com.alura.bytebank.paradigmafuncional

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
}

fun testaTipoFuncaoReferencia(){
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun testaTipoFuncaoClasse(){
    val minhafuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhafuncaoClasse(20, 30))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int)  -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}