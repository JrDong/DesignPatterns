package xyz.ibat.designpatterns.factory.chicago;

import xyz.ibat.designpatterns.factory.Pizza;
import xyz.ibat.designpatterns.factory.PizzaStore;
import xyz.ibat.designpatterns.factory.newyork.NYStyleCheesePizza;
import xyz.ibat.designpatterns.factory.newyork.NYStyleClamPizza;
import xyz.ibat.designpatterns.factory.newyork.NYStyleVeggiePizza;

/**
 * Created by jerry on 2018/4/20.
 */

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (TYPE_CHEESE.equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        } else if (TYPE_CLAM.equals(type)){
            pizza = new ChicagoStyleClamPizza();
        } else if (TYPE_VEGGIE.equals(type)){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
