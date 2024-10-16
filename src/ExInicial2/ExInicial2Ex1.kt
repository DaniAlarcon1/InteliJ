/**
 * @author Dani Alarcón
 */

//Algoritme que demana l'edat, i mostra missatges diferents en
// funció de si s'és major d'edat o menor.
fun main() {
    println("Escriu la teva edat")
    var edat:Float

    edat = readln().toFloat()

    if (edat >= 18){
        println("Ets major d'edat")
    }else{
        println("Ets menor d'edat")
    }

}