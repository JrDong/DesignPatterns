package xyz.ibat.designpatterns.command;

import xyz.ibat.designpatterns.command.switches.CeilingFan;

/**
 * Created by jerry on 2018/5/16.
 */

public class CeilingFanMediumCommand implements Command {

    private CeilingFan ceilingFan;

    private int preSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
