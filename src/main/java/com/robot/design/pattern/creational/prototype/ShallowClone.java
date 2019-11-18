package com.robot.design.pattern.creational.prototype;

import java.util.Date;

public class ShallowClone implements Cloneable{

    public String name;

    public Date now;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
