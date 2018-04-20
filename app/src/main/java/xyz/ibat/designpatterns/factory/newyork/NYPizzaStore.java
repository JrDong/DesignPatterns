package xyz.ibat.designpatterns.factory.newyork;

import xyz.ibat.designpatterns.factory.Pizza;
import xyz.ibat.designpatterns.factory.PizzaStore;

/**
 * Created by jerry on 2018/4/20.
 */

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (TYPE_CHEESE.equals(type)){
            pizza = new NYStyleCheesePizza();
        } else if (TYPE_CLAM.equals(type)){
            pizza = new NYStyleClamPizza();
        } else if (TYPE_VEGGIE.equals(type)){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
