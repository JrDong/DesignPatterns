package xyz.ibat.designpatterns.strategy.model;

import xyz.ibat.designpatterns.strategy.base.FlyBehavior;

/**
 * Created by jerry on 2018/4/3.
 */

public class ModelFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can not flying");
    }

}
