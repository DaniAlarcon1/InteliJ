//Algoritme que demana una distància en metres
// i mostra per pantalla la conversió a milles marines.

fun main() {

   /*
    if (decisio == 1){
        println("Escriu una distancia en metres per convertir-lo a milles marines")
        var numero:Float

        numero = readln().toFloat()

        println("Conversio = " + (numero * 1852) + " milles marines")
    }else if (decisio == 2){
        println("Escriu una distancia en milles marines per convertir-lo a metres ")
        var numero:Float

        numero = readln().toFloat()

        println("Conversio = " + (numero * 1852) + " metres")
    }else if (decisio <1 || decisio>2){
        println("Has introduit una opció no valida")
    }
    */
    var menu: String = ("1. Convertir de metres a milles marines \n2. Convertir milles marines a metres.")
    var decisio:Int
    var distancia:Float


    do {
        println(menu)
        decisio = readln().toInt()
        if (decisio <1 || decisio>2){
            println("Opcio no valida")
        }
    }while ((decisio <1) || (decisio > 2))

    when (decisio){
        1 -> {
            println("Escriu una distancia en metres per convertir-lo a milles marines")
            distancia = readln().toFloat()
            println("Conversio = " + (distancia * 1852) + " milles marines")
        }
        2 -> {
            println("Escriu una distancia en milles marines per convertir-lo a metres ")
            var numero:Float

            numero = readln().toFloat()

            println("Conversio = " + (numero * 1852) + " metres")
        }
    }




}