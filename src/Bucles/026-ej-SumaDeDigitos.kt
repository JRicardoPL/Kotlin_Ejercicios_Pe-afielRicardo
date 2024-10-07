package Bucles

fun main() {
    println("Ingresa un número: ")
    val numero = readln().toInt()

    var suma = 0
    var n = numero

    while (n != 0) {
        suma += n % 10
        n /= 10
    }

    println("La suma de los dígitos de $numero es: $suma")
}
