package book.headfirst.chapter6

class CeilingFan(val location: String) {
    private var speed: Int = OFF

    fun high() {
        speed = HIGH
        println("선풍기 속도 HIGH")
    }

    fun medium() {
        speed = MEDIUM
        println("선풍기 속도 MEDIUM")
    }

    fun low() {
        speed = LOW
        println("선풍기 속도 LOW")
    }

    fun off() {
        speed = OFF
        println("선풍기 OFF")
    }

    fun getSpeed(): Int {
        return speed
    }

    companion object {
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }
}

class CeilingFanHighCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: Int = ceilingFan.getSpeed()

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.high()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}

class CeilingFanMediumCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: Int = ceilingFan.getSpeed()

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.medium()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed: Int = ceilingFan.getSpeed()

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.off()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}