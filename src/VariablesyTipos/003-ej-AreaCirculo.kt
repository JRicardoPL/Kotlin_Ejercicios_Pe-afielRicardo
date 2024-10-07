package VariablesyTipos

fun main(){
    var pi : Double = 3.1416

    println("Ingrese el radio del cirulo: ")
    var rad = readln().toDouble()

    var area = pi * (rad * rad)
    println("El area es: $area")
}