package Condicionales
fun main(){
    println("Ingrese un número: ")
    val num = readln().toDouble()

    if (num < 0){
        println("Es negativo")
    }
    else if(num > 0){
        println("Es positivo")
    }else{
        println("Es cero")
    }
}
