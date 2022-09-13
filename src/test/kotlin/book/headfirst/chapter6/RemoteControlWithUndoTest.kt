package book.headfirst.chapter6

import org.junit.jupiter.api.Test

class RemoteControlWithUndoTest {

    @Test
    fun `light test`() {
        val remoteControlWithUndo = RemoteControlWithUndo()
        val light = Light("거실")
        remoteControlWithUndo.setCommand(0, LightOnCommand(light), LightOffCommand(light))

        remoteControlWithUndo.onButtonWasPushed(0)
        remoteControlWithUndo.offButtonWasPushed(0)
        remoteControlWithUndo.undoButtonWasPushed()

        remoteControlWithUndo.offButtonWasPushed(0)
        remoteControlWithUndo.onButtonWasPushed(0)
        remoteControlWithUndo.undoButtonWasPushed()
    }

    @Test
    fun `ceilingFan test`() {
        val remoteControlWithUndo = RemoteControlWithUndo()
        val ceilingFan = CeilingFan("거실")
        val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)

        remoteControlWithUndo.setCommand(0, CeilingFanMediumCommand(ceilingFan), ceilingFanOffCommand)
        remoteControlWithUndo.setCommand(1, CeilingFanHighCommand(ceilingFan), ceilingFanOffCommand)

        remoteControlWithUndo.onButtonWasPushed(0)
        remoteControlWithUndo.offButtonWasPushed(0)
        remoteControlWithUndo.undoButtonWasPushed()

        remoteControlWithUndo.onButtonWasPushed(1)
        remoteControlWithUndo.undoButtonWasPushed()
    }
}