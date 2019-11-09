package com.robot.design.pattern.creational.singleton;

import lombok.Data;

@Data
public class Student {

    private Integer score;

    public Student(){
        System.out.println("test");
    }

}
