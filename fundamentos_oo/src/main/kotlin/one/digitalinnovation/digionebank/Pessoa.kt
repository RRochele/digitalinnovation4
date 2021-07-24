package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String= "Jether"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val jether= Pessoa()
    //criando um atributo que recebe a instancia de uma pessoa e quando ela recebe esta instancia esta atribuido na variavel jether uma referencia na memoria que vai ter esse estado : nome jether mais cpf

    println(jether.nome)
    println(jether.cpf)
    //consigo representar dentro do dominio da nossa aplicação da interface
}

