package book.headfirst.chapter2

class ForecastDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var currentPressure: Float = 29.92f
    private var lastPressure: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Forecast display")
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.getPressure()
        display()
    }
}