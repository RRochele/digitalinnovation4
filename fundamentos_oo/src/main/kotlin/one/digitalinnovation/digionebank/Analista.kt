package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoauxilio(): abstract  {
        TODO("Not yet implemented")
    }

    override fun calculoAuxilio() = salario * 0.1
}

