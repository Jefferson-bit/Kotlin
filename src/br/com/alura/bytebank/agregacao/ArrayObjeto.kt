package br.com.alura.bytebank.agregacao

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    //essa forma é mais dinamica
    val salarios = bigDecimalArrayOf("1500.55", "5000.55", "4600.55", "10000.00")

    //aqui preciso colocar de um em um
    val array = Array<BigDecimal>(5) { BigDecimal.ZERO }



    array[0] = "1500.55".toBigDecimal()
    array[1] = "3200.55".toBigDecimal()
    array[2] = "4600.55".toBigDecimal()

    println("salario: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
            .map { salario -> calculaAumentoRelativo(salario, aumento)}
            .toTypedArray()

    println("salarios com aumento ${salariosComAumento.contentToString()}")
    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial $gastoInicial")

    //fold ele recebe um valor inicial, é quase igual reduce
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total $gastoTotal")

//    val salariosOrdenados = salariosComAumento.sorted()
//    //takeLast retorna lista então use o toTypedArray
//    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
//
//    val media = tresUltimosSalarios.media()

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(media)
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }


