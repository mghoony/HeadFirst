package book.headfirst.chapter4.pizza

import book.headfirst.chapter4.PizzaIngredientFactory

abstract class CheesePizza(
    name: String,
    pizzaIngredientFactory: PizzaIngredientFactory,
) : Pizza(
    name,
    pizzaIngredientFactory.createDough(),
    pizzaIngredientFactory.createSauce(),
    pizzaIngredientFactory.createCheese()
) {
    override fun prepare() {
        println("준비 중: $name")
    }
}