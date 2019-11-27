package com.robot.design.pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseVideo {

    private String name;

    public void open(){
        System.out.println("打开" + name);
    }

    public void close(){
        System.out.println("关闭" + name);
    }
}
