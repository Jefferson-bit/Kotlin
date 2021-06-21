package br.com.alura.bytebank.lista

fun main() {

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros2)

    val organizaPorAltor = prateleira.organizaPorAltor()
    val organizaPorAnoDaPublicacao = prateleira.organizaPorAnoDaPublicacao()

    organizaPorAltor.imprimeComMarcadores()
        organizaPorAnoDaPublicacao.imprimeComMarcadores()

}