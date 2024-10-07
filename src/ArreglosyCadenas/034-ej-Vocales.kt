package ArreglosyCadenas

fun main() {
    println("Ingresa una cadena:")
    val cadena = readln()
    var contadorVocales = 0
    for (caracter in cadena) {
        if (caracter.lowercaseChar() in "aeiou") {
            contadorVocales++
        }
    }
    println("La cantidad de vocales es: $contadorVocales")
}
