package xyz.ibat.designpatterns.decorator.beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
