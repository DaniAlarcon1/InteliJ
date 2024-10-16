package `M3-A10`

import java.util.*

/**
 *Programa per treballar amb numeros primers
 *
 * @author Dani Alarcón
 * @since 10/10/2024
 *
 * **/

import java.util.Scanner


fun main() {
    var numUser: Int
    var numPrimer: Boolean
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean

    // Validar entrada del usuario
    do {
        do {
            println("Introdueix un número major a 1")
            valorCorrecte = lector.hasNextInt()
            if (!valorCorrecte) {
                println("ERROR: Introdueix un número valid")
                lector.nextLine()
            }
        } while (!valorCorrecte)

        numUser = lector.nextInt()
        lector.nextLine()

        if (numUser <= 1) {
            println("El número ha de ser major a 1.")
        }
    } while (numUser <= 1)

    //Sin el Math.sqrt no funciona no se muy bien porque, lo he encontrado en una pagina y ha ido bien.

    fun esPrimer(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }

    numPrimer = esPrimer(numUser)

    // Hace lo de esPrimer para ver si es primer o no
    if (numPrimer) {
        println("El numero $numUser és un número primer.")
    } else {
        println("El número $numUser no és un número primer.")

        // Buscar el otro
        do {
            numUser++
        } while (!esPrimer(numUser))

        println("El primer immediatament superor és $numUser.")
    }
}

