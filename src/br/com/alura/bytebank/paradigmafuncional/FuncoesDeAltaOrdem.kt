package br.com.alura.bytebank.paradigmafuncional

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main(){
    //o let tratasse de uma função que envolve o objeto que a chama para dentro de um escopo

    val endereco = Endereco(logradouro = "Rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro} , ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)


    Endereco(logradouro = "Rua vergueiro", numero = 3185)
        .let { endereco -> "${endereco.logradouro} , ${endereco.numero}".toUpperCase() }
        .let { enderecoEmMaiusculoss ->  println(enderecoEmMaiusculoss) }

    listOf(Endereco(complemento = "Casa"), Endereco(), Endereco(complemento = "Apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let (::println)

    somar(1, 5, resultado =  { valor ->

        println(valor)
        })

    val autenticavel = object :Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realiza pagamento")
    } )
//    testeHigher(1,{})

}

fun testeBlock(bloco: () -> Unit){}

//isso é chamado de higher order function
//é quando tem uma função que recebe ou devolve outra função
fun testeHigher(teste: Int, block: () -> Unit) {}

fun somar(a: Int, b: Int, resultado : (Int) -> Unit) {
    println("soma sendo executada")
    //ele só vai executar esse códigp quando eu chamar o reusltado
    //isso é chamado lazy evaluation
    println("Depois da soma")
    resultado(a + b)
    println("Antes da soma")
}

