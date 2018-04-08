package xyz.ibat.designpatterns.observer.interfaces;


/**
 * Created by jerry on 2018/4/8.
 */

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
