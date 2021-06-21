package br.com.alura.bytebank.paradigmafuncional

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import kotlin.math.log

fun main(){

    soma(2, 2, resultado = {
        println(it)
    })

 somaReceiver(1, 6, resultado = {

     println(this)
 })

}
fun resultado(a : Int){

}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    resultado(a + b)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    val total: Int = a + b
    //o resultado pertence agora ao Tipo Int
    total.resultado()
    resultado(a + b)
}


private fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12


    val contaPoupanca = ContaPoupanca(Cliente(nome = "jeffeson", cpf = "11111", senha = 1234), numero = 1000)
    contaPoupanca
        .run {
            deposita(1000.0)
            println(saldo)
        }.let(::println)

    val redimentoAnual = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println(redimentoAnual)
}

private fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua vergeiro"
        numero = 5320
        bairro = "Mbnte Gordo"
        cidade = "São paulo"
        estado = "SP"
        cep = "39i23203"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto -> println(enderecoCompleto) }
}