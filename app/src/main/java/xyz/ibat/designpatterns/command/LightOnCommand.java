package xyz.ibat.designpatterns.command;

import xyz.ibat.designpatterns.command.switches.Light;

/**
 * Created by jerry on 2018/5/16.
 */

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
