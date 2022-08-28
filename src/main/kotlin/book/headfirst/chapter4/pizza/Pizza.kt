package book.headfirst.chapter4.pizza

import book.headfirst.chapter4.*

abstract class Pizza(
    val name: String,
    val dough: Dough,
    val sauce: Sauce,
    val cheese: Cheese,
    val pepperoni: Pepperoni? = null,
    val clam: Clams? = null
) {
    abstract fun prepare()

    open fun bake() {
        println("175에서 25분 간 굽기")
    }

    open fun cut() {
        println("피자를 사선으로 자르기")
    }

    open fun box() {
        println("상자에 피자 담기")
    }
}