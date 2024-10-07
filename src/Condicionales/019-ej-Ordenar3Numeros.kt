package Condicionales

fun main() {
    println("Ingrese un número: ")
    val num1 = readln().toDouble()
    println("Ingrese otro número: ")
    val num2 = readln().toDouble()
    println("Ingrese un último número: ")
    val num3 = readln().toDouble()

    val mayor = if (num1 >= num2 && num1 >= num3) num1 else if (num2 >= num1 && num2 >= num3) num2 else num3
    val menor = if (num1 <= num2 && num1 <= num3) num1 else if (num2 <= num1 && num2 <= num3) num2 else num3
    val intermedio = num1 + num2 + num3 - mayor - menor

    println("El mayor es: $mayor, el intermedio es: $intermedio y el menor es: $menor")
}