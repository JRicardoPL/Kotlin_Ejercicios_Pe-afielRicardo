package Condicionales

fun main() {
    println("¿Qué desea realizar?")
    println("1.- Suma")
    println("2.- Resta")
    println("3.- Multiplicación")
    println("4.- División")
    val operacion = readln().toInt()

    println("Ingrese el primer número: ")
    val num1 = readln().toDouble()
    println("Ingrese el segundo número: ")
    val num2 = readln().toDouble()

    when (operacion) {
        1 -> println("El resultado de la suma es: ${num1 + num2}")
        2 -> println("El resultado de la resta es: ${num1 - num2}")
        3 -> println("El resultado de la multiplicación es: ${num1 * num2}")
        4 -> println("El resultado de la división es: ${num1 / num2}")
        else -> println("El número ingresado no es válido.")
    }
}
