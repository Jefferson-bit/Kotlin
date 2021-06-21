package br.com.alura.bytebank.lista

fun main() {

    val livro1 = Livro(
        titulo = "Bonifacio Terceiro",
        autor = "Maria Silva",
        anoPublicacao = 2001,
        editora = "Editora A"
    )

    val livro2 = Livro(
        titulo = "Arquitetura Limpa",
        autor = "João Jose",
        anoPublicacao = 1886,
        editora = "Editora B"
    )

    val livro3 = Livro(
        titulo = "Domain Driver Design",
        autor = "Rodrigo Moura",
        anoPublicacao = 1993,
        editora = "Editora C"
    )

    val livro4 = Livro(
        titulo = "Clean Code",
        autor = "Uncle Bob",
        anoPublicacao = 2019,
        editora = "Editora D"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.imprimeComMarcadores()

    val ordernadoPorAnoPublicacao: List<Livro> = livros.sorted()

    ordernadoPorAnoPublicacao.imprimeComMarcadores()

    val ordernadoPorTitulo = livros.sortedBy { it.titulo }
    ordernadoPorTitulo.imprimeComMarcadores()


}

val listaLivroComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "A pequena sereia",
        autor = "Disney",
        anoPublicacao = 1997
    ),
    null,
    Livro(
        titulo = "O cachorro e a Raposa",
        autor = "Disney",
        anoPublicacao = 1997
    ),

    null,
    Livro(
        titulo = "A dama e o vagabundo",
        autor = "Disney",
        anoPublicacao = 1999
    )
)

val listaDeLivros: MutableList<Livro> = mutableListOf(

    Livro(
        titulo = "A pequena sereia",
        autor = "Disney",
        anoPublicacao = 1997
    ),

    Livro(
        titulo = "O cachorro e a Raposa",
        autor = "Disney",
        anoPublicacao = 1997,
        editora = "Editora A"
    ),


    Livro(
        titulo = "A dama e o vagabundo",
        autor = "Disney",
        anoPublicacao = 1999,
        editora = "Editora B"
    )
)

val listaDeLivros2: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Bonifacio Terceiro",
        autor = "Maria Silva",
        anoPublicacao = 2001,
        editora = "Editora A"
    ),

    Livro(
        titulo = "Santa Capivara",
        autor = "Herbet Richard",
        anoPublicacao = 2021,
        editora = "Editora C"
    ),

    Livro(
        titulo = "O homem invisivel",
        autor = "Santa Monica",
        anoPublicacao = 2010
    ),

    Livro (
    titulo = "Arquitetura Limpa",
    autor = "João Jose",
    anoPublicacao = 1886,
    editora = "Editora B")
)