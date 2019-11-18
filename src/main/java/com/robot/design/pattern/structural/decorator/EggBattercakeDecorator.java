package com.robot.design.pattern.structural.decorator;

public class EggBattercakeDecorator extends AbstractBattercakeDecorator {

    public EggBattercakeDecorator(AbstractBattercake battercake) {
        super(battercake);
    }

    @Override
    String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    int getCost() {
        return super.getCost() + 1;
    }
}
