package Ejercioios

fun main() {
    val edad = 20
    val promedio = 65
    val peso = 56


    if (edad >= 18) {
        println("Es mayor de edad")
    } else {
        println("Es menor de edad")
    }


    if (promedio >= 40) {
        println("Aprueba la asignatura")
    } else {
        println("No aprueba la asignatura")
    }

    // 3. Pesa más de 50 kg
    if (peso > 50) {
        println("Pesa más de 50 kg")
    } else {
        println("Pesa 50 kg o menos")
    }


    if (edad > 15 && peso > 50) {
        println("Tiene más de 15 años y pesa más de 50 kg")
    } else {
        println("No cumple ambas condiciones")
    }


    if (promedio in 60..70) {
        println("Su promedio está entre 60 y 70")
    } else {
        println("Su promedio NO está entre 60 y 70")
    }


    if (edad % 3 == 0) {
        println("Su edad es múltiplo de 3")
    } else {
        println("Su edad NO es múltiplo de 3")
    }
}