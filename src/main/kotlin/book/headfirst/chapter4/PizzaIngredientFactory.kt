package book.headfirst.chapter4

interface PizzaIngredientFactory {

    fun createDough(): Dough

    fun createSauce(): Sauce

    fun createCheese(): Cheese

    fun createVeggies(): List<Veggies>

    fun createPepperoni(): Pepperoni

    fun createClam(): Clams
}