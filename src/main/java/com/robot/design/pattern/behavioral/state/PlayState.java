package com.robot.design.pattern.behavioral.state;

public class PlayState extends CourseVideoState {

    @Override
    void play() {
        System.out.println("正常播放视频状态!");
    }

    @Override
    void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
