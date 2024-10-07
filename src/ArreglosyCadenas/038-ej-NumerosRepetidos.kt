package ArreglosyCadenas

fun main() {
    val numeros = intArrayOf(1, 2, 3, 2, 4, 3, 5, 1)
    val repetidos = numeros.groupBy { it }.filter { it.value.size > 1 }.keys
    println("Números repetidos: $repetidos")
}
