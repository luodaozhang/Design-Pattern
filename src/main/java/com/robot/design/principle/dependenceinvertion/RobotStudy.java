package com.robot.design.principle.dependenceinvertion;

public class RobotStudy {

    private ICourse iCourse;

    public RobotStudy(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyVideo(){
        iCourse.studyCourse();
    }
}
