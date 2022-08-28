package book.headfirst.chapter4.ny

import book.headfirst.chapter4.*

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicePepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}