package behavioral.mediator

fun main() {
    val mediator = ChatMediator()
    val john = ChatUser(mediator, "John")

    mediator
        .addUser(ChatUser(mediator, "Alice"))
        .addUser(ChatUser(mediator, "Bob"))
        .addUser(john)
    john.send("Hi everyone!")
}