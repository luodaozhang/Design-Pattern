package com.robot.design.pattern.behavioral.state;

public class PauseState extends CourseVideoState {

    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    void pause() {
        System.out.println("当前暂停状态!");
    }

    @Override
    void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
