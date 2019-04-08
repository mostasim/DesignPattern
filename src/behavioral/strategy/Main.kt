package behavioral.strategy

val lowerCaseFormatter: (String) -> String = { it.toLowerCase() }
val upperCaseFormatter: (String) -> String = { it.toUpperCase() }

fun main() {

    val str = "Hello Mostasim"

    val lowerCasePrinter = Printer(lowerCaseFormatter)
    lowerCasePrinter.printString(str)

    val upperCasePrinter = Printer(upperCaseFormatter)
    upperCasePrinter.printString(str)
}