package book.headfirst.chapter6

class GarageDoor {
    fun up() {
        println("문이 올라갑니다.")
    }

    fun down() {
        println("문이 내려갑니다.")
    }

    fun stop() {
        println("문이 멈춥니다.")
    }

    fun lightOn() {
        println("불이 켜집니다.")
    }

    fun lightOff() {
        println("불이 꺼집니다.")
    }
}

class GarageDoorOpenCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }

    override fun undo() {
        garageDoor.down()
    }
}