package Bucles

fun main() {
    println("Ingresa un número:")
    val numero = readln().toInt()

    var esPrimo = true

    if (numero <= 1) {
        esPrimo = false
    } else {
        for (i in 2 until numero) {
            if (numero % i == 0) {
                esPrimo = false
                break
            }
        }
    }

    if (esPrimo) {
        println("$numero es un número primo.")
    } else {
        println("$numero no es un número primo.")
    }
}
