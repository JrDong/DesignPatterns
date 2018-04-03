package xyz.ibat.designpatterns.strategy.superduck;

import xyz.ibat.designpatterns.strategy.base.QuackBehavior;

/**
 * Created by jerry on 2018/4/3.
 */

public class SuperQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can speaking English");
    }

}
