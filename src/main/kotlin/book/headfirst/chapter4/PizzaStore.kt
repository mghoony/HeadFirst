package book.headfirst.chapter4

import book.headfirst.chapter4.pizza.Pizza

abstract class PizzaStore {

    fun orderPizza(type: PizzaType): Pizza {
        return createPizza(type).apply {
            prepare()
            bake()
            cut()
            box()
        }
    }

    protected abstract fun createPizza(type: PizzaType): Pizza

    enum class PizzaType {
        CHEESE
    }
}