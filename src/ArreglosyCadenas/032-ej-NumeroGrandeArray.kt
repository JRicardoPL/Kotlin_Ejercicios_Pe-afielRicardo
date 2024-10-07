package ArreglosyCadenas

fun main() {
    val numeros = intArrayOf(3, 5, 1, 8, 4)
    var maximo = numeros[0]
    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }
    println("El número más grande es: $maximo")
}
