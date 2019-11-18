package com.robot.design.pattern.structural.decorator;

public class Battercake extends AbstractBattercake {

    @Override
    String getDesc() {
        return "煎饼";
    }

    @Override
    int getCost() {
        return 8;
    }
}
