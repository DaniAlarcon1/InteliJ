//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Escriu un numero")
    var numero:Int

    numero = readln().toInt()

    var anterior = numero - 1
    var posterior = numero + 1

    println("Posterior " + (numero + 1))
    println("Anterior " + (numero - 1))

    println("El numero anterior es , $anterior!")
    println("El numero posterior es , $posterior!")


}