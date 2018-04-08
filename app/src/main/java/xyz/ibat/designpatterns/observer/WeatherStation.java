package xyz.ibat.designpatterns.observer;

/**
 * Created by jerry on 2018/4/8.
 */

public class WeatherStation {


    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 50, 29.2f);
    }

}
