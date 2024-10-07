package ArreglosyCadenas

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5)
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    println("La suma de los elementos es: $suma")
}