package observer_pattern.displays;

import observer_pattern.DisplayElement;
import observer_pattern.Observer;
import observer_pattern.Subject;

public class StatisticsDisplay extends HeatIndex implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private float heatindex;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatindex = this.computeHeatIndex(temperature, humidity);
        display();
    }

    public void display() {
        System.out.println("Statistics display: temperature" + temperature + ", humidity: " + humidity + ", pressure: " + pressure + ", heatindex: " + heatindex);
    }
}
