package xyz.ibat.designpatterns.strategy.normal;

import xyz.ibat.designpatterns.strategy.base.Duck;

/**
 * Created by jerry on 2018/4/3.
 */

public class NormalDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I am a real duck");
    }

    public static void main(String[] args){
        Duck normalDuck = new NormalDuck();
        normalDuck.display();
        normalDuck.swim();
        normalDuck.quack();
        normalDuck.fly();
    }

}
