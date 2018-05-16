package xyz.ibat.designpatterns.command.loader;

import xyz.ibat.designpatterns.command.CeilingFanHighCommand;
import xyz.ibat.designpatterns.command.CeilingFanOffCommand;
import xyz.ibat.designpatterns.command.CeilingFanMediumCommand;
import xyz.ibat.designpatterns.command.RemoteControl;
import xyz.ibat.designpatterns.command.switches.CeilingFan;

/**
 * Created by jerry on 2018/5/16.
 */

public class CeilingFanRemoteLoader {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
