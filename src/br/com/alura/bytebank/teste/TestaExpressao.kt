package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1"


    //try expression
    try {
        val valor: Double = entrada.toDouble()
        println("valor recebi ${valor}")
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema de conversão")
        e.printStackTrace()
        null
    }

    //if expression
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }
}
