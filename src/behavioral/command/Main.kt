package behavioral.command

fun main() {
    CommadProcessor()
        .addToQueue(OrderAddCommand(1L))
        .addToQueue(OrderAddCommand(2L))
        .addToQueue(OrderPayCommand(1L))
        .addToQueue(OrderPayCommand(2L))
        .processCommands()
}