package com.robot.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("java基础");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice(100);
        codingCourse.setName("Java设计模式");

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        courseList.forEach(e->{
            e.accept(new Visitor());
        });
    }

}
