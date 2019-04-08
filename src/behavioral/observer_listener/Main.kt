package behavioral.observer_listener

fun main() {
    var list = PrintingTextChangeListener()
    val textView = TextView().apply {
        listener = list
    }

    with(textView) {
        text = "Hello"
        text = "World"
        text = "Keno"
    }


    var str = "Hello mostasim"
    with(str) {
        println(length)
    }

}
