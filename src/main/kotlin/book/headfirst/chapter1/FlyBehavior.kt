package book.headfirst.chapter1

interface FlyBehavior {
    fun fly()
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("날고 있어요!!")
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("저는 못 날아요.")
    }
}