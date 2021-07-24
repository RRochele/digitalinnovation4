package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String= "Jether"
    var cpf: String = "123.123.123-11"

    inner class Endereco {
        var rua: String = "rua teste"
    }
}

fun main() {
    val jether= Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.Endereco().rua)

}

