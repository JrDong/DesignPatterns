package xyz.ibat.designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jerry on 2018/6/7.
 */

public class Coffee extends CoffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Suger and Milk");
    }

    @Override
    boolean customWantAddCondiments() {
        return "y".equalsIgnoreCase(getUserInput());
    }

    private String getUserInput() {
        String answer = "n";
        System.out.println("Would you like milk and suger with your coffee ? (y/n)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            System.err.println("IO error");
        }
        return answer;
    }
}
