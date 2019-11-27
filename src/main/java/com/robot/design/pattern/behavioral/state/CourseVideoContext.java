package com.robot.design.pattern.behavioral.state;

public class CourseVideoContext {
    private CourseVideoState courseVideoState;

    public static final CourseVideoState PLAY_STATE = new PlayState();
    public static final CourseVideoState STOP_STATE = new StopState();
    public static final CourseVideoState PAUSE_STATE = new PauseState();
    public static final CourseVideoState SPEED_STATE = new SpeedState();

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        courseVideoState.setCourseVideoContext(this);
    }

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}
