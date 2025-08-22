fun main(){

    println("Inicio de programa")

    val a = 5
    val b = 3

    sumar(a, b)
    sumar(9, 34)
    sumar(14, 68)
    sumar(1, 85)

    restar(a, b)
    restar(53, 18)
    restar(746, 698)
    restar(265, 67)

    mul(a, b)
    mul(56, 68)
    mul(14, 679)
    mul(2,8)

    div(a, b)
    div(56,2)
    div(125,5)
    div(80,0)

}
fun sumar(a:Int, b:Int){
    print(" Programa de sumas extremas - Voy asumar $a con $b = ")
    println(a+b)
}

fun restar(a:Int, b:Int) {
    print(" Programa de restas extremas - Voy restar $a con $b = ")
    println(a - b)
}

fun mul(a:Int, b:Int) {
    print(" Programa de multiplicaciones extremas - Voy multiplicar $a con $b = ")
    println(a * b)
}
fun div(a:Int, b:Int) {
    print(" Programa de divisiones extremas - Voy dividir $a con $b = ")
    if (b==0){
        print ("error")

    }  else {
        println(a/b)
    }
    }