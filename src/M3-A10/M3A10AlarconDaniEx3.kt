package `M3-A10`

import java.util.*

/**
 *Programa per treballar amb numeros primers
 *
 * @author Dani Alarcón
 * @since 10/10/2024
 *
 * **/

fun main(){
    var numUser: Int = 0
    var numPrimer: Boolean = true
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean = false


    do {
        do {
            println("Introdueix un numero major a 1")
            valorCorrecte = lector.hasNextInt()
            if (valorCorrecte == false) {
                println ("ERROR: Introdueix un número")
                lector.nextLine()
            }
        } while (valorCorrecte == false)
        numUser = lector.nextInt()
        lector.nextLine()
        if (numUser <= 1){
            println("El numero ha de ser major a 1.")
        }
    }while (numUser <= 1)

    var i: Int = 2
    do {
        if ((numUser % i) == 0 ) numPrimer = false
        else i++

    }while (i < numUser && numPrimer)

    println("El numero $numUser es $numPrimer que sigui primer")

}