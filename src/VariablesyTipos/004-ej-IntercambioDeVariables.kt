package VariablesyTipos

fun main(){
    println("Ingrese una variable: ")
    var vari1 = readln()

    println("Ingrese otra variable: ")
    var vari2 = readln()

    var cambio = vari1

    vari1 = vari2
    vari2 = cambio

    println("La variable 1 es $vari1 y la variable 2 es $vari2")
}