package xyz.ibat.designpatterns.command.loader;

import xyz.ibat.designpatterns.command.LightOffCommand;
import xyz.ibat.designpatterns.command.LightOnCommand;
import xyz.ibat.designpatterns.command.RemoteControl;
import xyz.ibat.designpatterns.command.StereoOffCommand;
import xyz.ibat.designpatterns.command.StereoOnCommand;
import xyz.ibat.designpatterns.command.switches.Light;
import xyz.ibat.designpatterns.command.switches.Stereo;

/**
 * Created by jerry on 2018/5/16.
 */

public class RemoteLoader {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOffCommand = new LightOffCommand(kitchenLight);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomOnCommand, livingRoomOffCommand);
        remoteControl.setCommand(1, kitchenOnCommand, kitchenOffCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);



    }

}
