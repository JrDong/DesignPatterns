package xyz.ibat.designpatterns.decorator.decorator;

import xyz.ibat.designpatterns.decorator.beverage.Beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
