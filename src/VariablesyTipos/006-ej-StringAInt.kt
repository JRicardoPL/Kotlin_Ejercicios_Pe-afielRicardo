package VariablesyTipos

fun main(){
    var numero: Int

    while (true){
        try {
            println("Escribe el numero a adivinar: ")
            numero = readln().toInt()
            break;
        }catch (e: NumberFormatException){
            println("ERROR: Escribe un número valido")
        }
    }
    println("Tu número es: $numero")
}