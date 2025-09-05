package Ejercioios
fun operacion(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y)
}


fun suma(a: Int, b: Int): Int {
    return a + b
}

fun multiplicacion(a: Int, b: Int): Int {
    return a * b
}

fun main() {

    val resultadoSuma = operacion(2, 2, ::suma)
    println("2 + 2 = $resultadoSuma")


    val resultadoMultiplicacion = operacion(2, 2, ::multiplicacion)
    println("2 × 2 = $resultadoMultiplicacion")


    val resultadoSumaLambda = operacion(2, 2) { a, b -> a + b }
    println("2 + 2 (con lambda) = $resultadoSumaLambda")

    val resultadoMultiplicacionLambda = operacion(2, 2) { a, b -> a * b }
    println("2 × 2 (con lambda) = $resultadoMultiplicacionLambda")
}