package Condicionales

fun main(){
    println("Ingrese el costo del producto: ")
    val precio = readln().toDouble()

    if (precio >= 1000){
        println("Aplica el descuento, su total a pagar es de $${precio-(precio * 0.2)}")
    }else{
        println("Lo sentimos pero el descuento no aplica :( su total a pagar es de $$precio")
    }
}