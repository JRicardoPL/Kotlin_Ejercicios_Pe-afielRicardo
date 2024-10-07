package VariablesyTipos

fun main(){
    println("Ingrese cuantos metros quiere convertir: ")
    var metros = readln().toDouble()

    var conversion = metros / 1000
    println("En kilometros son: $conversion km")
}