package Ejercioios
fun esMayor(a: Int, b: Int): Boolean {
    return a > b
}

fun multiplicar(a: Int, b: Int): Int {
    return a * b
}

fun contarDesdeHasta(a: Int, b: Int) {
    if (a <= b) {
        for (i in a..b) {
            print("$i ")
        }
    } else {
        for (i in a downTo b) {
            print("$i ")
        }
    }
    println()
}

fun esImpar(a: Int): Boolean {
    return a % 2 != 0
}

fun esMayor100(a: Int): Boolean {
    return a > 100
}

fun multiplicarTres(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun sonTodosPares(a: Int, b: Int, c: Int): Boolean {
    return a % 2 == 0 && b % 2 == 0 && c % 2 == 0
}

fun main() {
    val a = 10
    val b = 5
    val c = 2


    println("1. ¿$a es mayor que $b? ${esMayor(a, b)}")
    println("2. $a × $b = ${multiplicar(a, b)}")
    print("3. Contar desde $a hasta $b: ")
    contarDesdeHasta(a, b)
    println("4. ¿$a es impar? ${esImpar(a)}")
    println("5. ¿$a es mayor a 100? ${esMayor100(a)}")
    println("6. $a × $b × $c = ${multiplicarTres(a, b, c)}")
    println("7. ¿$a, $b y $c son todos pares? ${sonTodosPares(a, b, c)}")
}