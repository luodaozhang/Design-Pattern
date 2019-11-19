package com.robot.design.pattern.behavioral.templatemethod;

public class BECourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程的后端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }
}
