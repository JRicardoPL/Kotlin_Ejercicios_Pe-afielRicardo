package ArreglosyCadenas

fun main() {
    println("Ingresa una palabra:")
    val palabra = readln()
    val esPalindromo = palabra == palabra.reversed()
    if (esPalindromo) {
        println("La palabra es un palíndromo.")
    } else {
        println("La palabra no es un palíndromo.")
    }
}
