package Ejercioios

val numeros = mutableListOf(30, 4, 11, 21, 7, 35)

fun main() {
    val numeros = mutableListOf(30, 4, 11, 21, 7, 35)

    // 1. Lista con elementos pares
    val pares = numeros.filter { it % 2 == 0 }
    println("Elementos pares: $pares")

    // 2. Primer elemento menor a 10
    val menor10 = numeros.firstOrNull { it < 10 }
    println("Primer elemento menor a 10: $menor10")

    // 3. Multiplicar cada elemento por 2
    val multiplicados = numeros.map { it * 2 }
    println("Elementos multiplicados por 2: $multiplicados")

    // 4. Sumar primer y último elemento
    val sumaExtremos = numeros.first() + numeros.last()
    println("Suma primer + último elemento: $sumaExtremos")

    // 5. Agregar [4, 4, 4]
    numeros.addAll(listOf(4, 4, 4))
    println("Lista después de agregar [4, 4, 4]: $numeros")

    // 6. Primer elemento divisible por 7
    val div7 = numeros.firstOrNull { it % 7 == 0 }
    println("Primer divisible por 7: $div7")

    // 7. Sumar todos los pares
    val sumaPares = numeros.filter { it % 2 == 0 }.sum()
    println("Suma de los pares: $sumaPares")

    // 8. Primer elemento impar y mayor a 10
    val imparMayor10 = numeros.firstOrNull { it % 2 != 0 && it > 10 }
    println("Primer impar > 10: $imparMayor10")
}
