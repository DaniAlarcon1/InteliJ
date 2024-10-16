package `M3-A02`

import utils.*
import java.util.*

/**
 * @author Dani Alarcón
 * Menu d'exercicis: M3-A07-Primers exercicis d'algorítmica I en Kotlin
 **/
fun main () {
    val menu = "*****************************************\n" +
            "MENÚ PRINCIPAL:\n"+
            "1 . Algoritme que demana 10 números (amb un bucle) entre 0 i 10 i al final mostra per pantalla quants d'aquests eren inferiors a 5 i quants iguals o superiors.\n" +
            "2 . Algoritme igual a l'anterior, però al final diu quants insuficients, quants suficients, quants bé, quants notables i quants excel·lents.\n" +
            "3 . Algoritme d'una aplicació que demana el preu de 10 productes, i finalment mostra el preu mitjà.\n" +
            "4 . Algoritme igual a l'anterior, mostrant al final el preu menor i el major.\n" +
            "5 . Sortir del programa.\n"


    var exercici: Int

    do {
        println(menu)
        println("Escriu el numero d'exercici que vols executar, nomès numeros del 1 al 4, o 7 per sortir del programa")
        exercici = readln().toInt()
        when (exercici) {
            1 -> //Algoritme que demana 10 números (amb un bucle) entre 0 i 10 i al final mostra per pantalla quants d'aquests eren inferiors a 5 i quants iguals o superiors.
            {   var inferior = 0
                var superiorIgual = 0
                for (i in 1..10) {
                    println("Escriu un numero del 0 al 10")
                    //var numero = readln().toInt()
                    val scan: Scanner = Scanner (System.`in`)
                    var numero = scan.nextInt()
                    if (scan.hasNextInt()){
                        println("hola")
                    }else {
                        println("adios")
                    }

                    if (numero < 5){
                        inferior += 1
                    }
                    if (numero >= 5){
                        superiorIgual += 1
                    }

                }
                println("Numeros inferiors a 5: $inferior")
                println("Numeros superiors o iguals a 5: $superiorIgual")
            }

            2 -> //Algoritme igual a l'anterior, però al final diu quants insuficients, quants suficients, quants bé, quants notables i quants excel·lents.
            {println("Escriu una paraula, es repetira 100 vegades")
                val paraula = readln().toString()
                for (i in 1.. 100 )
                    println("$BLUE$i, $paraula$RESET")}

            3 -> //Algoritme d'una aplicació que demana el preu de 10 productes, i finalment mostra el preu mitjà.
            {println("Escriu la teva edat")
                val edat = readln().toInt()
                for (i in 1.. edat ) println("$YELLOW$i${RESET}")}

            4 -> //Algoritme igual a l'anterior, mostrant al final el preu menor i el major.
            {println("Escriu un numero, es mostraràn tots els numeros fins arribar a 0")
                val num = readln().toInt()
                for (i in num downTo 0 )
                    println("${YELLOW_BOLD}$i${RESET}")}

            5 -> //Sortir
            {println("Adeu, fins aviat")
            }

            else -> println("Aquest exercici no existeix")
        }
    }while (exercici !=5)
}