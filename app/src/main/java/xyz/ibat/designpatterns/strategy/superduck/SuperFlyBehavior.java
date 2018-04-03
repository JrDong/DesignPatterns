package xyz.ibat.designpatterns.strategy.superduck;

import xyz.ibat.designpatterns.strategy.base.FlyBehavior;

/**
 * Created by jerry on 2018/4/3.
 */

public class SuperFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }

}
