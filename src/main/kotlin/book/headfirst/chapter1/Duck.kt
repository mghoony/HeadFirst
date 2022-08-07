package book.headfirst.chapter1

abstract class Duck(
    private val flyBehavior: FlyBehavior,
    private val quackBehavior: QuackBehavior
) {

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun swim() {
        println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")
    }
}