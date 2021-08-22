package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )


    println("------------------------------")
    println("O somatorio é:" +salarios.somatoria())

    println("------------------------------")
    println("A média é:" + salarios.media())
}