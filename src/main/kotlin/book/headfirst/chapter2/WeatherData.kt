package book.headfirst.chapter2

class WeatherData : Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    override fun registerObserver(observer: Observer) {
        this.observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        this.observers.remove(observer)
    }

    override fun notifyObserver() {
        observers.forEach {
            it.update()
        }
    }

    fun measureChanged() {
        notifyObserver()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measureChanged()
    }

    fun getTemperature(): Float = this.temperature

    fun getHumidity(): Float = this.humidity

    fun getPressure(): Float = this.pressure
}