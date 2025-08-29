fun main(){

    var lista  = mutableListOf(1,1,3,4,5) //[1,2,5]
    lista.add(5)
    lista.add(5)
    lista.add(5)
    println("Lista: $lista")

    var filtrado = lista.filter{ it % 2 == 0}
    println("Filtrado: $filtrado")

    var buscaElPar = lista.find{it % 2 == 0}
    println("BuscaElPar: $buscaElPar")

    var primerElemento = lista.first()
    println("primerElemento: $primerElemento")

    var ultimoElemento = lista.last()
    println("ultimoElemento: $ultimoElemento")


}