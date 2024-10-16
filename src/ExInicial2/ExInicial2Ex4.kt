import utils.RED
import utils.RESET

/**
 * @author Dani Alarcón
 */
//Algoritme que demana una nota entre 0 i 10, i mostra si és un suspès (0-4), un suficient
// (5), un bé (6), un notable (7-8) o un excel·lent (9-10).
fun main() {
    /* Codi fent servir if else i amb decimals

    println("Escriu la teva nota del examen")
    var nota: Float

    nota = readln().toFloat()

    if (nota < 5) {
        println("Suspès amb un: $nota")
    } else if (nota < 6 ) {
        println("Suficient")
    } else if (nota < 7) {
        println("Be")
    }else if (nota <=8.9){
        println("Notable")
    }else if (nota <=10){
        println("Exel·lent")
    }




    */

    //Mateix exercici pero fent servir when
    var nota: Int
    do {
        println("Escriu la teva nota del examen")
        nota = readln().toInt()
        when (nota) {
            0, 1, 2, 3, 4 -> println("${RED}Insuficient: $nota${RESET}")
            5 -> println("Suficient")
            6 -> println("Bé")
            7, 8 -> println("Notable: $nota")
            9, 10 -> println("Excel·lent: $nota")
            else -> println("Nota incorrecta")
        }
    }while (nota <0 || nota>10)



}
