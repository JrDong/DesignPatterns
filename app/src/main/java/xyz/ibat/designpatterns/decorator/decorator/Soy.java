package xyz.ibat.designpatterns.decorator.decorator;

import xyz.ibat.designpatterns.decorator.beverage.Beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.8 + beverage.cost();
    }
}
