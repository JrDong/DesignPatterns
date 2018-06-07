package xyz.ibat.designpatterns.template;

/**
 * Created by jerry on 2018/6/7.
 */

public class Tea extends CoffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
