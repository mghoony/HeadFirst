package book.headfirst.chapter3

import org.junit.jupiter.api.Test

class StarbuzzCoffeeTest {

    @Test
    fun `main test`() {
        val beverage = Espresso()
        println("${beverage.getDescription()} \$${beverage.cost()}")

        val beverage2 = Whip(Mocha(Mocha(DarkRoast())))
        println("${beverage2.getDescription()} \$${beverage2.cost()}")

        val beverage3 = Whip(Mocha(Soy(HouseBlend())))
        println("${beverage3.getDescription()} \$${beverage3.cost()}")
    }
}