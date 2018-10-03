package com.isa.patterns.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("None");
    }

    @Override
    public void undo() {
        System.out.println("None");
    }
}
