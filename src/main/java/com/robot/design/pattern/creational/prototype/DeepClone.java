package com.robot.design.pattern.creational.prototype;

import java.util.Date;

public class DeepClone implements Cloneable{

    public String name;

    public Date now;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone obj = (DeepClone) super.clone();
        obj.now = (Date) obj.now.clone();
        return obj;
    }

}
