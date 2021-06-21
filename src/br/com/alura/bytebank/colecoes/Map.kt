
fun main(){
    main3()
}

fun main1() {
    val pedidos: Map<Int, Double> = mapOf(Pair(1, 20.0), 3 to 45.0)

    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let { println("Existe? $it") }

    for(p: Map.Entry<Int, Double> in pedidos){
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    val pedidosMutable: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), 3 to 45.0)

    pedidosMutable[4] = 70.0
    println(pedidosMutable)
    pedidosMutable.put(5, 80.0)
    println(pedidosMutable)
    pedidosMutable[1] = 100.0
    println(pedidosMutable)
    //isso evita a atualização de chaves que já existe.
    //Ele só adiciona se a chave não existir
    pedidosMutable.putIfAbsent(6, 1200.0)
    println(pedidosMutable)


}

fun main2(){
    val pedidosMutable: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        3 to 45.0,
        4 to 100.0,
        5 to 150.0,
        6 to 180.0
    )
    val pedidosFiltrados = pedidosMutable.filter { (numero, valor) ->
        numero % 2 ==0 && valor > 50.0
    }

    println("Pedidos filtrados $pedidosFiltrados")

    //operador plus do kotlin, adiciona valores ao map sem alterar o original
    println(pedidosMutable + Pair(7, 90.0))

    println(pedidosMutable  - 6)
    //aceita list ou set
    pedidosMutable.putAll(setOf(7 to 90.0, 8 to 20.0))
    println(pedidosMutable)
}

fun main3(){
    val pedidos = listOf(
        Pedido(numero = 1,valor = 20.0),
        Pedido(numero = 2,valor = 60.0),
        Pedido(numero = 3,valor = 30.0),
        Pedido(numero = 4,valor = 70.0)
        )


    val associate = pedidos.associate { pedido: Pedido -> Pair(pedido.numero, pedido) }

    println(associate)
    // é uma maneira mais resumida de devolver o proprio valor que está sendo percorrido durante a operação
    val associateBy: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(associateBy)

    //ele transforma cada um dos elementos em chave e então associamos com outro valor
    //serve também para calcular algum tipo de frete. Se o pedido tem um valor de 50.0 o frete é grátis
    //a chave é o proprio pedido e o valor se torna booleano
    val associateWith:Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println("associaçãoWith $associateWith")
    //comparando aqui
    println(associateWith[Pedido(numero = 2, valor = 60.0)])

    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
    println("associaçãoBy $mapa")
    println()
    val pedidoFreteGratisAgrupado = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidoFreteGratisAgrupado)
    println(pedidoFreteGratisAgrupado[true])

    val nomes = listOf(
        "Alex",
        "Fan",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Giselle"
    )
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome -> nome.first() }

    println(agenda)
}
data class Pedido(val numero: Int, val valor: Double)