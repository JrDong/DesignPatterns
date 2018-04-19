package xyz.ibat.designpatterns.decorator.beverage;

/**
 * Created by jerry on 2018/4/19.
 */

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.66;
    }
}
