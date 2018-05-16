package xyz.ibat.designpatterns.command.switches;

/**
 * Created by jerry on 2018/5/16.
 */

public class Light implements Switch {

    private String from;

    public Light(String from){
        this.from = from;
    }


    @Override
    public void on() {
        System.out.println(from + " Light is on");
    }

    @Override
    public void off() {
        System.out.println(from + " Light is off");
    }
}
