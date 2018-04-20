package xyz.ibat.designpatterns.factory.newyork;

import xyz.ibat.designpatterns.factory.Pizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza(){
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Clam");
    }

}
