package com.robot.design.pattern.behavioral.observer;

import lombok.Data;

import java.util.Observable;

@Data
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.courseName + "提出问题:" + question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }
}
