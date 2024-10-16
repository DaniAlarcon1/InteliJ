//Algoritme que demana les dades d'una piscina i m
// mostra el volum en metres cúbics i en litres d'aigua.

fun main() {

    var llarg:Float
    var amplada:Float
    var fondaria:Float
    var volum:Float


    println("Escriu el llarg de la piscina ")
    llarg = readln().toFloat()

    println("Escriu l'amplada de la piscina ")
    amplada = readln().toFloat()

    println("Escriu la fondaria de la piscina ")
    fondaria = readln().toFloat()

    volum = llarg * amplada * fondaria

    println("Volum en metres cubics: $volum ")
    println("La capacitat en llitres es de : " + (volum * 1000))

}