package xyz.ibat.designpatterns.factory.chicago;

import xyz.ibat.designpatterns.factory.Pizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Potato";
        topping.add("vegetables");
    }
}
