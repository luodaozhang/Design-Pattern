package com.robot.design.pattern.creational.prototype;

import java.util.Date;

public class ShallowClone implements Cloneable{

    public String name;

    public Date now;

    public ShallowClone() {
        System.out.println("constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
