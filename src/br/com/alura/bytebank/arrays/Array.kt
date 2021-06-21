package br.com.alura.bytebank.arrays

fun main(){
    main2()
}

fun main1() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33

    if (idade1 > idade2) {
        val maiorIdade: Int = 1

    }

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3) {
        idade2
    } else {
        idade3
    }

    println(maiorIdade)

    println("------------------------")

    val idades = IntArray(4)
    val intArrayOf = intArrayOf(13, 12, 33, 44, 55)
    val idadesComArray: IntArray = intArrayOf(33, 23, 54, 99)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    var maiorIdade1 = 0
    for (idade in idades) {
        if (idade > maiorIdade1) {
            maiorIdade1 = idade
        }
    }
    println(maiorIdade1)
    var menorIdade = Int.MAX_VALUE
    idadesComArray.forEach { idade ->
            if (idade < menorIdade) {
                menorIdade = idade
        }
    }
    println("menoridade $menorIdade")
}

fun main2(){
    val salarios: DoubleArray = doubleArrayOf(1500.0, 1230.0, 4200.0, 3430.0)

    val aumento = 1.1
    var indice = 0
    for(salario in salarios){
        salarios[indice] = salario * aumento
    }

    println(salarios.contentToString())
    for(indice in salarios.indices){
        salarios[indice] *= aumento
    }
    val contatos = arrayOf("Roberto", "Maria", "Ana")
    val contatos1 = Array<String>(3) {"Roberto"; "Ana"; "Rodrigo"}


    val listOf = listOf<String>("ALgo")
    println("lista: $listOf")

    println("Contatos1 $contatos1")
    println("contatos ${contatos.toString()}")

    salarios.forEachIndexed {
        i, salario -> salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}