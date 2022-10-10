# 쓰면서 제대로 공부하기

## P304
다음의 두 클래스가 최소 지식 원칙을 위반하고 있는지 확인해 봅시다. 위반하고 있다면 그 이유도 적어 봅시다.
```
public House {
    WeatherStation station;
    
    //기타 메소드 및 생성자
    
    public float getTemp() {
        //메소드 호출 결과로 리턴된 객체의 메소드를 호출함
        return station.getThermometer().getTemperature(); 
    }
}

public House {
    WeatherStation station;
    
    //기타 메소드 및 생성자
    
    public float getTemp() {
        Thermometer thermometer = station.getThermometer();
        return getTempHelper(thermometer);
    }
    
    //원칙적으로는 문제 없음...
    public float getTempHelper(Thermometer thermometer) {
        return thermometer.getTemperature();
    }
}
```
