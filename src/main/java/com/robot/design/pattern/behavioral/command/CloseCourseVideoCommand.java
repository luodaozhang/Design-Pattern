package com.robot.design.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    @Override
    public void execute() {
        courseVideo.close();
    }
}
