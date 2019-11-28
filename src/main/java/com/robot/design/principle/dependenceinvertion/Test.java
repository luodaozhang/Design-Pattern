package com.robot.design.principle.dependenceinvertion;

public class Test {
    public static void main(String[] args) {
        RobotStudy robotStudy = new RobotStudy(new JavaCourse());
        robotStudy.studyVideo();
    }
}
