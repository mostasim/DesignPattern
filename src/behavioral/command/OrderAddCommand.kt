package behavioral.command

class OrderAddCommand(val id: Long):OrderCommand {
    override fun execute() = println("Adding oder id with $id")
}