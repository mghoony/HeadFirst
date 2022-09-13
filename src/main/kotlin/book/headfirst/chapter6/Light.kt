package book.headfirst.chapter6

class Light(val name: String) {
    fun on() {
        println("조명이 켜졌습니다.")
    }

    fun off() {
        println("조명이 꺼졌습니다.")
    }
}

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}