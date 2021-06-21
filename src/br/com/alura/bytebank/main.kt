package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    println("maçante")
}

class SaldoInsuficienteException : Exception() {

}

fun main2 (){
    var enderecoNunlo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNunlo!!
    enderecoNaoNulo.logradouro
    enderecoNunlo.logradouro

}
