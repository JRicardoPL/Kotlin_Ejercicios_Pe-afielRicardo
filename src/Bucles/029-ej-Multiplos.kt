package Bucles

fun main() {
    println("Ingresa un número:")
    val n = readln().toInt()

    println("Múltiplos de 5 entre 1 y $n:")
    for (i in 1..n) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}
