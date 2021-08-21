package one.digitalinnovation.collections

import java.sql.DriverManager.println

fun main() {
    val nomes = Array( 3){""}
    nomes[0] = "Maria"
    nomes[1]= "José"
    nomes[2] = "João"

    for (nome in nomes) {
        println(nome)

    }
    println("------------------")
    nomes.sort()
    nomes.forEach {println(it)}

    val nomes2 = arrayOf("Maria", "José", "João")
    println("------------------")
    nomes2.sort()
    nomes2.forEach {println(it)}
}