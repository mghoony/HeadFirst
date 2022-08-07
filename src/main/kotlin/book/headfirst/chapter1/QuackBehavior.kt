package book.headfirst.chapter1

interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        println("꽥")
    }
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("조용")
    }
}

class Squack : QuackBehavior {
    override fun quack() {
        println("삑")
    }
}