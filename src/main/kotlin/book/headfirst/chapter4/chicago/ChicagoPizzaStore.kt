package book.headfirst.chapter4.chicago

import book.headfirst.chapter4.PizzaIngredientFactory
import book.headfirst.chapter4.pizza.Pizza
import book.headfirst.chapter4.PizzaStore
import book.headfirst.chapter4.pizza.CheesePizza

class ChicagoPizzaStore : PizzaStore() {
    private val ingredientFactory = ChicagoPizzaIngredientFactory()

    override fun createPizza(type: PizzaType): Pizza {
        return when (type) {
            PizzaType.CHEESE -> ChicagoStyleCheesePizza(ingredientFactory)
        }
    }

    class ChicagoStyleCheesePizza(
        ingredientFactory: PizzaIngredientFactory
    ) : CheesePizza("시키고 스타일 치즈피자", ingredientFactory) {

        override fun cut() {
            println("네모난 모양으로 피자 자르기")
        }
    }
}