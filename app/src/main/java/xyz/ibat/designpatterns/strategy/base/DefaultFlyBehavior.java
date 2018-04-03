package xyz.ibat.designpatterns.strategy.base;

/**
 * Created by jerry on 2018/4/3.
 */

public class DefaultFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

}
