//Algoritme que demana un preu en € i el torna en £.

fun main() {
    println("Escriu un preu en euros per convertir-lo en liures ")
    var euros:Float

    euros = readln().toFloat()

    println("Conversio = " + (euros * 0.83))

}