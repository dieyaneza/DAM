package Ejercioios

fun mostrarPromedio(nota1: Int?, nota2: Int?, nota3: Int?) {
    try {

        val n1 = nota1 ?: 0
        val n2 = nota2 ?: 0
        val n3 = nota3 ?: 0


        val promedio = (n1 + n2 + n3) / 3.0

        println("El promedio de las notas es: $promedio")

    } catch (e: Exception) {
        println("Error al calcular el promedio: ${e.message}")
    }
}

fun main() {
    val nota1 = 50
    val nota2 = 55
    val nota3 = null

    mostrarPromedio(nota1, nota2, nota3)
}