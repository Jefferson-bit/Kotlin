package br.com.alura.bytebank.paradigmafuncional

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    //it ele é um objeto acessivel como argumento do lambda
    //this ele é um receptor, a diferença entre it e this
    // é que o this não precisa usar o nome do objeto não precisamos referencia-los. E como se estivessemos
    //dentro da cclasse
    // o this podemos usar o run with e applu, já o it é o let e also
    //o apply e also ele retorna o objeto de contexto
    // já o let run and with retorno o resultado da lambda

    //retorna resultado da lambda
    Endereco(logradouro = "Rua vergueiro", numero = 3185)
        .let { endereco -> "${endereco.logradouro} , ${endereco.numero}".toUpperCase() }
        .let { enderecoEmMaiusculoss -> println(enderecoEmMaiusculoss) }

    //retorna o objeto
    Endereco(logradouro = "Rua vergueiro", numero = 3185)
        .apply { "$logradouro , $numero".toUpperCase() }
        .let { enderecoEmMaiusculoss -> println(enderecoEmMaiusculoss) }

    //com with precisamos mandar o objeto de contexto como receiver, no parametro do with
    // o resultado dele é uma lambda. Ou seja, estamos trabalhando como se estivessemos dentro da classe
    //mas o retorno final é da lambda. Pdemos ter acesso as variaeis da classe mas o retorno é o resultado da lambda
    val endereco = Endereco(logradouro = "Rua vergueiro", numero = 3185)
        with(endereco) {
            "$logradouro , $numero".toUpperCase()
        }.let { enderecoEmMaiusculoss: String ->
            println(enderecoEmMaiusculoss)
        }

    //no run podemos fazer incializações e computações no final, por exemplo algum calculo
    //ele não possui vinculo com nenhum objeto
    run { println("Execução do run sem extensão") }

    //apply é como se tivesse um construtor com argumento mas ele é opcional, então queremos inserir valores
    // nesse construtor,. Podemos fazer isso pelo aplly, ele também retorno o objeto com os valores modificados
    Endereco().apply {
        logradouro = "Santa Catarina"
        numero = 1332
    }

    //also ele tem um objeto de contexto como argumento, retorna o proprio objeto. A diferença é que ele usa objeto do
    //contexto. Ele é bom pra fazer ações no código, tipo um envio de email. Mas ele faz operações simples que não
    //tem efeitos colaterais no código, ou seja se você remover ele não afetar o código, ele continua compilando
    Endereco()
        .also { println("Criando o objeto")}
        .apply {
        logradouro = "Santa Catarina"
        numero = 1332
    }


    // O let ele tem um retorno lambda e podemos trabalhar com resultados de uma ou mais funções

    val numero = mutableListOf("um", "dois", "três", "quatro", "cinco")
    numero.map { it.length }.filter { it > 3 }.let {
        println(it)

    }
}