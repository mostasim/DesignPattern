package behavioral.observer_listener

interface TextChangeListener {

    fun onTextChange(oldText: String, newText: String)
}