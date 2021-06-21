package br.com.alura.bytebank.lista

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
)
{
    fun organizaPorAltor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizaPorAnoDaPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }

    }
}