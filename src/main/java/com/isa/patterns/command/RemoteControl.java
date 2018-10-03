package com.isa.patterns.command;

import java.util.LinkedList;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private LinkedList<Command> undoStack;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoStack = new LinkedList<>();
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot > onCommands.length) {
            return;
        }

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoStack.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoStack.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
        }
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < onCommands.length; i++) {
            buffer
                    .append(onCommands[i].getClass().getName())
                    .append(" - ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }

        return buffer.toString();
    }
}
