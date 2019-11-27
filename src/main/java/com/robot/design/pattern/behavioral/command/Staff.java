package com.robot.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private final List<Command> COMMAND_LIST = new ArrayList<>();

    public void addCommand(Command command){
        COMMAND_LIST.add(command);
    }

    public void executeCommands(){
        COMMAND_LIST.forEach(e->{
            e.execute();
        });
    }

}
