package book.headfirst.chapter6

interface Command {
    fun execute()

    fun undo()
}

class NoCommand : Command {
    override fun execute() {
    }

    override fun undo() {
    }
}

