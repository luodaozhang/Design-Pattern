package com.robot.design.pattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;

    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }
}
