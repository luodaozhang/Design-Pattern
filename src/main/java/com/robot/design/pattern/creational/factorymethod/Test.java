package com.robot.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactor videoFactor = new JavaVideoFactor();
        videoFactor.makeVideo().getName();
    }

}
