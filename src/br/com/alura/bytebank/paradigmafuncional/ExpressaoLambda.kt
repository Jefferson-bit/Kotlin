package br.com.alura.bytebank.paradigmafuncional


fun main(){
    //############################# função de expressao lambda #############################

    //A expressão lambda é um sintaxe mais enxugada do tipo função
    // a gente pode definir o comportamento diretamente na variavel sem precisar criar
    //uma função ou classe. Podemos printar diretamente na mesma linha
    val minhaFuncaoLambda: (Int, Int) -> Int ={ a , b ->
        a * b

    }

    val minhaFuncaoLambda1 = {
        println("executa como lambda")
    }

    //podemos colocar o underline no A e B _ _ caso a gente não queira usar
    val minhaFuncaoLambda2: (Int, Int) -> Int ={ a , b ->
        a + b
    }

    //sempre retorna a ultima instrução
    //com labels podemos fazer dois tipo de retorno
    //com lambda@ podemos retornar duas vezes
    //tenta sempre usar um apelido ao inves de it
    val calculaBonificacao: (salario: Double) -> Double = lambda@{
        if(it > 1000.0){
            return@lambda it + 50

        }
        it + 100.0
    }
    // #################### função de expressa lambda anonima #################################

    //isso aqui é uma função anonima. A diferença entre expressão lambda e função anonima
    //É que na função anonima, não conseguimos reutilizar essa função em outra variavel
    val minhaFuncaoAnonima: () -> Unit = fun (){
        println("Executa como anonima")
    }

    //a diferença aqui de uma função anonima com expressão lambda, é que precisar realmente retornar
    // o valor
    val minhaFuncaoAnonima1: (Int, Int) -> Int = fun (a, b):Int{
        return a + b
    }

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double{
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
    }
    println(minhaFuncaoLambda(100, 200))
    println(minhaFuncaoLambda2(15, 10))
    println(minhaFuncaoAnonima())
    println(minhaFuncaoAnonima1(30, 50))
    println(calculaBonificacao(1100.0))
    println(calculaBonificacaoAnonima(1100.0))

 }
