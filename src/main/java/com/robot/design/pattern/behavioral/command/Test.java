package com.robot.design.pattern.behavioral.command;

public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Robot视频教程");
        Command closeCommand = new CloseCourseVideoCommand(courseVideo);
        Command openCommand = new OpenCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(closeCommand);
        staff.addCommand(openCommand);

        staff.executeCommands();
    }
}
