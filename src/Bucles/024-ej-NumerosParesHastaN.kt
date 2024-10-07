package Bucles

fun main() {
    println("Ingresa un número:")
    val n = readln().toInt()

    for (i in 1..n) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
