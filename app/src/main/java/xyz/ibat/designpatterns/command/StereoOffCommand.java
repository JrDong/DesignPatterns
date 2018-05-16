package xyz.ibat.designpatterns.command;

import xyz.ibat.designpatterns.command.switches.Stereo;

/**
 * Created by jerry on 2018/5/16.
 */

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
