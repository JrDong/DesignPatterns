package xyz.ibat.designpatterns.factory.chicago;

import xyz.ibat.designpatterns.factory.Pizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza(){
        name = "Chicago Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";
        topping.add("Clam");
    }
}
