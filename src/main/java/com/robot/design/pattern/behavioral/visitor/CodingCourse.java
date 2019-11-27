package com.robot.design.pattern.behavioral.visitor;

import lombok.Data;

@Data
public class CodingCourse extends Course {

    private int price;

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
