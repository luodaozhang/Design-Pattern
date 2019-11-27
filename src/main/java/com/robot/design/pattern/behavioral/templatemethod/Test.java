package com.robot.design.pattern.behavioral.templatemethod;

public class Test {

    public static void main(String[] args) {
        ACourse beCourse = new BECourse();
        ACourse feCourse = new FECourse(true);

        beCourse.makeCourse();
        feCourse.makeCourse();

    }

}
