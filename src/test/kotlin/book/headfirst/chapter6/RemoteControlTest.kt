package book.headfirst.chapter6

import org.junit.jupiter.api.Test

class RemoteControlTest {

    @Test
    fun `lightCommand test`() {
        val simpleRemoteControl = SimpleRemoteControl(LightOnCommand(Light("거실")))
        simpleRemoteControl.buttonWasPressed()
    }

    @Test
    fun `garageCommand test`() {
        val simpleRemoteControl = SimpleRemoteControl(GarageDoorOpenCommand(GarageDoor()))
        simpleRemoteControl.buttonWasPressed()
    }
}