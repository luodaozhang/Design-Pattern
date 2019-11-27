package com.robot.design.pattern.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Approver videoApprover = new VideoApprover();
        Approver articleApprover = new ArticleApprover();

        videoApprover.nextApprover(articleApprover);

        Course course = new Course("Robot设计模式","Robot视频教程", "Robot笔记");

        videoApprover.deploy(course);
   }
}
