package xyz.ibat.designpatterns.factory.chicago;

import xyz.ibat.designpatterns.factory.Pizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";
        topping.add("Shredded Mozzarella Cheese");
    }

}
