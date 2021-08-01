package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
fun main() {
    val jose = Cliente(
        nome= "José da silva",
        "123.12.123-46",
        ClienteTipo.PF,
        "123455"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}