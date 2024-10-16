package proves

import java.util.Scanner

fun main() {
    var x: Int = 0
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean = false
    do {
        println("Escriu un enter entre 0 i 10")

        valorCorrecte = lector.hasNextInt()

        if (valorCorrecte == false){
            println("Error, has escrit ${lector.nextLine()}!!")
        }
        do {
            println("Error, introdueix un numero que estigui entre 0 i 10, has escrit $x")
            x = lector.nextInt()
        }while (x< 0 || x>10 || valorCorrecte == false)

    }while (valorCorrecte == false)
    x = lector.nextInt()
    print("Has escrit el numero $x")
}