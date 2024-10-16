package `M3-A07`

import utils.*

/**
 * @author Dani Alarcón
 * Menu d'exercicis: M3-A07-Primers exercicis d'algorítmica I en Kotlin
 **/
fun main () {
    val menu = "*****************************************\n" +
            "MENÚ PRINCIPAL:\n"+
            "1 . Algoritme que mostra els números del 10 al 0, i al final, BOOOOOM!!\n" +
            "2 . Algoritme que demana una paraula a l'usuari i la mostra 100 vegades.\n" +
            "3 . Algoritme que demana l'edat i mostra els anys que aquest ha anat complint (1, 2, 3...).\n" +
            "4 . Algoritme que demana un número, i mostra seqüencialment des d'aquest número fins al 0 (inclòs).\n" +
            "5 . Algoritme que mostra la taula de multiplicar del 3.\n" +
            "6 . Algoritme que demana un número i mostra per pantalla la seva taula de multiplicar.\n" +
            "7 . Sortir del programa.\n"


    var exercici: Int

    do {
        println(menu)
        println("Escriu el numero d'exercici que vols executar, nomès numeros del 1 al 6, o 7 per sortir del programa")
        exercici = readln().toInt()
        when (exercici) {
            1 -> //Algoritme que mostra els números del 10 al 0, i al final, BOOOOOM!!
                {for (i in 10 downTo  0 step 1) println("$i")
                println("${RED_BOLD}BOOOOOM!${RESET}")}

            2 -> //Algoritme que demana una paraula a l'usuari i la mostra 100 vegades.
                {println("Escriu una paraula, es repetira 100 vegades")
                val paraula = readln().toString()
                for (i in 1.. 100 )
                println("$BLUE$i, $paraula$RESET")}

            3 -> //Algoritme que demana l'edat i mostra els anys que aquest ha anat complint (1, 2, 3...).
                {println("Escriu la teva edat")
                val edat = readln().toInt()
                for (i in 1.. edat ) println("$YELLOW$i${RESET}")}

            4 -> //Algoritme que demana un número, i mostra seqüencialment des d'aquest número fins al 0 (inclòs).
                {println("Escriu un numero, es mostraràn tots els numeros fins arribar a 0")
                    val num = readln().toInt()
                    for (i in num downTo 0 )
                    println("${YELLOW_BOLD}$i${RESET}")}

            5 -> //Algoritme que mostra la taula de multiplicar del 3.
                {for (i in 1.. 10){
                    var resultado = i * 3
                    println("3 * $i = $resultado")
                }}

            6 -> {
                println("Escriu un numero per fer la seva taula de multiplicar")
                val num = readln().toInt()
                for (i in 1.. 10){
                    var resultado = i * num
                    println("$num * $i = $resultado")
                }
            }
            7 -> {
                println("Adeu, fins aviat")
            }
            else -> println("Aquest exercici no existeix")
        }
    }while (exercici !=7)
}