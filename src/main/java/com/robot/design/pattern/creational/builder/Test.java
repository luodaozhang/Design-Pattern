package com.robot.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseArticle("java")
                .buildCourseName("基本数据类型")
                .buildCoursePPT("javaPPT")
                .buildCourseQA("javaQA")
                .buildCourseTeacher("robot")
                .build();
        System.out.println(course);
    }
}
