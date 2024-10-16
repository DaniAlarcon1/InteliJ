package proves

import java.util.*

/**
 *Escriu un programa que llegeixi una data de naixement i ens digui el signe zodiacal corresponent.
 *Has d’assegurar-te que l’usuari introdueix una data de naixement correcta.
 *
 * @author Dani Alarcon
 * @since 8/10/2024
 *
 * **/
fun main() {
    var mes: Int = 0
    var dia: Int = 0
    var any: Int = 0
    val lector: Scanner = Scanner(System.`in`)
    var mesCorrecte: Boolean = false
    var diaCorrecte: Boolean = false
    var anyCorrecte: Boolean = false

    do {
        do {
            println("Escriu teu any de neixement, ha se ser un numero entre 1900 i 2024")
            anyCorrecte = lector.hasNextInt()
            if (anyCorrecte == false){
                println("Error, has escrit ${lector.nextLine()}!!, any no valid")
            }
        }while (anyCorrecte == false)
        any = lector.nextInt()
    }while (any < 1900 || any >2024)

    do {
        println("Escriu teu mes de neixement")
        mesCorrecte = lector.hasNextInt()
        if (mesCorrecte == false){
            println("Error, has escrit ${lector.nextLine()}, mes no valid!!")
        }
    }while (mesCorrecte == false)

    mes = lector.nextInt()
    while (mes <0 || mes > 12){
        println("$mes, no es valid, torna a escriure")
        mes = lector.nextInt()
    }
    when (mes) {
        1 -> println("Ets Capricornio")
        2 -> println("Ets Aquario")
        3 -> println("Ets Piscis")
        4 -> println("Ets Aries")
        5 -> println("Ets Tauro")
        6 -> println("Ets Geminis")
        7 -> println("Ets Cancer")
        8 -> println("Ets Leo")
        9 -> println("Ets Virgo")
        10 -> println("Ets Libra")
        11 -> println("Ets Escorpio")
        12 -> println("Ets Sagitario")

        else -> println("Has introduit $mes, i aquest mes no existeix")
    }
    do {
        println("Escriu teu dia de neixement")
        diaCorrecte = lector.hasNextInt()
        if (diaCorrecte == false){
            println("Error, has escrit ${lector.nextLine()}, dia no valid!!")
        }
    }while (diaCorrecte == false)
    dia = lector.nextInt()

    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
        while (dia > 31){
            println("Aquest mes no pot tenir més de 31 dies, torna a introduir el dia")
            dia = lector.nextInt()
        }
    }else {
        while (dia > 30){
            println("Aquest mes no pot tenir més de 30 dies, torna a introduir el dia")
            dia = lector.nextInt()
        }
    }

    if (mes == 2){
        while (dia > 29){
            println("Febrer no pot tenir més de 29 dies, torna a introduir el dia")
            dia = lector.nextInt()
        }
    }



    println("La teva data de neixement es $dia/$mes/$any")


}