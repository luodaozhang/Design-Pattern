package com.robot.design.pattern.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        JavaVideo javaVideo = new JavaVideo();
        Object clone = javaVideo.clone();
    }

}
