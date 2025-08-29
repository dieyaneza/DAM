fun main(){

    val charmander = Pokemon("Charmander", 40, 80)
    //charmander.informacion()
    //charmander.recibeDano(30)
    //charmander.recibeDano(20)
    //charmander.recibeDano(55)

    val mewtwo = Pokemon("Mewtwo", 300, 450)

    charmander.informacion()
    mewtwo.informacion()

    charmander.SePreparaParaLaBatalla()
    mewtwo.recibeDano(charmander.atk)

    mewtwo.SePreparaParaLaBatalla()
    charmander.recibeDano(mewtwo.atk)
}

class Pokemon(
    val nombre: String,
    var atk: Int,
    var hp: Int
){
    fun SePreparaParaLaBatalla(){
        println("El $nombre se prepara para la battalla")
    }
    fun informacion(){
        println("$nombre - ATK:$atk HP:$hp")
    }
    fun recibeDano(dano: Int){
        println("$nombre recibe $dano puntos de daño")
        hp = hp - dano
        println("Ahora le quedan $hp puntos")
        if(hp<0){
            println("$nombre SE HA DEBILITADO !!!")
        }
    }

}