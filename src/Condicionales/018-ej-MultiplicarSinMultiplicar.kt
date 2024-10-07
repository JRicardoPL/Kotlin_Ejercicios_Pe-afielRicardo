package Condicionales

fun main() {
    println("Ingrese el primer número: ")
    val num1 = readln().toInt()
    println("Ingrese el segundo número: ")
    val num2 = readln().toInt()

    var resultado = 0
    var contador = if (num2 > 0) num2 else -num2

    while (contador > 0) {
        resultado += if (num1 > 0) num1 else -num1
        contador--
    }

    // Ajustar el signo calculando manualmente el producto de los signos
    val signo1 = if (num1 < 0) -1 else 1
    val signo2 = if (num2 < 0) -1 else 1
    resultado *= signo1 * signo2

    println("El resultado de la multiplicación es: $resultado")
}