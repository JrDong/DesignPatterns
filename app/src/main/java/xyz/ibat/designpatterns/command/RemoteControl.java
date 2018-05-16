package xyz.ibat.designpatterns.command;

/**
 * Created by jerry on 2018/5/16.
 */

public class RemoteControl {

    private static final int COMMAND_COUNT = 7;

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public RemoteControl(){
        onCommands = new Command[COMMAND_COUNT];
        offCommands = new Command[COMMAND_COUNT];

        Command noCommand = new NoCommand();
        for (int i = 0; i < COMMAND_COUNT; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if (slot >= COMMAND_COUNT){
            return;
        }
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------- Remote Control -------\n");
        for (int i = 0; i< onCommands.length; i++){
            builder.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
            "   " + offCommands[i].getClass().getName() + "\n");
        }
        builder.append("undoCommand " + undoCommand.getClass().getName() + "\n");
        return builder.toString();
    }
}
