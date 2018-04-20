package xyz.ibat.designpatterns.factory.newyork;

import xyz.ibat.designpatterns.factory.Pizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class NYStyleCheesePizza extends Pizza {

   public NYStyleCheesePizza(){
       name = "NY Style Sauce and Cheese Pizza";
       dough = "Thin Crust Dough";
       sauce = "Marinara Sauce";
       topping.add("Grated Reggiano Cheese");
   }
}
