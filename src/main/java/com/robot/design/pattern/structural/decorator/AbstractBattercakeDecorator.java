package com.robot.design.pattern.structural.decorator;

public abstract class AbstractBattercakeDecorator extends AbstractBattercake{

    private AbstractBattercake battercake;

    public AbstractBattercakeDecorator(AbstractBattercake battercake) {
        this.battercake = battercake;
    }

    @Override
    String getDesc() {
        return battercake.getDesc();
    }

    @Override
    int getCost() {
        return battercake.getCost();
    }
}
