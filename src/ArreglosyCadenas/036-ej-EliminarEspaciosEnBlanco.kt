package ArreglosyCadenas

fun main() {
    println("Ingresa una cadena:")
    val cadena = readln()
    val sinEspacios = cadena.replace(" ", "")
    println("La cadena sin espacios es: $sinEspacios")
}
