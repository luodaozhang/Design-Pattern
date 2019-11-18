package com.robot.design.pattern.structural.adapter;

public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output();
    }

}
