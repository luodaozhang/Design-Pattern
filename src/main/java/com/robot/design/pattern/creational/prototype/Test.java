package com.robot.design.pattern.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone javaVideo = new ShallowClone();
        Object clone = javaVideo.clone();
    }

}
