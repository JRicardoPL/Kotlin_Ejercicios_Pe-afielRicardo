package Condicionales

fun main(){
    println("Ingrese un número: ")
    var num1 = readln().toDouble()
    println("Ingrese otro número")
    var num2 = readln().toDouble()

    if(num1 > num2){
        println("$num1 es mayor a $num2")
    }else{
        println("$num2 es mayor a $num1")
    }
}