package Bucles

fun main() {
    println("Ingresa un número: ")
    val numero = readln().toInt()

    var n = numero
    var digitos = 0

    if (n == 0) {
        digitos = 1
    } else {
        while (n != 0) {
            n /= 10
            digitos++
        }
    }

    println("El número $numero tiene $digitos dígitos.")
}
