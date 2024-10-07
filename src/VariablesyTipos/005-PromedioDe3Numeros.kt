package VariablesyTipos

fun main(){
    println("Ingrese el primer número: ")
    var valor1 = readln().toDouble()

    println("Ingrese el segundo número: ")
    var valor2 = readln().toDouble()

    println("Ingrese el tercer número: ")
    var valor3 = readln().toDouble()

    var total = (valor1 + valor2 + valor3)/3
    println("El primedio es: $total")

}