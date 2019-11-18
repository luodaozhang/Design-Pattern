package com.robot.design.pattern.structural.decorator;

public class Test {

    public static void main(String[] args) {

        AbstractBattercake battercake = new Battercake();
        battercake = new EggBattercakeDecorator(battercake);
        battercake = new EggBattercakeDecorator(battercake);
        battercake = new SausageBattercakeDecorator(battercake);

        System.out.println(battercake.getCost());
        System.out.println(battercake.getDesc());

    }

}
