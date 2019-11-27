package com.robot.design.pattern.behavioral.state;

public class StopState extends CourseVideoState {

    @Override
    void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    void speed() {
        System.out.println("ERROR 停止不能加速!");
    }

    @Override
    void pause() {
        System.out.println("ERROR 停止不能暂停!");
    }

    @Override
    void stop() {
        System.out.println("当前停止状态!");
    }
}
