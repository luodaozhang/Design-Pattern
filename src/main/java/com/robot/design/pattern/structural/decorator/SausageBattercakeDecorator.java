package com.robot.design.pattern.structural.decorator;

public class SausageBattercakeDecorator extends AbstractBattercakeDecorator {

    public SausageBattercakeDecorator(AbstractBattercake battercake) {
        super(battercake);
    }

    @Override
    String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    int getCost() {
        return super.getCost() + 2;
    }
}
