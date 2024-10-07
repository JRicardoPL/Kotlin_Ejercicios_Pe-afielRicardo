package Bucles

fun main() {
    println("Ingresa un número:")
    val n = readln().toInt()

    for (i in 1..10) {
        val resultado = n * i
        println("$n x $i = $resultado")
    }
}
