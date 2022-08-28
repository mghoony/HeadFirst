package book.headfirst.chapter4.ny

import book.headfirst.chapter4.PizzaIngredientFactory
import book.headfirst.chapter4.PizzaStore
import book.headfirst.chapter4.pizza.CheesePizza
import book.headfirst.chapter4.pizza.Pizza

class NYPizzaStore : PizzaStore() {
    private val ingredientFactory = NYPizzaIngredientFactory()

    override fun createPizza(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> NYStyleCheesePizza(ingredientFactory)
        }
    }

    class NYStyleCheesePizza(ingredientFactory: PizzaIngredientFactory) : CheesePizza(
        "뉴욕 스타일 치즈 피자",
        ingredientFactory
    )
}