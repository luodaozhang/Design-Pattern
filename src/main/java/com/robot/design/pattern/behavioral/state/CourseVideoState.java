package com.robot.design.pattern.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    abstract void play();

    abstract void speed();

    abstract void pause();

    abstract void stop();

}
