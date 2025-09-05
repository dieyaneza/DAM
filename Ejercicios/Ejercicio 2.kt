package Ejercioios

data class Pokemon(
    val nombre: String,
    val nivel: Int,
    val tipo: String
)

fun main() {
    val listaPokemones = listOf(
        Pokemon("charmander", 5, "fuego"),
        Pokemon("pikachu", 20, "eléctrico"),
        Pokemon("mew", 80, "psíquico"),
        Pokemon("magmar", 70, "fuego")
    )

    println("Pokemones de tipo fuego:")
    for (p in listaPokemones) {
        if (p.tipo == "fuego") {
            println(p)
        }
    }

    println("\nPokemones con nivel >= 30:")
    for (p in listaPokemones) {
        if (p.nivel >= 30) {
            println(p)
        }
    }

    println("\nPokemones con nivel par:")
    for (p in listaPokemones) {
        if (p.nivel % 2 == 0) {
            println(p)
        }
    }
}
