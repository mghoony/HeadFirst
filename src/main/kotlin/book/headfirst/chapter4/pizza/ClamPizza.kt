package book.headfirst.chapter4.pizza

import book.headfirst.chapter4.PizzaIngredientFactory

class ClamPizza(
    name: String,
    pizzaIngredientFactory: PizzaIngredientFactory,
) : Pizza(
    name,
    pizzaIngredientFactory.createDough(),
    pizzaIngredientFactory.createSauce(),
    pizzaIngredientFactory.createCheese(),
    null,
    pizzaIngredientFactory.createClam()
) {
    override fun prepare() {
        println("준비 중: $name")
    }
}