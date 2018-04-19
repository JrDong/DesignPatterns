package xyz.ibat.designpatterns.decorator.decorator;

import xyz.ibat.designpatterns.decorator.beverage.Beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
