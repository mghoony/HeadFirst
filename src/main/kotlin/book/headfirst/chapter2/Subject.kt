package book.headfirst.chapter2

interface Subject {
    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObserver()
}