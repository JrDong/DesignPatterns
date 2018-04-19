package xyz.ibat.designpatterns.decorator;

import xyz.ibat.designpatterns.decorator.beverage.Beverage;
import xyz.ibat.designpatterns.decorator.beverage.DarkRoast;
import xyz.ibat.designpatterns.decorator.beverage.Espresso;
import xyz.ibat.designpatterns.decorator.beverage.HouseBlend;
import xyz.ibat.designpatterns.decorator.decorator.Mocha;
import xyz.ibat.designpatterns.decorator.decorator.Soy;
import xyz.ibat.designpatterns.decorator.decorator.Whip;

/**
 * Created by jerry on 2018/4/19.
 */

public class StarbuzzCoffee {


    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $ " + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $ " + houseBlend.cost());

    }

}
