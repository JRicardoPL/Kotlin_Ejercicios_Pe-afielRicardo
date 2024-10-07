package VariablesyTipos

fun main(){
    println("Ingrese un número del 1 al 7: ")
    var dia = readln().toInt()

    when(dia){
        1 -> println("Lunes");
        2 -> println("Martes");
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("El numero no es valido")
    }
}