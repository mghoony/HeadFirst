package book.headfirst.chapter7

class Car(
    private val engine: Engine  //1. Car 클래스의 구성 요소. engine의 method는 호출 가능
) {

    fun start(key: Key) {   //2. key는 매개변수로 전달된 객체. key의 method는 호출 가능
        val doors = Doors() //3. doors는 내부에서 생성된 객체. doors의 method는 호출 가능
        if (key.turns()) {  //2에 의해 호출 가능
            engine.start()  //1에 의해 호출 가능
            updateDashboardDisplay()    //4. 객체 내부의 method는 호출 가능
            doors.lock()    //3에 의해 호출 가능
        }
    }

    fun updateDashboardDisplay() {

    }
}

class Doors() {
    fun lock() {

    }
}

interface Engine {

    fun start()
}

interface Key {
    fun turns(): Boolean
}