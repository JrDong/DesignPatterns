package xyz.ibat.designpatterns.factory.newyork;

import xyz.ibat.designpatterns.factory.Pizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza(){
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Potato";
        topping.add("vegetables");
    }
}
