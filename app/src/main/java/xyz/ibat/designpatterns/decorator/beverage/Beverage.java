package xyz.ibat.designpatterns.decorator.beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public abstract class Beverage {

    String description = "Unknow Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();


}
