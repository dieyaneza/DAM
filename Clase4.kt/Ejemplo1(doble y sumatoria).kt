fun main(){

    var lista  = mutableListOf(1,1,3,4,5) //[1,2,5]
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("Lista: $lista")

    var filtrado = lista.filter{ it % 2 == 0}
    println("Filtrado: $filtrado")

    var doble = lista.map{ it+1}
    println("doble: $doble")

    var sumatoria = lista.sum()
    println("sumatoria: $sumatoria")


}



