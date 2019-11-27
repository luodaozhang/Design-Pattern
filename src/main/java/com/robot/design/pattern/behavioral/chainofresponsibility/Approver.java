package com.robot.design.pattern.behavioral.chainofresponsibility;

public abstract class Approver {

    protected Approver approver;

    public abstract void deploy(Course course);

    public void nextApprover(Approver approver){
        this.approver = approver;
    }

}
