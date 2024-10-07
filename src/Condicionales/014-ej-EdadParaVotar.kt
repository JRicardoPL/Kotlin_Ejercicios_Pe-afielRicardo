package Condicionales

fun main(){
    println("Ingrese su edad: ")
    val edad = readln().toInt()

    if (edad >= 18){
        println("Puede votar")
    }else{
        println("Es menor de 18 años, aun no puede votar")
    }
}