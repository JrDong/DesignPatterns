package xyz.ibat.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2018/4/20.
 */

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> topping = new ArrayList<>();

    void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding topping: " );
        for (int i = 0; i < topping.size() ; i++){
            System.out.println(" " + topping.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    String getName(){
        return name;
    }

}
