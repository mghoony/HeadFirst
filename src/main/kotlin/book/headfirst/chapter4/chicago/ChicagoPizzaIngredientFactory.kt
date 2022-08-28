package book.headfirst.chapter4.chicago

import book.headfirst.chapter4.*

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(Spinach(), BlackOlives(), EggPlant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicePepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}