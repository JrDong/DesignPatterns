package xyz.ibat.designpatterns.template;

/**
 * Created by jerry on 2018/6/7.
 */

public abstract class CoffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customWantAddCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    boolean customWantAddCondiments(){
        return true;
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("pour into cup");
    }


}
