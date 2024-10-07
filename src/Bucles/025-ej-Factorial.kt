package Bucles

fun main() {
    println("Ingresa un número:")
    val n = readln().toInt()

    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("El factorial de $n es: $factorial")
}
