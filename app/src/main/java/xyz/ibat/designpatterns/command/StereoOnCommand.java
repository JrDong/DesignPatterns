package xyz.ibat.designpatterns.command;

import xyz.ibat.designpatterns.command.switches.Stereo;

/**
 * Created by jerry on 2018/5/16.
 */

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
