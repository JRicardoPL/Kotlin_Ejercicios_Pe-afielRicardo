package Condicionales

fun main() {
    println("Por favor, ingresa un número del 1 al 12:")
    val numero = readln().toIntOrNull()

    if (numero != null) {
        when (numero) {
            1 -> println("Enero")
            2 -> println("Febrero")
            3 -> println("Marzo")
            4 -> println("Abril")
            5 -> println("Mayo")
            6 -> println("Junio")
            7 -> println("Julio")
            8 -> println("Agosto")
            9 -> println("Septiembre")
            10 -> println("Octubre")
            11 -> println("Noviembre")
            12 -> println("Diciembre")
            else -> println("El número no está en el rango del 1 al 12.")
        }
    } else {
        println("Por favor, ingresa un número válido.")
    }
}