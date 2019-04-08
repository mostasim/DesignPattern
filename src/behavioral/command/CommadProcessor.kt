package behavioral.command

import java.util.*

class CommadProcessor {
    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): CommadProcessor =
        apply {
            queue.add(orderCommand)
        }

    fun processCommands(): CommadProcessor =
        apply {
            queue.forEach{it.execute()}
            queue.clear()
        }
}