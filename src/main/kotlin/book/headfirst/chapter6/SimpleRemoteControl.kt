package book.headfirst.chapter6

class SimpleRemoteControl(private val slot: Command) {

    fun buttonWasPressed() {
        slot.execute()
    }
}