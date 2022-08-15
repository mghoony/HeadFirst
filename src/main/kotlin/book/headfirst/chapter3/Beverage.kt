package book.headfirst.chapter3

abstract class Beverage {
    abstract fun getDescription(): String

    abstract fun cost(): Double
}

class Espresso : Beverage() {
    override fun getDescription(): String {
        return "에스프레소"
    }

    override fun cost(): Double {
        return 1.99
    }
}

class HouseBlend : Beverage() {
    override fun getDescription(): String {
        return "하우스 블렌드 커피"
    }

    override fun cost(): Double {
        return 0.89
    }
}

class DarkRoast : Beverage() {
    override fun getDescription(): String {
        return "다크로스트"
    }

    override fun cost(): Double {
        return 0.99
    }
}

class Decaf : Beverage() {
    override fun getDescription(): String {
        return "디카페인"
    }

    override fun cost(): Double {
        return 1.05
    }
}