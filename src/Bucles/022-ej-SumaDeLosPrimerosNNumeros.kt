package Bucles

fun main() {
    println("Ingresa un número:")
    val n = readln().toInt()

    var suma = 0
    var numero = 1
    while (numero <= n) {
        suma += numero
        numero++
    }
    println("La suma de los primeros $n números es: $suma")
}
