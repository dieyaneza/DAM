package Ejercioios

fun main() {
    val m1: Mascota = Gato("Michi", 3, "naranja")
    val m2: Mascota = Pez("Nemo", 1, true)

    val mascotas: List<Mascota> = listOf(m1, m2)

    for (m in mascotas) {
        m.mostrarInfo()
        when (m) {
            is Gato -> m.correr()
            is Pez -> m.nadar()
        }
        println("----")
    }
}

open class Mascota(
    val nombre: String,
    val edad: Int
) {
    open fun mostrarInfo() {
        println("Mascota: nombre=$nombre, edad=$edad")
    }
}

class Gato(
    nombre: String,
    edad: Int,
    val colorPelaje: String
) : Mascota(nombre, edad) {

    fun correr() {
        println("Miau! $nombre corre feliz 🐱")
    }

    override fun mostrarInfo() {
        println("Gato: nombre=$nombre, edad=$edad, colorPelaje=$colorPelaje")
    }
}

class Pez(
    nombre: String,
    edad: Int,
    val sangreFria: Boolean
) : Mascota(nombre, edad) {

    fun nadar() {
        println("Glue Glue Glue... $nombre nada tranquilo 🐟")
    }

    override fun mostrarInfo() {
        println("Pez: nombre=$nombre, edad=$edad, sangreFria=$sangreFria")
    }
}


