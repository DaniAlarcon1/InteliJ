/**
 * @author Dani Alarcón
 */

//Algoritme que demana una nota entre 0 i 10,
// i mostra si és un aprovat o un suspès.
fun main() {
    println("Escriu la teva nota del examen")
    var nota:Float

    nota = readln().toFloat()

    if (nota < 5 ){
        println("Suspès amb un: $nota")
    }else{
        println("Aprovat amb un: $nota")
    }

}