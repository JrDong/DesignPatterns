package xyz.ibat.designpatterns.command;

import xyz.ibat.designpatterns.command.switches.Light;

/**
 * Created by jerry on 2018/5/16.
 */

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
