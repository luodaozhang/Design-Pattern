package com.robot.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(this.teacherName + "的课程" + course.getCourseName() + "收到问题" + question.getQuestionContent());
    }
}
