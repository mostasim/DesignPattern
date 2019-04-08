package behavioral.observer_listener

class PrintingTextChangeListener : TextChangeListener {

    override fun onTextChange(oldText: String, newText: String) = println("Text is changed $oldText -> $newText")

}