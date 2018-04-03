package xyz.ibat.designpatterns.strategy.model;

import xyz.ibat.designpatterns.strategy.base.QuackBehavior;

/**
 * Created by jerry on 2018/4/3.
 */

public class ModelQuackBehavior implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("I can not quack!");
    }
}
