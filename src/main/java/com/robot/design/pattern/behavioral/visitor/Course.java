package com.robot.design.pattern.behavioral.visitor;

import lombok.Data;

@Data
public abstract class Course {
    private String name;

    abstract void accept(IVisitor visitor);
}
