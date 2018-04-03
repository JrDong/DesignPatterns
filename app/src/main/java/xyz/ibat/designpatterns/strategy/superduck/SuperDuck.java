package xyz.ibat.designpatterns.strategy.superduck;

import xyz.ibat.designpatterns.strategy.base.Duck;

/**
 * Created by jerry on 2018/4/3.
 */

public class SuperDuck extends Duck {

    public SuperDuck(){
        setFlyBehavior(new SuperFlyBehavior());
        setQuackBehavior(new SuperQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am look like superman!");
    }

    public static void main(String[] args){
        Duck superDuck = new SuperDuck();
        superDuck.display();
        superDuck.swim();
        superDuck.quack();
        superDuck.fly();
    }
}
