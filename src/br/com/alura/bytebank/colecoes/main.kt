package br.com.alura.bytebank.colecoes

fun main() {
    val banco = BancoDeNomes()
    banco.salva("Alex")
    val nomesSalvos: Collection<String> = banco.nomes

//    println(banco.nomes)
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes(){
    //tolist faz a copia
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = listOf(
        "Alex",
        "Maria",
        "Joao",
        "Romeu"
    )
    for (nome in nomes) {
        println(nome)
    }
    println("Tem alex? ${nomes.contains("Alex")}")
    println("Tamanho da lista? ${nomes.size}")
}