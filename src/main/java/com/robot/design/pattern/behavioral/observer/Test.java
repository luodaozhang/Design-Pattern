package com.robot.design.pattern.behavioral.observer;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("robot1");
        Teacher teacher2 = new Teacher("robot2");
        Question question = new Question("同学A","Java八大数据类型");
        Course course = new Course("Java");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        course.produceQuestion(question);


    }

}
