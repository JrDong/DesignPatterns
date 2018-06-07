package xyz.ibat.designpatterns.template;

/**
 * Created by jerry on 2018/6/7.
 */

public class BeverageStore {

    public static void main(String[] args){
        CoffeineBeverage tea = new Tea();
        CoffeineBeverage coffee = new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }

}
