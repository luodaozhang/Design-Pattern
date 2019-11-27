package com.robot.design.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    @Override
    public void execute() {
        courseVideo.open();
    }
}
