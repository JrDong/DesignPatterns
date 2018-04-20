package xyz.ibat.designpatterns.factory;

/**
 * Created by jerry on 2018/4/20.
 */

public abstract class PizzaStore {

    public static final String TYPE_CHEESE = "type_cheese";
    public static final String TYPE_CLAM = "type_clam";
    public static final String TYPE_VEGGIE = "type_veggie";

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    public abstract Pizza createPizza(String type);

}
