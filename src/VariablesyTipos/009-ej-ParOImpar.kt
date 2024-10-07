package VariablesyTipos

fun main(){
    println("Ingrese un número: ")
    var numero = readln().toDouble()

    var res = numero % 2

    if(res > 0){
        println("Es impar")
    } else{
        println("Es par")
    }
}