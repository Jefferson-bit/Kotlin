package br.com.alura.bytebank.agregacao

fun main(){
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val max = idades.max()
    println(max)

    val min = idades.min()
    println(min)

    val average = idades.average()
    println(average)



    //retorna todos que satisfazerem essa condição
    val all = idades.all { it > 18 }

    println("todos maiores? $all")

    //retorna quem satisfazer a condição
    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    //retorna lista mantendo aqueles que satisfazeram o predicato
    val filter = idades.filter { it >= 18 }
    println(filter)

    val find = idades.find { it >= 30 }
    println(find)
}