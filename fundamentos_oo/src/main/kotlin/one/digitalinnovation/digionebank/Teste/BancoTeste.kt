package one.digitalinnovation.digionebank.Teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(
    "DigiOne", 14)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy( "Banco2")

    println(banco2.info())

}
