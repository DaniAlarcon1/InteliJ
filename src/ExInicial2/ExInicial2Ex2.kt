/**
 * @author Dani Alarcón
 */

//Algoritme que demana un número entre 0 i 10,
// i dona error si és menor de 0 o major de 10.

fun main() {
    println("Escriu un numero entre 0 i 10")
    var num:Float

    num = readln().toFloat()

    if (num > 10 || num < 0 ){
        println("Error, el numero es major que 10 o menor 0")
    }else{
        println("Has introduit el numero $num")
    }

}