package br.com.alura.bytebank.paradigmafuncional

fun main(){

    val minhaFuncao: () -> Unit = ::teste
    val minhaFuncao1 =  ::teste

    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = { teste() }
    //isso funciona pq o kotlin já reconhece que é um tipo função na classe teste
    val minhaFuncaoClasse1  = teste()
    println(minhaFuncaoClasse())
}
fun teste(){
    println("executa teste")
}

class Teste : ()  -> Unit{
    override fun invoke() {
        println("Executa Invoke do Teste")
    }

}

