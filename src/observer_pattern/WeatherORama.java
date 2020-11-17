package observer_pattern;

import observer_pattern.displays.CurrentConditionDisplay;
import observer_pattern.displays.StatisticsDisplay;

public class WeatherORama {

    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(25, 65,30);
        weatherData.setMeasurements(28, 75,20);
    }
}
