package com.robot.design.pattern.behavioral.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("收费课程:" + codingCourse.getName() + "价格" + codingCourse.getPrice());
    }
}
