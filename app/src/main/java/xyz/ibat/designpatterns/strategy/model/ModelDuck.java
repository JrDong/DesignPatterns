package xyz.ibat.designpatterns.strategy.model;

import xyz.ibat.designpatterns.strategy.base.Duck;
import xyz.ibat.designpatterns.strategy.normal.NormalDuck;

/**
 * Created by jerry on 2018/4/3.
 */

public class ModelDuck extends Duck {

    public ModelDuck(){
        setFlyBehavior(new ModelFlyBehavior());
        setQuackBehavior(new ModelQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am a model duck！");
    }

    public static void main(String[] args){
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.quack();
        modelDuck.fly();
    }
}
