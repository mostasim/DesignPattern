package behavioral.memento

fun main() {
    val originator = Originator("initial state")
    val careTaker = CareTaker()
    careTaker.saveState(originator.createMemento())

    originator.state = "State #1"
    originator.state = "State #2"
    careTaker.saveState(originator.createMemento())

    originator.state = "State #3"
    println("Current State: " + originator.state)
    //assertThat(originator.state).isEqualTo("State #3")

    originator.restore(careTaker.restore(1))
    println("Second saved state: " + originator.state)
    //assertThat(originator.state).isEqualTo("State #2")

    originator.restore(careTaker.restore(0))
    println("First saved state: " + originator.state)
}