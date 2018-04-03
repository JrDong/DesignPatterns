package xyz.ibat.designpatterns.strategy.base;

/**
 * Created by jerry on 2018/4/3.
 */

public class DefaultQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("ga ga ga");
    }

}
