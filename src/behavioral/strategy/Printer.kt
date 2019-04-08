package behavioral.strategy

class Printer(private val stringFormatStrategy: (String)-> String) {

    fun printString(string: String){
        println(stringFormatStrategy(string))
    }

}

