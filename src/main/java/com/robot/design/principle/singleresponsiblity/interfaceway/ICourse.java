package com.robot.design.principle.singleresponsiblity.interfaceway;


public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
