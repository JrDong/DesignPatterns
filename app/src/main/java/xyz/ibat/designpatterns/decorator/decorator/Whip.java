package xyz.ibat.designpatterns.decorator.decorator;

import xyz.ibat.designpatterns.decorator.beverage.Beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
