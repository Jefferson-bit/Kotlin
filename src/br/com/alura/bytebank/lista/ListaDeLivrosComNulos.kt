package br.com.alura.bytebank.lista

fun main() {

    listaLivroComNulos.imprimeComMarcadores()


    listaDeLivros
            //estou usando elvis operator no editora, ele dar uma condição
            //pra joga rum valo diferente se o valor da esquerda for nulo, no caso ai
            // é o it.editora
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>)  ->
            println("$editora: ${livros.joinToString { it.titulo }}"     )
        }

}