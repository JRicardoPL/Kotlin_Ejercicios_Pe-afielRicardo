package VariablesyTipos

fun main(){
    println("Grados a convertir: ")
    val gradC = readln().toDouble()

    val gradF= ((gradC*1.8)+32)
    println("Grados Fahrenheit: $gradF")

}