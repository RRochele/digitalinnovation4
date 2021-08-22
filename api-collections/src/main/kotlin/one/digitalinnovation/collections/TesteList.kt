package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")

    val funcionarios= listOf(joao,maria,pedro)
    funcionarios.forEach { println(it) }

    println("----------------------------")

    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------------")
    funcionarios.sortedBy { it.salario }
    funcionarios.forEach { println(it) }

    println("----------------------------")
    funcionarios.groupBy { it.tipoContratacao }
    funcionarios.forEach { println(it) }


}


