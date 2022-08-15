package book.headfirst.chapter3

abstract class CondimentDecorator(protected val beverage: Beverage) : Beverage()

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, 모카"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.20
    }
}

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, 두유"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.15
    }
}

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, 휘핑크림"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.10
    }
}

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, 우유"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.10
    }
}