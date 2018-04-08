package xyz.ibat.designpatterns.observer;

import xyz.ibat.designpatterns.observer.interfaces.DisplayElement;
import xyz.ibat.designpatterns.observer.interfaces.Observer;
import xyz.ibat.designpatterns.observer.interfaces.Subject;

/**
 * Created by jerry on 2018/4/8.
 */

public class CurrentConditionsDisplay implements Observer ,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
