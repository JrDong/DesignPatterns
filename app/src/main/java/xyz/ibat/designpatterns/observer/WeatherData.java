package xyz.ibat.designpatterns.observer;


import java.util.ArrayList;
import java.util.List;

import xyz.ibat.designpatterns.observer.interfaces.Observer;
import xyz.ibat.designpatterns.observer.interfaces.Subject;

/**
 * Created by jerry on 2018/4/8.
 */

public class WeatherData implements Subject {

    private List<Observer> mObservers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = mObservers.indexOf(observer);
        if (i > 0){
            mObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
