package xyz.ibat.designpatterns.factory;

import javax.xml.transform.Source;

import xyz.ibat.designpatterns.factory.chicago.ChicagoPizzaStore;
import xyz.ibat.designpatterns.factory.newyork.NYPizzaStore;

/**
 * Created by jerry on 2018/4/20.
 */

public class PizzaTestDrive {


    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza(PizzaStore.TYPE_CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName());
        pizza = chicagoPizzaStore.orderPizza(PizzaStore.TYPE_VEGGIE);
        System.out.println("Joel ordered a " + pizza.getName());
    }


}
