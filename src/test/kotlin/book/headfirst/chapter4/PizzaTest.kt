package book.headfirst.chapter4

import book.headfirst.chapter4.chicago.ChicagoPizzaStore
import book.headfirst.chapter4.ny.NYPizzaStore
import org.junit.jupiter.api.Test

class PizzaTest {

    @Test
    fun `pizza test`() {
        println("에단이 주문한 ${NYPizzaStore().orderPizza(PizzaStore.PizzaType.CHEESE).name}\n")
        println("조엘이 주문한 ${ChicagoPizzaStore().orderPizza(PizzaStore.PizzaType.CHEESE).name}\n")
    }
}