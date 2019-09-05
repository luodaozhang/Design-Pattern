package com.robot.design.pattern.creational.factorymethod;

public class JavaVideoFactor implements VideoFactor {
    public Video makeVideo() {
        return new JavaVideo();
    }
}
