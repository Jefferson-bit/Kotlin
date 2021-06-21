package br.com.alura.bytebank.colecoes

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos)

    //a ordem importa
    println(assistiramCursoKotlin  + assistiramCursoAndroid)

    println(assistiramCursoAndroid.union(assistiramCursoKotlin))

    //soma maior
    println(assistiramCursoAndroid union assistiramCursoKotlin)
    //soma menor
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
    //aqui a ordem não importa. Ele vai junta quem tem interesse no curso de kotlin e android
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val mutableList = assistiramAmbos.toMutableList()
    mutableList.add("Alex")
    println(mutableList)
    println(mutableList.toSet())
}