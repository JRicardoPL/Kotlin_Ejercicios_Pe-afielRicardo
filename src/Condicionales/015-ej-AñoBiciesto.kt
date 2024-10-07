package Condicionales

fun main(){
    println("Ingrese el año: ")
    val year = readln().toInt()

    val res = year % 4
    if (res == 0){
        println("Este año es biciesto")
    } else{
        println("No es biciesto")
    }
}