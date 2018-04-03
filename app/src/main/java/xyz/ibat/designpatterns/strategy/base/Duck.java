package xyz.ibat.designpatterns.strategy.base;

/**
 * Created by jerry on 2018/4/3.
 *
 * 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，
 * 让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 */

public abstract class Duck {

    private FlyBehavior mFlyBehavior;

    private QuackBehavior mQuackBehavior;

    public Duck(){
        mFlyBehavior = new DefaultFlyBehavior();
        mQuackBehavior = new DefaultQuackBehavior();
    }

    public abstract void display();

    public void swim(){
        System.out.println("all ducks can swimming");
    }

    public void fly(){
        mFlyBehavior.fly();
    }

    public void quack(){
        mQuackBehavior.quack();
    }

    protected void setFlyBehavior(FlyBehavior flyBehavior){
        mFlyBehavior = flyBehavior;
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior){
        mQuackBehavior = quackBehavior;
    }

}
