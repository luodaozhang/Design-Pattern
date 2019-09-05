package com.robot.design.pattern.creational.factorymethod;

public class PythonVideoFactor implements VideoFactor {
    public Video makeVideo() {
        return new PythonVideo();
    }
}
