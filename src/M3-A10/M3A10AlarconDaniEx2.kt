package `M3-A10`

import java.util.*

/**
 *Programa per fer diferents operacions amb triangles
 *
 * @author Dani Alarcón
 * @since 10/10/2024
 *
 * **/
fun main() {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var exercici:Int = 0
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean = false


    val menu = "*****************************************\n" +
            "MENÚ PRINCIPAL:\n"+
            "1 . Introduir longituds d’un triangle per comprovar que puguin correspondre als costats d'un triangle.\n" +
            "2 . Comprovar si és triangle rectangle i diu la seva hipotenusa.\n" +
            "3 . Classificar d’acord als seus costats en equilàter, isòsceles o escalè.\n" +
            "4 . Calcular perímetre i àrea\n" +
            "5 . Sortir del programa.\n"

    do {
        println (menu)
        println ("Introdueix el numero d'exercici que vols fer, o 5 si vols sortir del programa")
        exercici = lector.nextInt()

        when (exercici) {
            1 -> {
                do {
                    println("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                a = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                b = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                c = lector.nextInt()
                lector.nextLine()
                if ((a-c) < b && b < (a+c)){
                    println ("$a, $b, i $c, si poden formar un triangle")
                }else{
                    println ("$a, $b, i $c, no poden formar un triangle")
                }
            }
            2 -> {
                do {
                    println("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                a = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                b = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                c = lector.nextInt()
                lector.nextLine()
                if ((a-c) < b && b < (a+c)){
                    println ("$a, $b, i $c, si poden formar un triangle")
                    if((a * a)== (b * b + c * c)) {
                        // Exemple: 5 3 i 4 formen un triangle rectangle
                        println("Hipotenusa: $a")
                        println("Catet: $b, $c")
                        println ("Es rectangle")
                    }else{
                        println ("No  es rectangle")
                    }
                }else{
                    println ("$a, $b, i $c, no poden formar un triangle")
                }
            }

            3 -> {
                do {
                    println("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                a = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                b = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                c = lector.nextInt()
                lector.nextLine()
                if ((a-c) < b && b < (a+c)){
                    println ("$a, $b, i $c, si poden formar un triangle")
                    if (a == b && b == c){
                        println ("Es equilatèr")
                    }else if (a !=b && b !=c){
                        println ("Es escalè")
                    }else if (a ==b || b ==c || a == c){
                        println ("Es isosceles")
                    }
                }else{
                    println ("$a, $b, i $c, no poden formar un triangle")
                }


            }
            4 -> {
                do {
                    println("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                a = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                b = lector.nextInt()
                lector.nextLine()

                do {
                    println("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println ("ERROR: Introdueix un número")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                c = lector.nextInt()
                lector.nextLine()
                if ((a-c) < b && b < (a+c)){
                    println ("$a, $b, i $c, si poden formar un triangle")
                    val perimetre = a + b + c
                    println ("El perímetre del triangle es : $perimetre")

                    val semiP = perimetre / 2
                    val area = (semiP * (semiP - a) * (semiP - b) * (semiP - c))
                    println ("L'area del triangle es: $area")
                }else{
                    println ("$a, $b, i $c, no poden formar un triangle")
                }

            }
            5 -> println ("Fins aviat")

            else -> println ("Has introduit , $exercici i aquest exercici no existeix.")
        }
    }while (exercici != 5)




}