//Algoritme que demana dos números i mostra el resultat de la suma, la resta,
// la multiplicació i la divisió d'ells dos.
fun main() {
    println("Escriu un numero")
    var numero:Int
    var segonNumero:Int

    numero = readln().toInt()

    println("Escriu un altre numero per poder operar")
    segonNumero = readln().toInt()

    println("Suma = " + (numero + segonNumero))
    println("Resta =  " + (numero - segonNumero))
    println("Multiplicació =  " + (numero * segonNumero))
    println("Divisió = " + (numero / segonNumero))

}