package book.headfirst.chapter2

class CurrentConditionDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("현재 상태: 온도 ${temperature}F, 습도 ${humidity}%")
    }

    override fun update() {
        this.temperature = weatherData.getTemperature()
        this.humidity = weatherData.getHumidity()
        this.display()
    }
}