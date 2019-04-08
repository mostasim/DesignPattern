package behavioral.observer_listener

import kotlin.properties.Delegates

class TextView {

    var listener: TextChangeListener? = null

    var text: String by Delegates.observable("empty") { _, old, new ->
        listener?.onTextChange(old, new)
    }

}