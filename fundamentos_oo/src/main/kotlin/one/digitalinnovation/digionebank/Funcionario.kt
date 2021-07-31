package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) :Pessoa(nome, cpf) {

    abstract fun  calculoauxilio():

    abstract open fun calculoAuxilio(): Double
}
