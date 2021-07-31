package one.digitalinnovation.digionebank.Teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario

fun main(){
    val joao = Analista( "João Pedro", "123.123.123-11",  2000.0)
   ImprimeRelatorioFuncionario.imprime(joao)
}
