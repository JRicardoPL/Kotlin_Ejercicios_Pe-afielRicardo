package Condicionales

fun main() {
    println("Ingrese la calificación (0 a 100): ")
    val calificacion = readln().toDouble()

    when {
        calificacion in 90.0..100.0 -> println("La calificación es A")
        calificacion in 80.0..89.9 -> println("La calificación es B")
        calificacion in 70.0..79.9 -> println("La calificación es C")
        calificacion in 60.0..69.9 -> println("La calificación es D")
        calificacion in 0.0..59.9 -> println("La calificación es F")
        else -> println("Calificación no válida. Ingrese un valor entre 0 y 100.")
    }
}
