package xyz.ibat.designpatterns.decorator.beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
